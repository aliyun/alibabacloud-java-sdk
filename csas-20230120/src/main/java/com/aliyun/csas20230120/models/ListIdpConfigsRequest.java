// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpConfigsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Include")
    public String include;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListIdpConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdpConfigsRequest self = new ListIdpConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListIdpConfigsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListIdpConfigsRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public ListIdpConfigsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
