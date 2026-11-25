// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeleteHttpApiRoutesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchDeleteHttpApiRoutesResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static BatchDeleteHttpApiRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteHttpApiRoutesResponseBody self = new BatchDeleteHttpApiRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteHttpApiRoutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteHttpApiRoutesResponseBody setData(BatchDeleteHttpApiRoutesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeleteHttpApiRoutesResponseBodyData getData() {
        return this.data;
    }

    public BatchDeleteHttpApiRoutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteHttpApiRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchDeleteHttpApiRoutesResponseBodyData extends TeaModel {
        @NameInMap("failedCount")
        public Integer failedCount;

        @NameInMap("results")
        public java.util.Map<String, DataResultsValue> results;

        @NameInMap("successCount")
        public Integer successCount;

        public static BatchDeleteHttpApiRoutesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteHttpApiRoutesResponseBodyData self = new BatchDeleteHttpApiRoutesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeleteHttpApiRoutesResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public BatchDeleteHttpApiRoutesResponseBodyData setResults(java.util.Map<String, DataResultsValue> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, DataResultsValue> getResults() {
            return this.results;
        }

        public BatchDeleteHttpApiRoutesResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
