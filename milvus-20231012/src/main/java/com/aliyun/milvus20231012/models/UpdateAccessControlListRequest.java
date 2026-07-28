// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateAccessControlListRequest extends TeaModel {
    /**
     * <p>The public access control ID.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-123xxx</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code>/24,<code>172.1.**.**</code>/16</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-123xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateAccessControlListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessControlListRequest self = new UpdateAccessControlListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessControlListRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public UpdateAccessControlListRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public UpdateAccessControlListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
