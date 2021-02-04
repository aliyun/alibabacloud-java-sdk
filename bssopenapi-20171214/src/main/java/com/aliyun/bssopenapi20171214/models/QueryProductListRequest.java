// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListRequest extends TeaModel {
    @NameInMap("QueryTotalCount")
    public Boolean queryTotalCount;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListRequest self = new QueryProductListRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductListRequest setQueryTotalCount(Boolean queryTotalCount) {
        this.queryTotalCount = queryTotalCount;
        return this;
    }
    public Boolean getQueryTotalCount() {
        return this.queryTotalCount;
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

}
