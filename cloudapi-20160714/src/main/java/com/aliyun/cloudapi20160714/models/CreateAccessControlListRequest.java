// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAccessControlListRequest extends TeaModel {
    /**
     * <p>The name of the ACL. The name must be 1 to 30 characters in length, and can contain letters, digits, periods (.), hyphens (-), forward slashes (/), and underscores (_). The name must be unique within the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testAcl</p>
     */
    @NameInMap("AclName")
    public String aclName;

    /**
     * <p>The IP protocol version of the ACL. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong></li>
     * <li><strong>IPv6</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateAccessControlListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListRequest self = new CreateAccessControlListRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListRequest setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public CreateAccessControlListRequest setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public CreateAccessControlListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
