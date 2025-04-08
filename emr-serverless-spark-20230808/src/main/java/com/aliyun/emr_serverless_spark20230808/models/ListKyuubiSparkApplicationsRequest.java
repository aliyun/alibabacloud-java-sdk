// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiSparkApplicationsRequest extends TeaModel {
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

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The range of start time.</p>
     */
    @NameInMap("startTime")
    public ListKyuubiSparkApplicationsRequestStartTime startTime;

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

    public ListKyuubiSparkApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKyuubiSparkApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKyuubiSparkApplicationsRequest setStartTime(ListKyuubiSparkApplicationsRequestStartTime startTime) {
        this.startTime = startTime;
        return this;
    }
    public ListKyuubiSparkApplicationsRequestStartTime getStartTime() {
        return this.startTime;
    }

    public static class ListKyuubiSparkApplicationsRequestStartTime extends TeaModel {
        /**
         * <p>The end of the start time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The beginning of the start time range.</p>
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
