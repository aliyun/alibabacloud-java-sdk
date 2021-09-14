// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class InsertSynchronizConstantsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static InsertSynchronizConstantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertSynchronizConstantsResponseBody self = new InsertSynchronizConstantsResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertSynchronizConstantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertSynchronizConstantsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InsertSynchronizConstantsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public InsertSynchronizConstantsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public InsertSynchronizConstantsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
