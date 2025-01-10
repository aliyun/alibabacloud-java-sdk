// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListLicensesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryStr")
    public String queryStr;

    public static ListLicensesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLicensesRequest self = new ListLicensesRequest();
        return TeaModel.build(map, self);
    }

    public ListLicensesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListLicensesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLicensesRequest setQueryStr(String queryStr) {
        this.queryStr = queryStr;
        return this;
    }
    public String getQueryStr() {
        return this.queryStr;
    }

}
