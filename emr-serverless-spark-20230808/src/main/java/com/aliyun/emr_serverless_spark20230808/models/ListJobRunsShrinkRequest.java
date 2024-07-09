// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the user who creates a Spark job.</p>
     * 
     * <strong>example:</strong>
     * <p>1509789347011222</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The range of end time.</p>
     */
    @NameInMap("endTime")
    public String endTimeShrink;

    @NameInMap("jobRunDeploymentId")
    public String jobRunDeploymentId;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>j-xxx</p>
     */
    @NameInMap("jobRunId")
    public String jobRunId;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>emr-spark-demo-job</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The name of the resource queue on which the Spark jobs run.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_queue</p>
     */
    @NameInMap("resourceQueueId")
    public String resourceQueueId;

    /**
     * <p>The range of start time.</p>
     */
    @NameInMap("startTime")
    public String startTimeShrink;

    /**
     * <p>The job states.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Running&quot;,&quot;Submitted&quot;]</p>
     */
    @NameInMap("states")
    public String statesShrink;

    /**
     * <p>The tags of the job.</p>
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

    public ListJobRunsShrinkRequest setJobRunDeploymentId(String jobRunDeploymentId) {
        this.jobRunDeploymentId = jobRunDeploymentId;
        return this;
    }
    public String getJobRunDeploymentId() {
        return this.jobRunDeploymentId;
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
