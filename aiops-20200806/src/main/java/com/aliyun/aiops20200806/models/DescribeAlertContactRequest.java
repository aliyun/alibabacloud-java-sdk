// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchLike")
    public String searchLike;

    @NameInMap("SearchBy")
    public String searchBy;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactRequest self = new DescribeAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertContactRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertContactRequest setSearchLike(String searchLike) {
        this.searchLike = searchLike;
        return this;
    }
    public String getSearchLike() {
        return this.searchLike;
    }

    public DescribeAlertContactRequest setSearchBy(String searchBy) {
        this.searchBy = searchBy;
        return this;
    }
    public String getSearchBy() {
        return this.searchBy;
    }

    public DescribeAlertContactRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
