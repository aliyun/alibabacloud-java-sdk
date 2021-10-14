// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListInstanceIndicesResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListInstanceIndicesResponseBodyResult> result;

    public static ListInstanceIndicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIndicesResponseBody self = new ListInstanceIndicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceIndicesResponseBody setHeaders(ListInstanceIndicesResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListInstanceIndicesResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListInstanceIndicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceIndicesResponseBody setResult(java.util.List<ListInstanceIndicesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceIndicesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceIndicesResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Managed-Count")
        public Integer xManagedCount;

        @NameInMap("X-Managed-StorageSize")
        public Long xManagedStorageSize;

        @NameInMap("X-OSS-Count")
        public Integer xOSSCount;

        @NameInMap("X-OSS-StorageSize")
        public Long xOSSStorageSize;

        public static ListInstanceIndicesResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceIndicesResponseBodyHeaders self = new ListInstanceIndicesResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListInstanceIndicesResponseBodyHeaders setXManagedCount(Integer xManagedCount) {
            this.xManagedCount = xManagedCount;
            return this;
        }
        public Integer getXManagedCount() {
            return this.xManagedCount;
        }

        public ListInstanceIndicesResponseBodyHeaders setXManagedStorageSize(Long xManagedStorageSize) {
            this.xManagedStorageSize = xManagedStorageSize;
            return this;
        }
        public Long getXManagedStorageSize() {
            return this.xManagedStorageSize;
        }

        public ListInstanceIndicesResponseBodyHeaders setXOSSCount(Integer xOSSCount) {
            this.xOSSCount = xOSSCount;
            return this;
        }
        public Integer getXOSSCount() {
            return this.xOSSCount;
        }

        public ListInstanceIndicesResponseBodyHeaders setXOSSStorageSize(Long xOSSStorageSize) {
            this.xOSSStorageSize = xOSSStorageSize;
            return this;
        }
        public Long getXOSSStorageSize() {
            return this.xOSSStorageSize;
        }

    }

    public static class ListInstanceIndicesResponseBodyResult extends TeaModel {
        @NameInMap("isManaged")
        public String isManaged;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("size")
        public Long size;

        @NameInMap("managedStatus")
        public String managedStatus;

        @NameInMap("name")
        public String name;

        @NameInMap("health")
        public String health;

        @NameInMap("phase")
        public String phase;

        @NameInMap("ilmExplain")
        public String ilmExplain;

        public static ListInstanceIndicesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceIndicesResponseBodyResult self = new ListInstanceIndicesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceIndicesResponseBodyResult setIsManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public String getIsManaged() {
            return this.isManaged;
        }

        public ListInstanceIndicesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstanceIndicesResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListInstanceIndicesResponseBodyResult setManagedStatus(String managedStatus) {
            this.managedStatus = managedStatus;
            return this;
        }
        public String getManagedStatus() {
            return this.managedStatus;
        }

        public ListInstanceIndicesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceIndicesResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListInstanceIndicesResponseBodyResult setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListInstanceIndicesResponseBodyResult setIlmExplain(String ilmExplain) {
            this.ilmExplain = ilmExplain;
            return this;
        }
        public String getIlmExplain() {
            return this.ilmExplain;
        }

    }

}
