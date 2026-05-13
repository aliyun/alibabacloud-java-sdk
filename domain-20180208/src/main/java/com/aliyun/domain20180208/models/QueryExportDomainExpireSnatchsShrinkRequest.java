// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportDomainExpireSnatchsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentId")
    public Long currentId;

    @NameInMap("DataSources")
    public String dataSourcesShrink;

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

    public static QueryExportDomainExpireSnatchsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExportDomainExpireSnatchsShrinkRequest self = new QueryExportDomainExpireSnatchsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryExportDomainExpireSnatchsShrinkRequest setCurrentId(Long currentId) {
        this.currentId = currentId;
        return this;
    }
    public Long getCurrentId() {
        return this.currentId;
    }

    public QueryExportDomainExpireSnatchsShrinkRequest setDataSourcesShrink(String dataSourcesShrink) {
        this.dataSourcesShrink = dataSourcesShrink;
        return this;
    }
    public String getDataSourcesShrink() {
        return this.dataSourcesShrink;
    }

    public QueryExportDomainExpireSnatchsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryExportDomainExpireSnatchsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryExportDomainExpireSnatchsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
