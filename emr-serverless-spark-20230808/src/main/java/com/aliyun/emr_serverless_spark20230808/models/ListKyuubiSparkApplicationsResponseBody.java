// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsResponseBody extends TeaModel {
    /**
     * <p>A list of application details.</p>
     */
    @NameInMap("applications")
    public java.util.List<ListKyuubiSparkApplicationsResponseBodyApplications> applications;

    /**
     * <p>The maximum number of records returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
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
     * <p>The total number of records.</p>
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
         * <p>The ID of the Spark application submitted by Kyuubi.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
         */
        @NameInMap("applicationId")
        public String applicationId;

        /**
         * <p>The name of the Spark application submitted by Kyuubi.</p>
         * 
         * <strong>example:</strong>
         * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
         */
        @NameInMap("applicationName")
        public String applicationName;

        /**
         * <p>The number of CUs consumed during the task lifecycle. This is an estimated value. The final amount is subject to your bill.</p>
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
         * <p>The exit code.</p>
         * 
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
         * <p>The status of the last task execution in the session.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("latestSqlStatementStatus")
        public String latestSqlStatementStatus;

        /**
         * <p>The total memory allocated to the task in MB, multiplied by the number of seconds the task ran.</p>
         * 
         * <strong>example:</strong>
         * <p>3513900</p>
         */
        @NameInMap("mbSeconds")
        public Long mbSeconds;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <p>The name of the resource queue where the Spark task runs.</p>
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
         * <li><p>STARTING: The application is starting.</p>
         * </li>
         * <li><p>RUNNING: The application is running.</p>
         * </li>
         * <li><p>TERMINATED: The application is terminated.</p>
         * </li>
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
         * <p>The total vCores allocated to the task, multiplied by the number of seconds the task ran.</p>
         * 
         * <strong>example:</strong>
         * <p>780</p>
         */
        @NameInMap("vcoreSeconds")
        public Long vcoreSeconds;

        /**
         * <p>The URL of the Spark application UI.</p>
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

        public ListKyuubiSparkApplicationsResponseBodyApplications setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
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
