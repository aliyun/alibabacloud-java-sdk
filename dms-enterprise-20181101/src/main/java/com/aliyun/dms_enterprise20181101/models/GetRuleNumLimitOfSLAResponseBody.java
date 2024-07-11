// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetRuleNumLimitOfSLAResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D05B3EE1-B6D3-5B17-8CA6-A8054828E5B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of SLA rules.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RuleNumLimit")
    public Integer ruleNumLimit;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
