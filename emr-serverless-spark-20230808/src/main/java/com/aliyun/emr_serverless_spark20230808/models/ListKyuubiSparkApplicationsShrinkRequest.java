// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsShrinkRequest extends TeaModel {
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
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("minDuration")
    public Long minDuration;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("orderBy")
    public String orderByShrink;

    @NameInMap("resourceQueueId")
    public String resourceQueueId;

    @NameInMap("sort")
    public String sort;

    /**
     * <p>The range of start time.</p>
     */
    @NameInMap("startTime")
    public String startTimeShrink;

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

}
