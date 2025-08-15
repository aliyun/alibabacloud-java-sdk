// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDeliveryHistoryJobResponseBody extends TeaModel {
    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-27T07:15:03Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The time when the task ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-27T07:20:03Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The home region of the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("HomeRegion")
    public String homeRegion;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>16602</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>0: The task is initializing.</li>
     * <li>1: The task is delivering historical events.</li>
     * <li>2: The task is complete.</li>
     * <li>3: The task fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("JobStatus")
    public Integer jobStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FAFEC427-A00D-5653-B837-D0FA52220D8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the task started.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-26T07:15:03Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>A list of task statuses in each region.</p>
     */
    @NameInMap("Status")
    public java.util.List<GetDeliveryHistoryJobResponseBodyStatus> status;

    /**
     * <p>The name of the trail based on which the task delivers events.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-name</p>
     */
    @NameInMap("TrailName")
    public String trailName;

    /**
     * <p>The time when the task was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-27T07:28:47Z</p>
     */
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

    public GetDeliveryHistoryJobResponseBody setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }
    public String getHomeRegion() {
        return this.homeRegion;
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
        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The task status in each region. Valid values:</p>
         * <ul>
         * <li>0: The task is initializing.</li>
         * <li>1: The task is delivering historical events.</li>
         * <li>2: The task is complete.</li>
         * <li>3: The task fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
