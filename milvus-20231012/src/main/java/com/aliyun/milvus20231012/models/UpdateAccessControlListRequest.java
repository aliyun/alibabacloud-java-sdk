// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateAccessControlListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acl-123xxx</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <strong>example:</strong>
     * <p>192.168.1.0/24,172.16.0.0/16</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
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
