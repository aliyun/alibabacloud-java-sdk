// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<Instance> instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesResponseBody self = new ListServiceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesResponseBody setInstances(java.util.List<Instance> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<Instance> getInstances() {
        return this.instances;
    }

    public ListServiceInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServiceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
