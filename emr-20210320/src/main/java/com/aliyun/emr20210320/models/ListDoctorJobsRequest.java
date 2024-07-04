// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsRequest extends TeaModel {
    /**
     * <p>The IDs of the jobs that are submitted to YARN.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("AppIds")
    public java.util.List<String> appIds;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The range of end time. You can filter jobs whose end time falls within the specified time range.</p>
     */
    @NameInMap("EndRange")
    public EndRange endRange;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field that you use to sort the query results. Valid values:</p>
     * <ul>
     * <li>vcoreSeconds: the aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running</li>
     * <li>memSeconds: the aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vcoreSeconds</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <ul>
     * <li>ASC: the ascending order</li>
     * <li>DESC: the descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The YARN queues to which the jobs are submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Queues")
    public java.util.List<String> queues;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The range of start time. You can filter jobs whose start time falls within the specified time range.</p>
     */
    @NameInMap("StartRange")
    public StartRange startRange;

    /**
     * <p>The YARN engines to which the jobs are submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    /**
     * <p>The users who submit the jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
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
        /**
         * <p>The end of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1666865137099</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The beginning of the time range during which jobs ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679135111960</p>
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
         * 
         * <strong>example:</strong>
         * <p>1683340662020</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The beginning of the time range during which jobs were submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683340662016</p>
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
