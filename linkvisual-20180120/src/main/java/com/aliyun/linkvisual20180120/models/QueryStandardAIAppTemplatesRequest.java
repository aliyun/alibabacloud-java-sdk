// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStandardAIAppTemplatesRequest extends TeaModel {
    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    public static QueryStandardAIAppTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardAIAppTemplatesRequest self = new QueryStandardAIAppTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public QueryStandardAIAppTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStandardAIAppTemplatesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
