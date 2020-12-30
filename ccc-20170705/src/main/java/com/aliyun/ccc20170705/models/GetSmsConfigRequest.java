// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetSmsConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Scenario")
    public java.util.List<Integer> scenario;

    public static GetSmsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmsConfigRequest self = new GetSmsConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetSmsConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSmsConfigRequest setScenario(java.util.List<Integer> scenario) {
        this.scenario = scenario;
        return this;
    }
    public java.util.List<Integer> getScenario() {
        return this.scenario;
    }

}
