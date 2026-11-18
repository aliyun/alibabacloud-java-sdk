// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    /**
     * <p>The maximum number of models to return per page. Valid values: 1 to 100. Explicitly specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Set to <code>text</code> for text sessions. If omitted, all visible models are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The pagination token returned from the previous page. Omit this parameter for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The legacy pagination parameter for compatibility. The page number starts from 1. Use MaxResults and NextToken instead. Do not mix the two sets of pagination parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The legacy pagination parameter for compatibility. The number of entries per page. Valid values: 1 to 100. Use MaxResults and NextToken instead. Do not mix the two sets of pagination parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListModelsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
