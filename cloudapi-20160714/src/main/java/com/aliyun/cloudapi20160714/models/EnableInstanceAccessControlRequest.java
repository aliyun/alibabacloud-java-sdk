// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class EnableInstanceAccessControlRequest extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AclType")
    public String aclType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableInstanceAccessControlRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceAccessControlRequest self = new EnableInstanceAccessControlRequest();
        return TeaModel.build(map, self);
    }

    public EnableInstanceAccessControlRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public EnableInstanceAccessControlRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public EnableInstanceAccessControlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
