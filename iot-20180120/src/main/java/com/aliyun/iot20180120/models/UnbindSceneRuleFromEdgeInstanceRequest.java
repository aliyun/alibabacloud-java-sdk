// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindSceneRuleFromEdgeInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llL44UVXUqb9m5******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f041397879ad4d89822811d741******</p>
     */
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
