// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetRuleNumLimitOfSLAResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleNumLimit")
    public Integer ruleNumLimit;

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
