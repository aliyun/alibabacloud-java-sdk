// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsShrinkRequest extends TeaModel {
    /**
     * <p>创建用户Uid。</p>
     */
    @NameInMap("creator")
    public String creator;

    @NameInMap("endTime")
    public String endTimeShrink;

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
    public String startTimeShrink;

    /**
     * <p>作业状态。</p>
     */
    @NameInMap("states")
    public String statesShrink;

    /**
     * <p>标签。</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    public static ListJobRunsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobRunsShrinkRequest self = new ListJobRunsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListJobRunsShrinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListJobRunsShrinkRequest setEndTimeShrink(String endTimeShrink) {
        this.endTimeShrink = endTimeShrink;
        return this;
    }
    public String getEndTimeShrink() {
        return this.endTimeShrink;
    }

    public ListJobRunsShrinkRequest setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }
    public String getJobRunId() {
        return this.jobRunId;
    }

    public ListJobRunsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJobRunsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListJobRunsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJobRunsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListJobRunsShrinkRequest setResourceQueueId(String resourceQueueId) {
        this.resourceQueueId = resourceQueueId;
        return this;
    }
    public String getResourceQueueId() {
        return this.resourceQueueId;
    }

    public ListJobRunsShrinkRequest setStartTimeShrink(String startTimeShrink) {
        this.startTimeShrink = startTimeShrink;
        return this;
    }
    public String getStartTimeShrink() {
        return this.startTimeShrink;
    }

    public ListJobRunsShrinkRequest setStatesShrink(String statesShrink) {
        this.statesShrink = statesShrink;
        return this;
    }
    public String getStatesShrink() {
        return this.statesShrink;
    }

    public ListJobRunsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
