// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public PrintByTemplateResponseData data;

    public static PrintByTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        PrintByTemplateResponse self = new PrintByTemplateResponse();
        return TeaModel.build(map, self);
    }

    public PrintByTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrintByTemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PrintByTemplateResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PrintByTemplateResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PrintByTemplateResponse setData(PrintByTemplateResponseData data) {
        this.data = data;
        return this;
    }
    public PrintByTemplateResponseData getData() {
        return this.data;
    }

    public static class PrintByTemplateResponseData extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("DeviceErrorCode")
        @Validation(required = true)
        public String deviceErrorCode;

        @NameInMap("DeviceErrorMessage")
        @Validation(required = true)
        public String deviceErrorMessage;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("RetryCount")
        @Validation(required = true)
        public Integer retryCount;

        @NameInMap("MaxRetryCount")
        @Validation(required = true)
        public Integer maxRetryCount;

        public static PrintByTemplateResponseData build(java.util.Map<String, ?> map) throws Exception {
            PrintByTemplateResponseData self = new PrintByTemplateResponseData();
            return TeaModel.build(map, self);
        }

        public PrintByTemplateResponseData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public PrintByTemplateResponseData setDeviceErrorCode(String deviceErrorCode) {
            this.deviceErrorCode = deviceErrorCode;
            return this;
        }
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        public PrintByTemplateResponseData setDeviceErrorMessage(String deviceErrorMessage) {
            this.deviceErrorMessage = deviceErrorMessage;
            return this;
        }
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

        public PrintByTemplateResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PrintByTemplateResponseData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public PrintByTemplateResponseData setMaxRetryCount(Integer maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
            return this;
        }
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

    }

}
