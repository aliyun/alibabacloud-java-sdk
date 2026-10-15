// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsRequest extends TeaModel {
    /**
     * <p>The ID of the Spark application submitted by Kyuubi, used for search.</p>
     * 
     * <strong>example:</strong>
     * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
     */
    @NameInMap("applicationId")
    public String applicationId;

    /**
     * <p>The name of the Spark application submitted by Kyuubi, used for search.</p>
     * 
     * <strong>example:</strong>
     * <p>kyuubi-connection-spark-sql-anonymous-fa9a5e73-b4b1-474a-b****</p>
     */
    @NameInMap("applicationName")
    public String applicationName;

    /**
     * <p>The end time range of the task.</p>
     */
    @NameInMap("endTime")
    public ListKyuubiSparkApplicationsRequestEndTime endTime;

    /**
     * <p>The list of statuses of the latest SQL statement used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;SUCCESS&quot;]</p>
     */
    @NameInMap("latestSqlStatementStatuses")
    public String latestSqlStatementStatuses;

    /**
     * <p>The maximum number of records to retrieve at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The minimum execution duration of the application, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("minDuration")
    public Long minDuration;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of sort fields.</p>
     */
    @NameInMap("orderBy")
    public java.util.List<String> orderBy;

    /**
     * <p>The resource queue ID used to filter Spark applications.</p>
     * 
     * <strong>example:</strong>
     * <p>root_queue</p>
     */
    @NameInMap("resourceQueueId")
    public String resourceQueueId;

    /**
     * <p>The sort order. A value of asc indicates ascending order, and desc indicates descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <p>The start time range of the task.</p>
     */
    @NameInMap("startTime")
    public ListKyuubiSparkApplicationsRequestStartTime startTime;

    /**
     * <p>The list of Spark application states used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ERROR&quot;]</p>
     */
    @NameInMap("states")
    public String states;

    public static ListKyuubiSparkApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiSparkApplicationsRequest self = new ListKyuubiSparkApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListKyuubiSparkApplicationsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListKyuubiSparkApplicationsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListKyuubiSparkApplicationsRequest setEndTime(ListKyuubiSparkApplicationsRequestEndTime endTime) {
        this.endTime = endTime;
        return this;
    }
    public ListKyuubiSparkApplicationsRequestEndTime getEndTime() {
        return this.endTime;
    }

    public ListKyuubiSparkApplicationsRequest setLatestSqlStatementStatuses(String latestSqlStatementStatuses) {
        this.latestSqlStatementStatuses = latestSqlStatementStatuses;
        return this;
    }
    public String getLatestSqlStatementStatuses() {
        return this.latestSqlStatementStatuses;
    }

    public ListKyuubiSparkApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKyuubiSparkApplicationsRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public ListKyuubiSparkApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKyuubiSparkApplicationsRequest setOrderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }

    public ListKyuubiSparkApplicationsRequest setResourceQueueId(String resourceQueueId) {
        this.resourceQueueId = resourceQueueId;
        return this;
    }
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    public ListKyuubiSparkApplicationsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListKyuubiSparkApplicationsRequest setStartTime(ListKyuubiSparkApplicationsRequestStartTime startTime) {
        this.startTime = startTime;
        return this;
    }
    public ListKyuubiSparkApplicationsRequestStartTime getStartTime() {
        return this.startTime;
    }

    public ListKyuubiSparkApplicationsRequest setStates(String states) {
        this.states = states;
        return this;
    }
    public String getStates() {
        return this.states;
    }

    public static class ListKyuubiSparkApplicationsRequestEndTime extends TeaModel {
        /**
         * <p>The end point of the task end time range. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1774209636</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The start point of the task end time range. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1774209636</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        public static ListKyuubiSparkApplicationsRequestEndTime build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiSparkApplicationsRequestEndTime self = new ListKyuubiSparkApplicationsRequestEndTime();
            return TeaModel.build(map, self);
        }

        public ListKyuubiSparkApplicationsRequestEndTime setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListKyuubiSparkApplicationsRequestEndTime setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListKyuubiSparkApplicationsRequestStartTime extends TeaModel {
        /**
         * <p>The end point of the task start time range. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The start point of the task start time range. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1709740800000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        public static ListKyuubiSparkApplicationsRequestStartTime build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiSparkApplicationsRequestStartTime self = new ListKyuubiSparkApplicationsRequestStartTime();
            return TeaModel.build(map, self);
        }

        public ListKyuubiSparkApplicationsRequestStartTime setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListKyuubiSparkApplicationsRequestStartTime setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
