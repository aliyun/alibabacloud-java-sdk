// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchUndeployHttpApiRoutesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchUndeployHttpApiRoutesResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static BatchUndeployHttpApiRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUndeployHttpApiRoutesResponseBody self = new BatchUndeployHttpApiRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUndeployHttpApiRoutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchUndeployHttpApiRoutesResponseBody setData(BatchUndeployHttpApiRoutesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchUndeployHttpApiRoutesResponseBodyData getData() {
        return this.data;
    }

    public BatchUndeployHttpApiRoutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchUndeployHttpApiRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchUndeployHttpApiRoutesResponseBodyData extends TeaModel {
        @NameInMap("failedCount")
        public Integer failedCount;

        @NameInMap("results")
        public java.util.Map<String, DataResultsValue> results;

        @NameInMap("skippedCount")
        public Integer skippedCount;

        @NameInMap("successCount")
        public Integer successCount;

        public static BatchUndeployHttpApiRoutesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchUndeployHttpApiRoutesResponseBodyData self = new BatchUndeployHttpApiRoutesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchUndeployHttpApiRoutesResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public BatchUndeployHttpApiRoutesResponseBodyData setResults(java.util.Map<String, DataResultsValue> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, DataResultsValue> getResults() {
            return this.results;
        }

        public BatchUndeployHttpApiRoutesResponseBodyData setSkippedCount(Integer skippedCount) {
            this.skippedCount = skippedCount;
            return this;
        }
        public Integer getSkippedCount() {
            return this.skippedCount;
        }

        public BatchUndeployHttpApiRoutesResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
