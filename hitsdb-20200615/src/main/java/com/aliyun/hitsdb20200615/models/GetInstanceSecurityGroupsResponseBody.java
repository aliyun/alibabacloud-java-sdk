// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroups")
    public java.util.List<String> securityGroups;

    public static GetInstanceSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSecurityGroupsResponseBody self = new GetInstanceSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSecurityGroupsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSecurityGroupsResponseBody setSecurityGroups(java.util.List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

}
