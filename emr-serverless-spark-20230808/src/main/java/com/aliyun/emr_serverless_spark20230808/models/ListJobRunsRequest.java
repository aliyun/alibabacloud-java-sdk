// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsRequest extends TeaModel {
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
    public ListJobRunsRequestEndTime endTime;

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
    public ListJobRunsRequestStartTime startTime;

    /**
     * <p>The job states.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Running&quot;,&quot;Submitted&quot;]</p>
     */
    @NameInMap("states")
    public java.util.List<String> states;

    /**
     * <p>The tags of the job.</p>
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
        /**
         * <p>The end of the end time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1710432000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The beginning of the end time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1709740800000</p>
         */
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
        /**
         * <p>The key of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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
