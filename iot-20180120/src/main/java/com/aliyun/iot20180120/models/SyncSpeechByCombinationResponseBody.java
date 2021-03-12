// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SyncSpeechByCombinationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public SyncSpeechByCombinationResponseBodyData data;

    public static SyncSpeechByCombinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncSpeechByCombinationResponseBody self = new SyncSpeechByCombinationResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncSpeechByCombinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncSpeechByCombinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SyncSpeechByCombinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncSpeechByCombinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncSpeechByCombinationResponseBody setData(SyncSpeechByCombinationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncSpeechByCombinationResponseBodyData getData() {
        return this.data;
    }

    public static class SyncSpeechByCombinationResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("RetryCount")
        public Integer retryCount;

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

    }

}
