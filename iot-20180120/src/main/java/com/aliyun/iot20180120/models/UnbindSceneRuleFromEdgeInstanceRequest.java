// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindSceneRuleFromEdgeInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RuleId")
    public String ruleId;

    public static UnbindSceneRuleFromEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSceneRuleFromEdgeInstanceRequest self = new UnbindSceneRuleFromEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UnbindSceneRuleFromEdgeInstanceRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
