// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    // 模糊匹配字段（只支持按服务名字模糊匹配）
    @NameInMap("Filter")
    public String filter;

    // 排序方式（默认降序）
    @NameInMap("Order")
    public String order;

    // 请求的页码（默认为1）
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页的大小（默认为100）
    @NameInMap("PageSize")
    public Integer pageSize;

    // 排序字段 （时间戳类型默认倒序排序）
    @NameInMap("Sort")
    public String sort;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListServicesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
