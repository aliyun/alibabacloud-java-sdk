// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactGroupRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchLike")
    public String searchLike;

    public static DescribeAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactGroupRequest self = new DescribeAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactGroupRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertContactGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeAlertContactGroupRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertContactGroupRequest setSearchLike(String searchLike) {
        this.searchLike = searchLike;
        return this;
    }
    public String getSearchLike() {
        return this.searchLike;
    }

}
