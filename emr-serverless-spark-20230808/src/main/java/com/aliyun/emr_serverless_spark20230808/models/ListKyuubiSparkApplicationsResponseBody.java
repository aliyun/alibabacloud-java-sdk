// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsResponseBody extends TeaModel {
    /**
     * <p>The details of the applications.</p>
     */
    @NameInMap("applications")
    public java.util.List<ListKyuubiSparkApplicationsResponseBodyApplications> applications;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListKyuubiSparkApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiSparkApplicationsResponseBody self = new ListKyuubiSparkApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKyuubiSparkApplicationsResponseBody setApplications(java.util.List<ListKyuubiSparkApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListKyuubiSparkApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListKyuubiSparkApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKyuubiSparkApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKyuubiSparkApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKyuubiSparkApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKyuubiSparkApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <p>The ID of the application that is submitted by using a Kyuubi gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
         */
        @NameInMap("applicationId")
        public String applicationId;

        /**
         * <p>The name of the Spark application that is submitted by using a Kyuubi gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
         */
        @NameInMap("applicationName")
        public String applicationName;

        /**
         * <p>The number of CUs consumed during a specified cycle of a task. The value is an estimated value. Refer to your Alibaba Cloud bill for the actual number of consumed CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.238302</p>
         */
        @NameInMap("cuHours")
        public Double cuHours;

        /**
         * <p>The time when the task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-12 20:02:02</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Exit Code: 137, Exit Reason: OOMKilled</p>
         */
        @NameInMap("exitReason")
        public String exitReason;

        /**
         * <strong>example:</strong>
         * <p>kb-2b93ec*******c9440c</p>
         */
        @NameInMap("kyuubiServiceId")
        public String kyuubiServiceId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("latestSqlStatementStatus")
        public String latestSqlStatementStatus;

        /**
         * <p>The total amount of memory allocated to the job multiplied by the running duration (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>3513900</p>
         */
        @NameInMap("mbSeconds")
        public Long mbSeconds;

        /**
         * <p>The name of the resource queue on which the Spark jobs run.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("resourceQueueId")
        public String resourceQueueId;

        @NameInMap("runLog")
        public RunLog runLog;

        /**
         * <p>The time when the task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-12 19:59:16</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the Spark application.</p>
         * <ul>
         * <li>STARTING</li>
         * <li>RUNNING</li>
         * <li>TERMINATED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STARTING</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The total number of CPU cores allocated to the job multiplied by the running duration (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>780</p>
         */
        @NameInMap("vcoreSeconds")
        public Long vcoreSeconds;

        /**
         * <p>The URL of the web UI for the Spark application.</p>
         */
        @NameInMap("webUI")
        public String webUI;

        public static ListKyuubiSparkApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiSparkApplicationsResponseBodyApplications self = new ListKyuubiSparkApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setCuHours(Double cuHours) {
            this.cuHours = cuHours;
            return this;
        }
        public Double getCuHours() {
            return this.cuHours;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setExitReason(String exitReason) {
            this.exitReason = exitReason;
            return this;
        }
        public String getExitReason() {
            return this.exitReason;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setKyuubiServiceId(String kyuubiServiceId) {
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setLatestSqlStatementStatus(String latestSqlStatementStatus) {
            this.latestSqlStatementStatus = latestSqlStatementStatus;
            return this;
        }
        public String getLatestSqlStatementStatus() {
            return this.latestSqlStatementStatus;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setMbSeconds(Long mbSeconds) {
            this.mbSeconds = mbSeconds;
            return this;
        }
        public Long getMbSeconds() {
            return this.mbSeconds;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setResourceQueueId(String resourceQueueId) {
            this.resourceQueueId = resourceQueueId;
            return this;
        }
        public String getResourceQueueId() {
            return this.resourceQueueId;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setRunLog(RunLog runLog) {
            this.runLog = runLog;
            return this;
        }
        public RunLog getRunLog() {
            return this.runLog;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setVcoreSeconds(Long vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public Long getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public ListKyuubiSparkApplicationsResponseBodyApplications setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
        }

    }

}
