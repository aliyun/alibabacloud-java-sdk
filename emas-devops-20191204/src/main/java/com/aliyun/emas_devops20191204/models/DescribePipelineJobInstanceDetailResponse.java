// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePipelineJobInstanceDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("StepDetails")
    @Validation(required = true)
    public java.util.List<DescribePipelineJobInstanceDetailResponseStepDetails> stepDetails;

    public static DescribePipelineJobInstanceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineJobInstanceDetailResponse self = new DescribePipelineJobInstanceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePipelineJobInstanceDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePipelineJobInstanceDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePipelineJobInstanceDetailResponse setStepDetails(java.util.List<DescribePipelineJobInstanceDetailResponseStepDetails> stepDetails) {
        this.stepDetails = stepDetails;
        return this;
    }
    public java.util.List<DescribePipelineJobInstanceDetailResponseStepDetails> getStepDetails() {
        return this.stepDetails;
    }

    public static class DescribePipelineJobInstanceDetailResponseStepDetails extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("JobInstanceId")
        @Validation(required = true)
        public String jobInstanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("LogFileUrl")
        @Validation(required = true)
        public String logFileUrl;

        public static DescribePipelineJobInstanceDetailResponseStepDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineJobInstanceDetailResponseStepDetails self = new DescribePipelineJobInstanceDetailResponseStepDetails();
            return TeaModel.build(map, self);
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setJobInstanceId(String jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public String getJobInstanceId() {
            return this.jobInstanceId;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePipelineJobInstanceDetailResponseStepDetails setLogFileUrl(String logFileUrl) {
            this.logFileUrl = logFileUrl;
            return this;
        }
        public String getLogFileUrl() {
            return this.logFileUrl;
        }

    }

}
