// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class EnableSceneRuleRequest extends TeaModel {
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

    public static EnableSceneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneRuleRequest self = new EnableSceneRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableSceneRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public EnableSceneRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
