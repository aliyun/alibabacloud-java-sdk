// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetIntervalLimitOfSLAResponseBody extends TeaModel {
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
     * <p>The minimum scheduling cycle. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("IntervalLimit")
    public Integer intervalLimit;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5B96E35F-A58E-5399-9041-09CF9A1E46EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
