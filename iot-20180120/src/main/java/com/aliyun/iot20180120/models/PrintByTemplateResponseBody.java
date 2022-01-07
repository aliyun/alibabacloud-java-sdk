// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PrintByTemplateResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PrintByTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrintByTemplateResponseBody self = new PrintByTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public PrintByTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PrintByTemplateResponseBody setData(PrintByTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PrintByTemplateResponseBodyData getData() {
        return this.data;
    }

    public PrintByTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PrintByTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrintByTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PrintByTemplateResponseBodyData extends TeaModel {
        @NameInMap("DeviceErrorCode")
        public String deviceErrorCode;

        @NameInMap("DeviceErrorMessage")
        public String deviceErrorMessage;

        @NameInMap("Id")
        public String id;

        @NameInMap("MaxRetryCount")
        public Integer maxRetryCount;

        @NameInMap("RetryCount")
        public Integer retryCount;

        @NameInMap("Success")
        public Boolean success;

        public static PrintByTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrintByTemplateResponseBodyData self = new PrintByTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrintByTemplateResponseBodyData setDeviceErrorCode(String deviceErrorCode) {
            this.deviceErrorCode = deviceErrorCode;
            return this;
        }
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        public PrintByTemplateResponseBodyData setDeviceErrorMessage(String deviceErrorMessage) {
            this.deviceErrorMessage = deviceErrorMessage;
            return this;
        }
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

        public PrintByTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PrintByTemplateResponseBodyData setMaxRetryCount(Integer maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
            return this;
        }
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public PrintByTemplateResponseBodyData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public PrintByTemplateResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
