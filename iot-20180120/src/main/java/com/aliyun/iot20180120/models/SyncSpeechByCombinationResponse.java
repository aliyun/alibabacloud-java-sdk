// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SyncSpeechByCombinationResponse extends TeaModel {
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
    public SyncSpeechByCombinationResponseData data;

    public static SyncSpeechByCombinationResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncSpeechByCombinationResponse self = new SyncSpeechByCombinationResponse();
        return TeaModel.build(map, self);
    }

    public SyncSpeechByCombinationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncSpeechByCombinationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SyncSpeechByCombinationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncSpeechByCombinationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncSpeechByCombinationResponse setData(SyncSpeechByCombinationResponseData data) {
        this.data = data;
        return this;
    }
    public SyncSpeechByCombinationResponseData getData() {
        return this.data;
    }

    public static class SyncSpeechByCombinationResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("RetryCount")
        @Validation(required = true)
        public Integer retryCount;

        public static SyncSpeechByCombinationResponseData build(java.util.Map<String, ?> map) throws Exception {
            SyncSpeechByCombinationResponseData self = new SyncSpeechByCombinationResponseData();
            return TeaModel.build(map, self);
        }

        public SyncSpeechByCombinationResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SyncSpeechByCombinationResponseData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

    }

}
