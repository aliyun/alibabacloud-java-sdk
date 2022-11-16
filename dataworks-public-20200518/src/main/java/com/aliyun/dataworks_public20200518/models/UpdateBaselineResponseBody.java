// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("DynamicErrorCode")
    public String dynamicErrorCode;

    @NameInMap("DynamicErrorMessage")
    public String dynamicErrorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineResponseBody self = new UpdateBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateBaselineResponseBody setDynamicErrorCode(String dynamicErrorCode) {
        this.dynamicErrorCode = dynamicErrorCode;
        return this;
    }
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    public UpdateBaselineResponseBody setDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    public UpdateBaselineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateBaselineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateBaselineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBaselineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
