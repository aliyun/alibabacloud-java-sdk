// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ResourceInstance> instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstancesResponseBody self = new ListResourceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceInstancesResponseBody setInstances(java.util.List<ResourceInstance> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ResourceInstance> getInstances() {
        return this.instances;
    }

    public ListResourceInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
