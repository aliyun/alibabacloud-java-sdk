// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class LeaveSecurityGroupRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static LeaveSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        LeaveSecurityGroupRequest self = new LeaveSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public LeaveSecurityGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public LeaveSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public LeaveSecurityGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
