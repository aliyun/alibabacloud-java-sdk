// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskRequest extends TeaModel {
    /**
     * <p>The keyword used to query required stress testing tasks. If this parameter is specified, the system returns stress testing tasks based on the names of the stress testing tasks in the matched Elastic Algorithm service (EAS).</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The name of the EAS service that corresponds to the stress testing task. For more information about how to query the service name, see [ListServices](~~412109~~).</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static ListBenchmarkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBenchmarkTaskRequest self = new ListBenchmarkTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListBenchmarkTaskRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
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
