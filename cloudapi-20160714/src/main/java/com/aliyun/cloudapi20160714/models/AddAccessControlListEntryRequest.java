// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddAccessControlListEntryRequest extends TeaModel {
    /**
     * <p>The ACL settings.</p>
     * <ul>
     * <li>entry: the entries that you want to add to the ACL. You can add CIDR blocks. Separate multiple CIDR blocks with commas (,).</li>
     * <li>comment: the description of the ACL.</li>
     * </ul>
     * <blockquote>
     * <p>You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;entry\&quot;: \&quot;192.168.1.0/24\&quot;, \&quot;comment\&quot;: \&quot;test\&quot;}]</p>
     */
    @NameInMap("AclEntrys")
    public String aclEntrys;

    /**
     * <p>The ID of the access control list (ACL).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-bp1ohqkonqybecf4llbrc</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddAccessControlListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAccessControlListEntryRequest self = new AddAccessControlListEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddAccessControlListEntryRequest setAclEntrys(String aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public String getAclEntrys() {
        return this.aclEntrys;
    }

    public AddAccessControlListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddAccessControlListEntryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
