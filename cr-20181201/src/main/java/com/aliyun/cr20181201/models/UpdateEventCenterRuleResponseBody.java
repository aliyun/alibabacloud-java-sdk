// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateEventCenterRuleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>031572FA-7D8F-4C05-B790-1071E0E05DE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the event notification rule.</p>
     * 
     * <strong>example:</strong>
     * <p>crecr-n6pbhgjxt*****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static UpdateEventCenterRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventCenterRuleResponseBody self = new UpdateEventCenterRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventCenterRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateEventCenterRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEventCenterRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
