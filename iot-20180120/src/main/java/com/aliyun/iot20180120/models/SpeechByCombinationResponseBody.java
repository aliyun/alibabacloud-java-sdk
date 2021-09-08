// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SpeechByCombinationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static SpeechByCombinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SpeechByCombinationResponseBody self = new SpeechByCombinationResponseBody();
        return TeaModel.build(map, self);
    }

    public SpeechByCombinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SpeechByCombinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SpeechByCombinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SpeechByCombinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class SyncSpeechByCombinationResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("RetryCount")
        public Integer retryCount;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("MaxRetryCount")
        public Integer maxRetryCount;

        @NameInMap("DeviceErrorCode")
        public String deviceErrorCode;

        @NameInMap("DeviceErrorMessage")
        public String deviceErrorMessage;

        public static SyncSpeechByCombinationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncSpeechByCombinationResponseBodyData self = new SyncSpeechByCombinationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncSpeechByCombinationResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SyncSpeechByCombinationResponseBodyData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public SyncSpeechByCombinationResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SyncSpeechByCombinationResponseBodyData setMaxRetryCount(Integer maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
            return this;
        }
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public SyncSpeechByCombinationResponseBodyData setDeviceErrorCode(String deviceErrorCode) {
            this.deviceErrorCode = deviceErrorCode;
            return this;
        }
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        public SyncSpeechByCombinationResponseBodyData setDeviceErrorMessage(String deviceErrorMessage) {
            this.deviceErrorMessage = deviceErrorMessage;
            return this;
        }
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

    }

}
