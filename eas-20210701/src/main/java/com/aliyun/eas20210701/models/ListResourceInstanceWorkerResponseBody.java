// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstanceWorkerResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workers.</p>
     */
    @NameInMap("Pods")
    public java.util.List<ResourceInstanceWorker> pods;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceInstanceWorkerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstanceWorkerResponseBody self = new ListResourceInstanceWorkerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceInstanceWorkerResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceInstanceWorkerResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceInstanceWorkerResponseBody setPods(java.util.List<ResourceInstanceWorker> pods) {
        this.pods = pods;
        return this;
    }
    public java.util.List<ResourceInstanceWorker> getPods() {
        return this.pods;
    }

    public ListResourceInstanceWorkerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceInstanceWorkerResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
