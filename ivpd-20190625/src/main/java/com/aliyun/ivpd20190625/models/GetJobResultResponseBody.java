// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetJobResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetJobResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultResponseBody self = new GetJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobResultResponseBody setData(GetJobResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobResultResponseBodyData getData() {
        return this.data;
    }

    public GetJobResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobResultResponseBodyData extends TeaModel {
        @NameInMap("BatchSize")
        public String batchSize;

        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("Finish")
        public Boolean finish;

        @NameInMap("Message")
        public String message;

        @NameInMap("Progress")
        public Float progress;

        @NameInMap("ResultList")
        public java.util.List<java.util.Map<String, ?>> resultList;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalUsedTime")
        public Long totalUsedTime;

        public static GetJobResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobResultResponseBodyData self = new GetJobResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobResultResponseBodyData setBatchSize(String batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public String getBatchSize() {
            return this.batchSize;
        }

        public GetJobResultResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetJobResultResponseBodyData setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetJobResultResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetJobResultResponseBodyData setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public GetJobResultResponseBodyData setResultList(java.util.List<java.util.Map<String, ?>> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResultList() {
            return this.resultList;
        }

        public GetJobResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResultResponseBodyData setTotalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }
        public Long getTotalUsedTime() {
            return this.totalUsedTime;
        }

    }

}
