// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetRuleNumLimitOfSLAResponseBody extends TeaModel {
    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request failed.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request. You can use the ID to locate logs and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The maximum number of SLA rules.
    @NameInMap("RuleNumLimit")
    public Integer ruleNumLimit;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetRuleNumLimitOfSLAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleNumLimitOfSLAResponseBody self = new GetRuleNumLimitOfSLAResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleNumLimitOfSLAResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRuleNumLimitOfSLAResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRuleNumLimitOfSLAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleNumLimitOfSLAResponseBody setRuleNumLimit(Integer ruleNumLimit) {
        this.ruleNumLimit = ruleNumLimit;
        return this;
    }
    public Integer getRuleNumLimit() {
        return this.ruleNumLimit;
    }

    public GetRuleNumLimitOfSLAResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
