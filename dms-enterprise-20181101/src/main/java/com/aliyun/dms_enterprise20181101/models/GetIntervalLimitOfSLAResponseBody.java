// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetIntervalLimitOfSLAResponseBody extends TeaModel {
    /**
     * <p>GetIntervalLimitOfSLA</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IntervalLimit")
    public Integer intervalLimit;

    /**
     * <p>Queries the minimum scheduling cycle of a task flow when a service level agreement (SLA) timeout rule is configured for the task flow.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetIntervalLimitOfSLAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntervalLimitOfSLAResponseBody self = new GetIntervalLimitOfSLAResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntervalLimitOfSLAResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetIntervalLimitOfSLAResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetIntervalLimitOfSLAResponseBody setIntervalLimit(Integer intervalLimit) {
        this.intervalLimit = intervalLimit;
        return this;
    }
    public Integer getIntervalLimit() {
        return this.intervalLimit;
    }

    public GetIntervalLimitOfSLAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIntervalLimitOfSLAResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
