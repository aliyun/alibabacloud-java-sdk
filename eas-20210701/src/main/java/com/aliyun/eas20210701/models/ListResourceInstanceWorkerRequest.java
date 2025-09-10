// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstanceWorkerRequest extends TeaModel {
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Ready")
    public Boolean ready;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Status")
    public String status;

    /**
     * <p>The worker name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-fd95xxxxx-xxxxxx</p>
     */
    @NameInMap("WorkerName")
    public String workerName;

    public static ListResourceInstanceWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstanceWorkerRequest self = new ListResourceInstanceWorkerRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceInstanceWorkerRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourceInstanceWorkerRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceInstanceWorkerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceInstanceWorkerRequest setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
    public Boolean getReady() {
        return this.ready;
    }

    public ListResourceInstanceWorkerRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ListResourceInstanceWorkerRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListResourceInstanceWorkerRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListResourceInstanceWorkerRequest setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

}
