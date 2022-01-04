// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListStorageCollectorResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageCollectors")
    public java.util.List<ListStorageCollectorResponseBodyStorageCollectors> storageCollectors;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStorageCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStorageCollectorResponseBody self = new ListStorageCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStorageCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStorageCollectorResponseBody setStorageCollectors(java.util.List<ListStorageCollectorResponseBodyStorageCollectors> storageCollectors) {
        this.storageCollectors = storageCollectors;
        return this;
    }
    public java.util.List<ListStorageCollectorResponseBodyStorageCollectors> getStorageCollectors() {
        return this.storageCollectors;
    }

    public ListStorageCollectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListStorageCollectorResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStorageCollectorResponseBodyStorageCollectors extends TeaModel {
        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("Status")
        public String status;

        public static ListStorageCollectorResponseBodyStorageCollectors build(java.util.Map<String, ?> map) throws Exception {
            ListStorageCollectorResponseBodyStorageCollectors self = new ListStorageCollectorResponseBodyStorageCollectors();
            return TeaModel.build(map, self);
        }

        public ListStorageCollectorResponseBodyStorageCollectors setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListStorageCollectorResponseBodyStorageCollectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
