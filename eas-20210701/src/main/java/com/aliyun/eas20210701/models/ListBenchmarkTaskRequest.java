// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskRequest extends TeaModel {
    /**
     * <p>The keyword used to query required stress testing tasks. If this parameter is specified, the system returns stress testing tasks based on the names of the stress testing tasks in the matched Elastic Algorithm Service (EAS).</p>
     * 
     * <strong>example:</strong>
     * <p>test_bench</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestMethod")
    public String requestMethod;

    /**
     * <p>The name of the EAS service that corresponds to the stress testing task. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test_bench_srv</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Status")
    public String status;

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

    public ListBenchmarkTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ListBenchmarkTaskRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
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

    public ListBenchmarkTaskRequest setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }

    public ListBenchmarkTaskRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListBenchmarkTaskRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListBenchmarkTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
