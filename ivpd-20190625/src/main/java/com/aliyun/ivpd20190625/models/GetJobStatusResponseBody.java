// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetJobStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetJobStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusResponseBody self = new GetJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobStatusResponseBody setData(GetJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobStatusResponseBodyData getData() {
        return this.data;
    }

    public GetJobStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobStatusResponseBodyData extends TeaModel {
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

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeToLive")
        public Integer timeToLive;

        @NameInMap("TotalUsedTime")
        public Long totalUsedTime;

        public static GetJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusResponseBodyData self = new GetJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobStatusResponseBodyData setBatchSize(String batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public String getBatchSize() {
            return this.batchSize;
        }

        public GetJobStatusResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetJobStatusResponseBodyData setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetJobStatusResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetJobStatusResponseBodyData setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public GetJobStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobStatusResponseBodyData setTimeToLive(Integer timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }
        public Integer getTimeToLive() {
            return this.timeToLive;
        }

        public GetJobStatusResponseBodyData setTotalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }
        public Long getTotalUsedTime() {
            return this.totalUsedTime;
        }

    }

}
