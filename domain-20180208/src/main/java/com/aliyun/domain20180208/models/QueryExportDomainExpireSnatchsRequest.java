// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportDomainExpireSnatchsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentId")
    public Long currentId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f07b150eadfa1d7a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryExportDomainExpireSnatchsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExportDomainExpireSnatchsRequest self = new QueryExportDomainExpireSnatchsRequest();
        return TeaModel.build(map, self);
    }

    public QueryExportDomainExpireSnatchsRequest setCurrentId(Long currentId) {
        this.currentId = currentId;
        return this;
    }
    public Long getCurrentId() {
        return this.currentId;
    }

    public QueryExportDomainExpireSnatchsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryExportDomainExpireSnatchsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryExportDomainExpireSnatchsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
