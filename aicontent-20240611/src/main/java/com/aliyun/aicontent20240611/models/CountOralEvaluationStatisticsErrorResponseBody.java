// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsErrorResponseBody extends TeaModel {
    /**
     * <p>An array containing the error statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<OralEvaluationStatisticsErrorCountResponse> data;

    /**
     * <p>The error code returned if the request fails. This parameter is returned only when <code>success</code> is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned if the request fails. This parameter is returned only when <code>success</code> is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p><code>true</code> if the request succeeded; <code>false</code> otherwise.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CountOralEvaluationStatisticsErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsErrorResponseBody self = new CountOralEvaluationStatisticsErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsErrorResponseBody setData(java.util.List<OralEvaluationStatisticsErrorCountResponse> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OralEvaluationStatisticsErrorCountResponse> getData() {
        return this.data;
    }

    public CountOralEvaluationStatisticsErrorResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CountOralEvaluationStatisticsErrorResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CountOralEvaluationStatisticsErrorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CountOralEvaluationStatisticsErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountOralEvaluationStatisticsErrorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
