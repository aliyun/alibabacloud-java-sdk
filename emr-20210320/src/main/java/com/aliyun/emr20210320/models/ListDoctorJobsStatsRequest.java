// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsStatsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The range of end time. You can filter jobs whose end time falls within the specified time range.</p>
     */
    @NameInMap("EndRange")
    public EndRange endRange;

    /**
     * <p>The fields that are used for grouping data.</p>
     * <br>
     * <p>Currently, only the first value is used for grouping data. Combinations of multiple values will be supported in the future.</p>
     */
    @NameInMap("GroupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field that you use to sort the query results. Valid values:</p>
     * <br>
     * <p>*   vcoreSeconds: the aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running</p>
     * <p>*   memSeconds: the aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   ASC: in ascending order</p>
     * <p>*   DESC: in descending order</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The range of start time. You can filter jobs whose start time falls within the specified time range.</p>
     */
    @NameInMap("StartRange")
    public StartRange startRange;

    public static ListDoctorJobsStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorJobsStatsRequest self = new ListDoctorJobsStatsRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorJobsStatsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorJobsStatsRequest setEndRange(EndRange endRange) {
        this.endRange = endRange;
        return this;
    }
    public EndRange getEndRange() {
        return this.endRange;
    }

    public ListDoctorJobsStatsRequest setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public ListDoctorJobsStatsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorJobsStatsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorJobsStatsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorJobsStatsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorJobsStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDoctorJobsStatsRequest setStartRange(StartRange startRange) {
        this.startRange = startRange;
        return this;
    }
    public StartRange getStartRange() {
        return this.startRange;
    }

    public static class EndRange extends TeaModel {
        /**
         * <p>The end of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The beginning of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static EndRange build(java.util.Map<String, ?> map) throws Exception {
            EndRange self = new EndRange();
            return TeaModel.build(map, self);
        }

        public EndRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public EndRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class StartRange extends TeaModel {
        /**
         * <p>The end of the time range during which jobs were submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The beginning of the time range during which jobs were submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static StartRange build(java.util.Map<String, ?> map) throws Exception {
            StartRange self = new StartRange();
            return TeaModel.build(map, self);
        }

        public StartRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public StartRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
