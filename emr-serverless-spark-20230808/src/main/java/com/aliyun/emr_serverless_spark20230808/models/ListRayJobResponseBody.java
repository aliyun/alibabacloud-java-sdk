// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayJobResponseBody extends TeaModel {
    /**
     * <p>The list of Ray Jobs.</p>
     */
    @NameInMap("rayJobs")
    public java.util.List<ListRayJobResponseBodyRayJobs> rayJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListRayJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRayJobResponseBody self = new ListRayJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRayJobResponseBody setRayJobs(java.util.List<ListRayJobResponseBodyRayJobs> rayJobs) {
        this.rayJobs = rayJobs;
        return this;
    }
    public java.util.List<ListRayJobResponseBodyRayJobs> getRayJobs() {
        return this.rayJobs;
    }

    public ListRayJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRayJobResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRayJobResponseBodyRayJobs extends TeaModel {
        /**
         * <p>The status of the corresponding Ray cluster. Valid values:</p>
         * <ul>
         * <li>Deleted: deleted.</li>
         * <li>Submitted: submitted but not yet being created.</li>
         * <li>Pending: being created.</li>
         * <li>Running: running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("clusterState")
        public String clusterState;

        /**
         * <p>The nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The number of compute units (CUs) consumed during the job execution cycle. This value is an estimate. The actual value is subject to the bill.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("cuHours")
        public Double cuHours;

        /**
         * <p>The URL of the Ray cluster dashboard. When the Ray cluster is in the Running state, the URL points to the Runtime UI. After the cluster is in the Deleted state, the URL points to the History UI. The History UI is supported only in err-1.2.0 and later versions.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://emr-ray-gateway.aliyuncs.com?token=xxxxxxxxx">https://emr-ray-gateway.aliyuncs.com?token=xxxxxxxxx</a></p>
         */
        @NameInMap("dashboardUrl")
        public String dashboardUrl;

        /**
         * <p>The execution duration of the job. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3564</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The time when the job ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1776945509000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The name of the Ray Job.</p>
         * 
         * <strong>example:</strong>
         * <p>testRayJob</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The Ray DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>err-1.2.0 (Ray 2.55.1, Python 3.12)</p>
         */
        @NameInMap("resourceQueue")
        public String resourceQueue;

        /**
         * <p>The time when the job was started.</p>
         * 
         * <strong>example:</strong>
         * <p>1776945499000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Submitted: submitted.</li>
         * <li>Pending: the cluster is being created.</li>
         * <li>Running: the job is running.</li>
         * <li>Succeeded: the job succeeded.</li>
         * <li>Failed: the job failed.</li>
         * <li>Cancelling: the job is being canceled.</li>
         * <li>Cancelled: the job is canceled.</li>
         * <li>Timeout: the job timed out and was canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the Ray Job.</p>
         * 
         * <strong>example:</strong>
         * <p>rj-uiulpgow9xljimm1</p>
         */
        @NameInMap("submissionId")
        public String submissionId;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1776945399000</p>
         */
        @NameInMap("submitTime")
        public Long submitTime;

        public static ListRayJobResponseBodyRayJobs build(java.util.Map<String, ?> map) throws Exception {
            ListRayJobResponseBodyRayJobs self = new ListRayJobResponseBodyRayJobs();
            return TeaModel.build(map, self);
        }

        public ListRayJobResponseBodyRayJobs setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public ListRayJobResponseBodyRayJobs setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListRayJobResponseBodyRayJobs setCuHours(Double cuHours) {
            this.cuHours = cuHours;
            return this;
        }
        public Double getCuHours() {
            return this.cuHours;
        }

        public ListRayJobResponseBodyRayJobs setDashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        public ListRayJobResponseBodyRayJobs setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListRayJobResponseBodyRayJobs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListRayJobResponseBodyRayJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRayJobResponseBodyRayJobs setResourceQueue(String resourceQueue) {
            this.resourceQueue = resourceQueue;
            return this;
        }
        public String getResourceQueue() {
            return this.resourceQueue;
        }

        public ListRayJobResponseBodyRayJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRayJobResponseBodyRayJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRayJobResponseBodyRayJobs setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public ListRayJobResponseBodyRayJobs setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

    }

}
