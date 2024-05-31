// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsRequest extends TeaModel {
    /**
     * <p>创建用户Uid。</p>
     */
    @NameInMap("creator")
    public String creator;

    @NameInMap("endTime")
    public ListJobRunsRequestEndTime endTime;

    @NameInMap("jobRunDeploymentId")
    public String jobRunDeploymentId;

    /**
     * <p>作业id。</p>
     */
    @NameInMap("jobRunId")
    public String jobRunId;

    /**
     * <p>一次获取的最大记录数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>作业名称。</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceQueueId")
    public String resourceQueueId;

    @NameInMap("startTime")
    public ListJobRunsRequestStartTime startTime;

    /**
     * <p>作业状态。</p>
     */
    @NameInMap("states")
    public java.util.List<String> states;

    /**
     * <p>标签。</p>
     */
    @NameInMap("tags")
    public java.util.List<ListJobRunsRequestTags> tags;

    public static ListJobRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobRunsRequest self = new ListJobRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobRunsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListJobRunsRequest setEndTime(ListJobRunsRequestEndTime endTime) {
        this.endTime = endTime;
        return this;
    }
    public ListJobRunsRequestEndTime getEndTime() {
        return this.endTime;
    }

    public ListJobRunsRequest setJobRunDeploymentId(String jobRunDeploymentId) {
        this.jobRunDeploymentId = jobRunDeploymentId;
        return this;
    }
    public String getJobRunDeploymentId() {
        return this.jobRunDeploymentId;
    }

    public ListJobRunsRequest setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }
    public String getJobRunId() {
        return this.jobRunId;
    }

    public ListJobRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJobRunsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListJobRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJobRunsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListJobRunsRequest setResourceQueueId(String resourceQueueId) {
        this.resourceQueueId = resourceQueueId;
        return this;
    }
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    public ListJobRunsRequest setStartTime(ListJobRunsRequestStartTime startTime) {
        this.startTime = startTime;
        return this;
    }
    public ListJobRunsRequestStartTime getStartTime() {
        return this.startTime;
    }

    public ListJobRunsRequest setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

    public ListJobRunsRequest setTags(java.util.List<ListJobRunsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListJobRunsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListJobRunsRequestEndTime extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("startTime")
        public Long startTime;

        public static ListJobRunsRequestEndTime build(java.util.Map<String, ?> map) throws Exception {
            ListJobRunsRequestEndTime self = new ListJobRunsRequestEndTime();
            return TeaModel.build(map, self);
        }

        public ListJobRunsRequestEndTime setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListJobRunsRequestEndTime setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListJobRunsRequestStartTime extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("startTime")
        public Long startTime;

        public static ListJobRunsRequestStartTime build(java.util.Map<String, ?> map) throws Exception {
            ListJobRunsRequestStartTime self = new ListJobRunsRequestStartTime();
            return TeaModel.build(map, self);
        }

        public ListJobRunsRequestStartTime setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListJobRunsRequestStartTime setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListJobRunsRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListJobRunsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListJobRunsRequestTags self = new ListJobRunsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListJobRunsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobRunsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
