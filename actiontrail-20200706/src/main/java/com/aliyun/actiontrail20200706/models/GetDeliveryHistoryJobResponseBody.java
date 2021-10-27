// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDeliveryHistoryJobResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobStatus")
    public Integer jobStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public java.util.List<GetDeliveryHistoryJobResponseBodyStatus> status;

    @NameInMap("TrailName")
    public String trailName;

    @NameInMap("UpdatedTime")
    public String updatedTime;

    public static GetDeliveryHistoryJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryHistoryJobResponseBody self = new GetDeliveryHistoryJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryHistoryJobResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetDeliveryHistoryJobResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDeliveryHistoryJobResponseBody setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetDeliveryHistoryJobResponseBody setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public GetDeliveryHistoryJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeliveryHistoryJobResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetDeliveryHistoryJobResponseBody setStatus(java.util.List<GetDeliveryHistoryJobResponseBodyStatus> status) {
        this.status = status;
        return this;
    }
    public java.util.List<GetDeliveryHistoryJobResponseBodyStatus> getStatus() {
        return this.status;
    }

    public GetDeliveryHistoryJobResponseBody setTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }
    public String getTrailName() {
        return this.trailName;
    }

    public GetDeliveryHistoryJobResponseBody setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public static class GetDeliveryHistoryJobResponseBodyStatus extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public Integer status;

        public static GetDeliveryHistoryJobResponseBodyStatus build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryHistoryJobResponseBodyStatus self = new GetDeliveryHistoryJobResponseBodyStatus();
            return TeaModel.build(map, self);
        }

        public GetDeliveryHistoryJobResponseBodyStatus setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDeliveryHistoryJobResponseBodyStatus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
