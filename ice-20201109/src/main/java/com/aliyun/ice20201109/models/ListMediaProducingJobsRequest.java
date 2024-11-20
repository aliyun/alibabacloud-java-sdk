// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The maximum time range between EndTime and StartTime cannot exceed 30 days. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The job type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>LiveEditingJob: live editing job.</li>
     * <li>EditingJob: regular template-based editing job</li>
     * <li>VETemplateJob: advanced template-based editing job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EditingJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The search keyword. For example, you can use a job ID as the keyword to search for jobs.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The ID of the quick video production job. If this parameter is specified, the subjobs of the quick video production job are queried.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>8750b54e3c976a47da6f</strong></strong></strong></p>
     */
    @NameInMap("MasterJobId")
    public String masterJobId;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>927cfb53d05b96c1bfe1</strong></strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The sorting parameter. By default, the query results are sorted by creation time in descending order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CreationTime:Asc: sorted by creation time in ascending order.</li>
     * <li>CreationTime:Desc: sorted by creation time in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Init: The job is initialized.</li>
     * <li>Failed: The job failed.</li>
     * <li>Success: The job is successful.</li>
     * <li>Processing: The job is in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListMediaProducingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaProducingJobsRequest self = new ListMediaProducingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaProducingJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMediaProducingJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListMediaProducingJobsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMediaProducingJobsRequest setMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
        return this;
    }
    public String getMasterJobId() {
        return this.masterJobId;
    }

    public ListMediaProducingJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaProducingJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaProducingJobsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListMediaProducingJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListMediaProducingJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListMediaProducingJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
