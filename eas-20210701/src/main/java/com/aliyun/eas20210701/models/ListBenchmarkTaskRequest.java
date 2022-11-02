// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskRequest extends TeaModel {
    @NameInMap("Fileter")
    public String fileter;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ServiceName")
    public String serviceName;

    public static ListBenchmarkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBenchmarkTaskRequest self = new ListBenchmarkTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListBenchmarkTaskRequest setFileter(String fileter) {
        this.fileter = fileter;
        return this;
    }
    public String getFileter() {
        return this.fileter;
    }

    public ListBenchmarkTaskRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListBenchmarkTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListBenchmarkTaskRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
