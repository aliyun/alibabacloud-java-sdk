// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindSceneRuleToEdgeInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RuleId")
    public String ruleId;

    public static BindSceneRuleToEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSceneRuleToEdgeInstanceRequest self = new BindSceneRuleToEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindSceneRuleToEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindSceneRuleToEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindSceneRuleToEdgeInstanceRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
