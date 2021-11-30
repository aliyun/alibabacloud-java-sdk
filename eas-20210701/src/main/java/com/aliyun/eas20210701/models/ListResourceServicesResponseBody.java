// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceServicesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public java.util.List<Service> services;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServicesResponseBody self = new ListResourceServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceServicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceServicesResponseBody setServices(java.util.List<Service> services) {
        this.services = services;
        return this;
    }
    public java.util.List<Service> getServices() {
        return this.services;
    }

    public ListResourceServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
