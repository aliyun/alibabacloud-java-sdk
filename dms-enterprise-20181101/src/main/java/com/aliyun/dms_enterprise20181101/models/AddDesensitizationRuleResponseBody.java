// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddDesensitizationRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The type of the masking algorithm.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("Success")
    public Boolean success;

    public static AddDesensitizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDesensitizationRuleResponseBody self = new AddDesensitizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDesensitizationRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddDesensitizationRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddDesensitizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDesensitizationRuleResponseBody setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public AddDesensitizationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
