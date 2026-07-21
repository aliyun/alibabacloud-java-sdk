// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CountOralEvaluationStatisticsConcurrentResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<OralEvaluationStatisticsConcurrentCountResponse> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CountOralEvaluationStatisticsConcurrentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountOralEvaluationStatisticsConcurrentResponseBody self = new CountOralEvaluationStatisticsConcurrentResponseBody();
        return TeaModel.build(map, self);
    }

    public CountOralEvaluationStatisticsConcurrentResponseBody setData(java.util.List<OralEvaluationStatisticsConcurrentCountResponse> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OralEvaluationStatisticsConcurrentCountResponse> getData() {
        return this.data;
    }

    public CountOralEvaluationStatisticsConcurrentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CountOralEvaluationStatisticsConcurrentResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CountOralEvaluationStatisticsConcurrentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CountOralEvaluationStatisticsConcurrentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountOralEvaluationStatisticsConcurrentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
