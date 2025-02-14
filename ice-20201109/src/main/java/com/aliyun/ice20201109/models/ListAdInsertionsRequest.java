// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAdInsertionsRequest extends TeaModel {
    /**
     * <p>按广告名称查询，支持模糊匹配</p>
     * 
     * <strong>example:</strong>
     * <p>ad</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>获取后续数据的最大记录数，使用此方式获取数据时分页参数将无效</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>获取后续数据的Token，使用此方式获取数据时分页参数将无效</p>
     * 
     * <strong>example:</strong>
     * <p>*<em><strong><strong>8EqYpQbZ6Eh7+Zz8DxVYoQ</strong></strong></em></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>分页参数，页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>分页参数，页宽</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>分页参数，排序方式，asc:按创建时间升序，desc:按创建时间降序</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListAdInsertionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdInsertionsRequest self = new ListAdInsertionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAdInsertionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAdInsertionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAdInsertionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAdInsertionsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListAdInsertionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAdInsertionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
