// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeInstancesRequest extends TeaModel {
    /**
     * <p>The keyword used to match the instance ID or instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>notebook_dev</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to continue the query. You do not need to specify this parameter for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The account ID of the user that owns the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>20933221576142****</p>
     */
    @NameInMap("RelatedUserId")
    public String relatedUserId;

    /**
     * <p>The DataWorks resource group identifier. You can use the numeric ID of the resource group or the full identifier in the Serverless_res_group_{tenantId}_{resgId} format.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_123456789012345_9876543210****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance subtype. Valid values:</p>
     * <ul>
     * <li>PERSONAL_DEV: personal development environment</li>
     * <li>DATA_AGENT: Data Agent</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PERSONAL_DEV</p>
     */
    @NameInMap("SubType")
    public String subType;

    public static ListServerIdeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeInstancesRequest self = new ListServerIdeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListServerIdeInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServerIdeInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerIdeInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerIdeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServerIdeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServerIdeInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListServerIdeInstancesRequest setRelatedUserId(String relatedUserId) {
        this.relatedUserId = relatedUserId;
        return this;
    }
    public String getRelatedUserId() {
        return this.relatedUserId;
    }

    public ListServerIdeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServerIdeInstancesRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
