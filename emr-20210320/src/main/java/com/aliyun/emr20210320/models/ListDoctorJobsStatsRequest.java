// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsStatsRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EndRange")
    public EndRange endRange;

    @NameInMap("GroupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("EndTime")
        public Long endTime;

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
        @NameInMap("EndTime")
        public Long endTime;

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
