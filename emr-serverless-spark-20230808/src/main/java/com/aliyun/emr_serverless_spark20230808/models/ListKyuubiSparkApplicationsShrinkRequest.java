// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsShrinkRequest extends TeaModel {
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
    public String endTimeShrink;

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
    public String orderByShrink;

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
    public String startTimeShrink;

    /**
     * <p>The list of Spark application states used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ERROR&quot;]</p>
     */
    @NameInMap("states")
    public String states;

    public static ListKyuubiSparkApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiSparkApplicationsShrinkRequest self = new ListKyuubiSparkApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListKyuubiSparkApplicationsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setEndTimeShrink(String endTimeShrink) {
        this.endTimeShrink = endTimeShrink;
        return this;
    }
    public String getEndTimeShrink() {
        return this.endTimeShrink;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setLatestSqlStatementStatuses(String latestSqlStatementStatuses) {
        this.latestSqlStatementStatuses = latestSqlStatementStatuses;
        return this;
    }
    public String getLatestSqlStatementStatuses() {
        return this.latestSqlStatementStatuses;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setOrderByShrink(String orderByShrink) {
        this.orderByShrink = orderByShrink;
        return this;
    }
    public String getOrderByShrink() {
        return this.orderByShrink;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setResourceQueueId(String resourceQueueId) {
        this.resourceQueueId = resourceQueueId;
        return this;
    }
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setStartTimeShrink(String startTimeShrink) {
        this.startTimeShrink = startTimeShrink;
        return this;
    }
    public String getStartTimeShrink() {
        return this.startTimeShrink;
    }

    public ListKyuubiSparkApplicationsShrinkRequest setStates(String states) {
        this.states = states;
        return this;
    }
    public String getStates() {
        return this.states;
    }

}
