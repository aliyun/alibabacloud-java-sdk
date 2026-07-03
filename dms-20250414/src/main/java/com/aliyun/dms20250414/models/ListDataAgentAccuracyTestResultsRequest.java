// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestResultsRequest extends TeaModel {
    /**
     * <p>The instance ID of the accuracy test to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestInsId")
    public String accuracyTestInsId;

    /**
     * <p>The result ID used to retrieve a single record.</p>
     * 
     * <strong>example:</strong>
     * <p>at-emhnbwewfngrxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestResultId")
    public String accuracyTestResultId;

    /**
     * <p>The subtask ID used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>f1eb8728-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestSubtaskId")
    public String accuracyTestSubtaskId;

    /**
     * <p>The ID of the accuracy test task.</p>
     * 
     * <strong>example:</strong>
     * <p>692abb8f-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestTaskId")
    public String accuracyTestTaskId;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>nu use</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8wfig6l33n4f4xxxxxxxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataAgentAccuracyTestResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestResultsRequest self = new ListDataAgentAccuracyTestResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestResultsRequest setAccuracyTestInsId(String accuracyTestInsId) {
        this.accuracyTestInsId = accuracyTestInsId;
        return this;
    }
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    public ListDataAgentAccuracyTestResultsRequest setAccuracyTestResultId(String accuracyTestResultId) {
        this.accuracyTestResultId = accuracyTestResultId;
        return this;
    }
    public String getAccuracyTestResultId() {
        return this.accuracyTestResultId;
    }

    public ListDataAgentAccuracyTestResultsRequest setAccuracyTestSubtaskId(String accuracyTestSubtaskId) {
        this.accuracyTestSubtaskId = accuracyTestSubtaskId;
        return this;
    }
    public String getAccuracyTestSubtaskId() {
        return this.accuracyTestSubtaskId;
    }

    public ListDataAgentAccuracyTestResultsRequest setAccuracyTestTaskId(String accuracyTestTaskId) {
        this.accuracyTestTaskId = accuracyTestTaskId;
        return this;
    }
    public String getAccuracyTestTaskId() {
        return this.accuracyTestTaskId;
    }

    public ListDataAgentAccuracyTestResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentAccuracyTestResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentAccuracyTestResultsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentAccuracyTestResultsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentAccuracyTestResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataAgentAccuracyTestResultsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
