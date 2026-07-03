// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentAccuracyTestInstancesRequest extends TeaModel {
    /**
     * <p>The accuracy test instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestInsId")
    public String accuracyTestInsId;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>Nes****</p>
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
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8wfig6l33n4f4xxxxxxxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataAgentAccuracyTestInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentAccuracyTestInstancesRequest self = new ListDataAgentAccuracyTestInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentAccuracyTestInstancesRequest setAccuracyTestInsId(String accuracyTestInsId) {
        this.accuracyTestInsId = accuracyTestInsId;
        return this;
    }
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    public ListDataAgentAccuracyTestInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentAccuracyTestInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentAccuracyTestInstancesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentAccuracyTestInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentAccuracyTestInstancesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
