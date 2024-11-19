// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DisableSceneRuleRequest extends TeaModel {
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
     * <p>fec565038d7544978d9aed5c1a******</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DisableSceneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneRuleRequest self = new DisableSceneRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DisableSceneRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
