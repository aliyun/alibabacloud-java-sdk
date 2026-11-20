// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskRequest extends TeaModel {
    /**
     * <p>The filter parameter. If specified, the system searches for records that match the specified value in the EAS service name and stress testing task name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_bench</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3.5-27B</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: Descending order. This is the default value.</li>
     * <li>asc: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the stress testing task list. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of stress testing tasks to return on each page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request method for stress testing. Valid values:</p>
     * <ul>
     * <li>concurrency: Fixed concurrency mode.</li>
     * <li>requestRate: Fixed request rate mode.</li>
     * <li>peakThroughput: Peak throughput mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>requestRate</p>
     */
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

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The execution status used to filter stress testing tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
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
