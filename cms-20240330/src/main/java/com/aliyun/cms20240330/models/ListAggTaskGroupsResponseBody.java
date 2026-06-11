// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAggTaskGroupsResponseBody extends TeaModel {
    /**
     * <p>A list of aggregation task groups.</p>
     */
    @NameInMap("aggTaskGroups")
    public java.util.List<ListAggTaskGroupsResponseBodyAggTaskGroups> aggTaskGroups;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token to use to retrieve the next page of results. This value is empty when there are no more results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>aa9d0e569b880xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BF1F4D6-B9A8-5F0B-8C1D-4347FFCB798E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAggTaskGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggTaskGroupsResponseBody self = new ListAggTaskGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggTaskGroupsResponseBody setAggTaskGroups(java.util.List<ListAggTaskGroupsResponseBodyAggTaskGroups> aggTaskGroups) {
        this.aggTaskGroups = aggTaskGroups;
        return this;
    }
    public java.util.List<ListAggTaskGroupsResponseBodyAggTaskGroups> getAggTaskGroups() {
        return this.aggTaskGroups;
    }

    public ListAggTaskGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAggTaskGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAggTaskGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAggTaskGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAggTaskGroupsResponseBodyAggTaskGroups extends TeaModel {
        /**
         * <p>The summary of the aggregation task group configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>a54136014xxx</p>
         */
        @NameInMap("aggTaskGroupConfigHash")
        public String aggTaskGroupConfigHash;

        /**
         * <p>The ID of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>aggTaskGroup-xxxx</p>
         */
        @NameInMap("aggTaskGroupId")
        public String aggTaskGroupId;

        /**
         * <p>The name of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-aggtask-group</p>
         */
        @NameInMap("aggTaskGroupName")
        public String aggTaskGroupName;

        /**
         * <p>The scheduling expression for the aggregation task group when the scheduling mode is \<code>Cron\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0 10 8 1 * ? *</p>
         */
        @NameInMap("cronExpr")
        public String cronExpr;

        /**
         * <p>The fixed delay for scheduling, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("delay")
        public Integer delay;

        /**
         * <p>The description of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace api monitor update test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The UNIX timestamp that indicates the scheduling start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1757409499000</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The scheduling interval.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-24 00:00:00,2025-04-24 00:00:00</p>
         */
        @NameInMap("interval")
        public String interval;

        /**
         * <p>The maximum number of retries for an aggregation task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("maxRetries")
        public Integer maxRetries;

        /**
         * <p>The maximum retry duration for an aggregation task, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("maxRunTimeInSeconds")
        public Integer maxRunTimeInSeconds;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The scheduling mode.</p>
         * 
         * <strong>example:</strong>
         * <p>FixedRate</p>
         */
        @NameInMap("scheduleMode")
        public String scheduleMode;

        /**
         * <p>The scheduling time expression.</p>
         * 
         * <strong>example:</strong>
         * <p>@m</p>
         */
        @NameInMap("scheduleTimeExpr")
        public String scheduleTimeExpr;

        /**
         * <p>The ID of the source Prometheus instance for the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxx</p>
         */
        @NameInMap("sourcePrometheusId")
        public String sourcePrometheusId;

        /**
         * <p>The status of the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the target Prometheus instance for the aggregation task group.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxx</p>
         */
        @NameInMap("targetPrometheusId")
        public String targetPrometheusId;

        /**
         * <p>The UNIX timestamp that indicates the scheduling end time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        /**
         * <p>The time when the aggregation task group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1757409499000</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListAggTaskGroupsResponseBodyAggTaskGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAggTaskGroupsResponseBodyAggTaskGroups self = new ListAggTaskGroupsResponseBodyAggTaskGroups();
            return TeaModel.build(map, self);
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setAggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
            this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
            return this;
        }
        public String getAggTaskGroupConfigHash() {
            return this.aggTaskGroupConfigHash;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setAggTaskGroupId(String aggTaskGroupId) {
            this.aggTaskGroupId = aggTaskGroupId;
            return this;
        }
        public String getAggTaskGroupId() {
            return this.aggTaskGroupId;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setAggTaskGroupName(String aggTaskGroupName) {
            this.aggTaskGroupName = aggTaskGroupName;
            return this;
        }
        public String getAggTaskGroupName() {
            return this.aggTaskGroupName;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setCronExpr(String cronExpr) {
            this.cronExpr = cronExpr;
            return this;
        }
        public String getCronExpr() {
            return this.cronExpr;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setMaxRetries(Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Integer getMaxRetries() {
            return this.maxRetries;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setMaxRunTimeInSeconds(Integer maxRunTimeInSeconds) {
            this.maxRunTimeInSeconds = maxRunTimeInSeconds;
            return this;
        }
        public Integer getMaxRunTimeInSeconds() {
            return this.maxRunTimeInSeconds;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setScheduleMode(String scheduleMode) {
            this.scheduleMode = scheduleMode;
            return this;
        }
        public String getScheduleMode() {
            return this.scheduleMode;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setScheduleTimeExpr(String scheduleTimeExpr) {
            this.scheduleTimeExpr = scheduleTimeExpr;
            return this;
        }
        public String getScheduleTimeExpr() {
            return this.scheduleTimeExpr;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setSourcePrometheusId(String sourcePrometheusId) {
            this.sourcePrometheusId = sourcePrometheusId;
            return this;
        }
        public String getSourcePrometheusId() {
            return this.sourcePrometheusId;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setTargetPrometheusId(String targetPrometheusId) {
            this.targetPrometheusId = targetPrometheusId;
            return this;
        }
        public String getTargetPrometheusId() {
            return this.targetPrometheusId;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

        public ListAggTaskGroupsResponseBodyAggTaskGroups setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
