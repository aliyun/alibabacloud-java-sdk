// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class CreateSegmentBodyJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSegmentBodyJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSegmentBodyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSegmentBodyJobResponseBody self = new CreateSegmentBodyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSegmentBodyJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSegmentBodyJobResponseBody setData(CreateSegmentBodyJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSegmentBodyJobResponseBodyData getData() {
        return this.data;
    }

    public CreateSegmentBodyJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSegmentBodyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSegmentBodyJobResponseBodyDataResultListResultData extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static CreateSegmentBodyJobResponseBodyDataResultListResultData build(java.util.Map<String, ?> map) throws Exception {
            CreateSegmentBodyJobResponseBodyDataResultListResultData self = new CreateSegmentBodyJobResponseBodyDataResultListResultData();
            return TeaModel.build(map, self);
        }

        public CreateSegmentBodyJobResponseBodyDataResultListResultData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class CreateSegmentBodyJobResponseBodyDataResultList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ResultData")
        public CreateSegmentBodyJobResponseBodyDataResultListResultData resultData;

        @NameInMap("Success")
        public Boolean success;

        public static CreateSegmentBodyJobResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateSegmentBodyJobResponseBodyDataResultList self = new CreateSegmentBodyJobResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public CreateSegmentBodyJobResponseBodyDataResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateSegmentBodyJobResponseBodyDataResultList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CreateSegmentBodyJobResponseBodyDataResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateSegmentBodyJobResponseBodyDataResultList setResultData(CreateSegmentBodyJobResponseBodyDataResultListResultData resultData) {
            this.resultData = resultData;
            return this;
        }
        public CreateSegmentBodyJobResponseBodyDataResultListResultData getResultData() {
            return this.resultData;
        }

        public CreateSegmentBodyJobResponseBodyDataResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateSegmentBodyJobResponseBodyData extends TeaModel {
        @NameInMap("BatchSize")
        public Integer batchSize;

        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ResultList")
        public java.util.List<CreateSegmentBodyJobResponseBodyDataResultList> resultList;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalUsedTime")
        public Long totalUsedTime;

        public static CreateSegmentBodyJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSegmentBodyJobResponseBodyData self = new CreateSegmentBodyJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSegmentBodyJobResponseBodyData setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public CreateSegmentBodyJobResponseBodyData setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public CreateSegmentBodyJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateSegmentBodyJobResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreateSegmentBodyJobResponseBodyData setResultList(java.util.List<CreateSegmentBodyJobResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<CreateSegmentBodyJobResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public CreateSegmentBodyJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateSegmentBodyJobResponseBodyData setTotalUsedTime(Long totalUsedTime) {
            this.totalUsedTime = totalUsedTime;
            return this;
        }
        public Long getTotalUsedTime() {
            return this.totalUsedTime;
        }

    }

}
