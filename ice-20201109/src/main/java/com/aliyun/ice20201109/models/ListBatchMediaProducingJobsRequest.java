// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListBatchMediaProducingJobsRequest extends TeaModel {
    /**
     * <p>The end time. The time is displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-05T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the one-click video production job.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>Script: script-based material editing</li>
     * <li>Smart_Mix: intelligent material editing</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Script</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The maximum number of entries to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that indicates the position from which the current call starts to read data. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>mRZkKAovub0xWVfH14he4Q==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting order of the query results. Valid values:</p>
     * <ul>
     * <li>desc: sorts the results in descending order of creation time. This is the default value.</li>
     * <li>asc: sorts the results in ascending order of creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time. The time is displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Finished: The job is completed.</li>
     * <li>Init: The job is initialized.</li>
     * <li>Failed: The job failed.</li>
     * <li>Processing: The job is being processed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListBatchMediaProducingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchMediaProducingJobsRequest self = new ListBatchMediaProducingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchMediaProducingJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBatchMediaProducingJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListBatchMediaProducingJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListBatchMediaProducingJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBatchMediaProducingJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchMediaProducingJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListBatchMediaProducingJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBatchMediaProducingJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
