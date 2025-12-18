// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationByResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cr-2da35180a8d1008e****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <strong>example:</strong>
     * <p>A7A0FFF8-0B44-40C6-8BBF-3A185EFDF3F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartConfigRuleEvaluationByResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationByResourceResponseBody self = new StartConfigRuleEvaluationByResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationByResourceResponseBody setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartConfigRuleEvaluationByResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
