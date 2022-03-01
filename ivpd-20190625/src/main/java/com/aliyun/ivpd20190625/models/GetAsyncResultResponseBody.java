// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetAsyncResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAsyncResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncResultResponseBody self = new GetAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAsyncResultResponseBody setData(GetAsyncResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsyncResultResponseBodyData getData() {
        return this.data;
    }

    public GetAsyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAsyncResultResponseBodyData extends TeaModel {
        @NameInMap("BatchSize")
        public String batchSize;

        @NameInMap("Code")
        public String code;

        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("Finish")
        public Boolean finish;

        @NameInMap("Message")
        public String message;

        @NameInMap("Progress")
        public Float progress;

        @NameInMap("Result")
        public java.util.Map<String, ?> result;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalUsedTime")
        public Long totalUsedTime;

        public static GetAsyncResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncResultResponseBodyData self = new GetAsyncResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsyncResultResponseBodyData setBatchSize(String batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public String getBatchSize() {
            return this.batchSize;
        }

        public GetAsyncResultResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAsyncResultResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetAsyncResultResponseBodyData setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetAsyncResultResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAsyncResultResponseBodyData setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public GetAsyncResultResponseBodyData setResult(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

        public GetAsyncResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAsyncResultResponseBodyData setTotalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }
        public Long getTotalUsedTime() {
            return this.totalUsedTime;
        }

    }

}
