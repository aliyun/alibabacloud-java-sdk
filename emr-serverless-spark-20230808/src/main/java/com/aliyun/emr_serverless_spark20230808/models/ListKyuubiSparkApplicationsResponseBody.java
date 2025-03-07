// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsResponseBody extends TeaModel {
    @NameInMap("applications")
    public java.util.List<ListKyuubiSparkApplicationsResponseBodyApplications> applications;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
         */
        @NameInMap("applicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
         */
        @NameInMap("applicationName")
        public String applicationName;

        /**
         * <strong>example:</strong>
         * <p>0.238302</p>
         */
        @NameInMap("cuHours")
        public Double cuHours;

        /**
         * <strong>example:</strong>
         * <p>2025-02-12 20:02:02</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>3513900</p>
         */
        @NameInMap("mbSeconds")
        public Long mbSeconds;

        /**
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("resourceQueueId")
        public String resourceQueueId;

        /**
         * <strong>example:</strong>
         * <p>2025-02-12 19:59:16</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>STARTING</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>780</p>
         */
        @NameInMap("vcoreSeconds")
        public Long vcoreSeconds;

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
