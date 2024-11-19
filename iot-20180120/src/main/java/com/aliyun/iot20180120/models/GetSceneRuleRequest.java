// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSceneRuleRequest extends TeaModel {
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

    public static GetSceneRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneRuleRequest self = new GetSceneRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetSceneRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
