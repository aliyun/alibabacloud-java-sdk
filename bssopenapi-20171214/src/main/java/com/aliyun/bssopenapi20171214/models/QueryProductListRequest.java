// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to return the total number of services. Default value: false.</p>
     */
    @NameInMap("QueryTotalCount")
    public Boolean queryTotalCount;

    public static QueryProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListRequest self = new QueryProductListRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryProductListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProductListRequest setQueryTotalCount(Boolean queryTotalCount) {
        this.queryTotalCount = queryTotalCount;
        return this;
    }
    public Boolean getQueryTotalCount() {
        return this.queryTotalCount;
    }

}
