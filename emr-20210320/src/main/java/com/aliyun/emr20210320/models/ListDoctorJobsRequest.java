// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsRequest extends TeaModel {
    /**
     * <p>app ID数组</p>
     */
    @NameInMap("AppIds")
    public java.util.List<String> appIds;

    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>结束range</p>
     */
    @NameInMap("EndRange")
    public EndRange endRange;

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

    /**
     * <p>排序字段</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>排序类型</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Queues")
    public java.util.List<String> queues;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>开始range</p>
     */
    @NameInMap("StartRange")
    public StartRange startRange;

    @NameInMap("Types")
    public java.util.List<String> types;

    @NameInMap("Users")
    public java.util.List<String> users;

    public static ListDoctorJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorJobsRequest self = new ListDoctorJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorJobsRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public ListDoctorJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorJobsRequest setEndRange(EndRange endRange) {
        this.endRange = endRange;
        return this;
    }
    public EndRange getEndRange() {
        return this.endRange;
    }

    public ListDoctorJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorJobsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorJobsRequest setQueues(java.util.List<String> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<String> getQueues() {
        return this.queues;
    }

    public ListDoctorJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDoctorJobsRequest setStartRange(StartRange startRange) {
        this.startRange = startRange;
        return this;
    }
    public StartRange getStartRange() {
        return this.startRange;
    }

    public ListDoctorJobsRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public ListDoctorJobsRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
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
