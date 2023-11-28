// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesResponseBody extends TeaModel {
    /**
     * <p>The total size of the OpenStore cold stage index for this instance. Unit: bytes.</p>
     */
    @NameInMap("Headers")
    public ListInstanceIndicesResponseBodyHeaders headers;

    /**
     * <p>The total number of indexes in Cloud Hosting.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total storage space occupied by the current index. Unit: bytes.</p>
     */
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
        /**
         * <p>The details of the index list.</p>
         */
        @NameInMap("X-Managed-Count")
        public Integer xManagedCount;

        /**
         * <p>The total number of indexes in the OpenStore cold phase.</p>
         */
        @NameInMap("X-Managed-StorageSize")
        public Long xManagedStorageSize;

        /**
         * <p>The time when the index list was queried.</p>
         */
        @NameInMap("X-OSS-Count")
        public Integer xOSSCount;

        /**
         * <p>This parameter is deprecated.</p>
         */
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
        /**
         * <p>The name of the Elasticsearch index.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("health")
        public String health;

        @NameInMap("ilmExplain")
        public String ilmExplain;

        /**
         * <p>The managed status of the index. The following three statuses are supported:</p>
         * <br>
         * <p>*   following: Hosting.</p>
         * <p>*   closing: The instance is being unhosted.</p>
         * <p>*   closed: unmanaged.</p>
         */
        @NameInMap("isManaged")
        public String isManaged;

        /**
         * <p>The current storage lifecycle. Value meaning:</p>
         * <br>
         * <p>*   warm: warm.</p>
         * <p>*   cold: the cold phase.</p>
         * <p>*   hot: hot phase.</p>
         * <p>*   delete: deletes a stage.</p>
         * <br>
         * <p>>  If this parameter is empty, the current index is not managed by the lifecycle.</p>
         */
        @NameInMap("managedStatus")
        public String managedStatus;

        /**
         * <p>The full lifecycle status of the current index.</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("phase")
        public String phase;

        /**
         * <p>The running status of the index. The following three statuses are supported:</p>
         * <br>
         * <p>*   green: healthy.</p>
         * <p>*   yellow: alerts.</p>
         * <p>*   red: an exception.</p>
         */
        @NameInMap("size")
        public Long size;

        public static ListInstanceIndicesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceIndicesResponseBodyResult self = new ListInstanceIndicesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceIndicesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstanceIndicesResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListInstanceIndicesResponseBodyResult setIlmExplain(String ilmExplain) {
            this.ilmExplain = ilmExplain;
            return this;
        }
        public String getIlmExplain() {
            return this.ilmExplain;
        }

        public ListInstanceIndicesResponseBodyResult setIsManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public String getIsManaged() {
            return this.isManaged;
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

        public ListInstanceIndicesResponseBodyResult setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListInstanceIndicesResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
