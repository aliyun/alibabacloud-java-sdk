// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can troubleshoot issues based on the ID.</p>
     */
    @NameInMap("Data")
    public Long data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the deployment task. The ID is used as the value of a specific request parameter when you call the [GetDeployment](https://help.aliyun.com/document_detail/173950.html) operation to query the details of the deployment task.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFileResponseBody self = new SubmitFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFileResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public SubmitFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SubmitFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
