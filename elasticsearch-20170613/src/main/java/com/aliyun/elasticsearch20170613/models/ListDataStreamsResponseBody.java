// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataStreamsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListDataStreamsResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDataStreamsResponseBodyResult> result;

    public static ListDataStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataStreamsResponseBody self = new ListDataStreamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataStreamsResponseBody setHeaders(ListDataStreamsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListDataStreamsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListDataStreamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataStreamsResponseBody setResult(java.util.List<ListDataStreamsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataStreamsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataStreamsResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Managed-Count")
        public Integer xManagedCount;

        @NameInMap("X-Managed-StorageSize")
        public Long xManagedStorageSize;

        public static ListDataStreamsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListDataStreamsResponseBodyHeaders self = new ListDataStreamsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListDataStreamsResponseBodyHeaders setXManagedCount(Integer xManagedCount) {
            this.xManagedCount = xManagedCount;
            return this;
        }
        public Integer getXManagedCount() {
            return this.xManagedCount;
        }

        public ListDataStreamsResponseBodyHeaders setXManagedStorageSize(Long xManagedStorageSize) {
            this.xManagedStorageSize = xManagedStorageSize;
            return this;
        }
        public Long getXManagedStorageSize() {
            return this.xManagedStorageSize;
        }

    }

    public static class ListDataStreamsResponseBodyResultIndices extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("health")
        public String health;

        @NameInMap("isManaged")
        public Boolean isManaged;

        @NameInMap("managedStatus")
        public String managedStatus;

        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public Long size;

        public static ListDataStreamsResponseBodyResultIndices build(java.util.Map<String, ?> map) throws Exception {
            ListDataStreamsResponseBodyResultIndices self = new ListDataStreamsResponseBodyResultIndices();
            return TeaModel.build(map, self);
        }

        public ListDataStreamsResponseBodyResultIndices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataStreamsResponseBodyResultIndices setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListDataStreamsResponseBodyResultIndices setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public ListDataStreamsResponseBodyResultIndices setManagedStatus(String managedStatus) {
            this.managedStatus = managedStatus;
            return this;
        }
        public String getManagedStatus() {
            return this.managedStatus;
        }

        public ListDataStreamsResponseBodyResultIndices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataStreamsResponseBodyResultIndices setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class ListDataStreamsResponseBodyResult extends TeaModel {
        @NameInMap("health")
        public String health;

        @NameInMap("ilmPolicyName")
        public String ilmPolicyName;

        @NameInMap("indexTemplateName")
        public String indexTemplateName;

        @NameInMap("indices")
        public java.util.List<ListDataStreamsResponseBodyResultIndices> indices;

        @NameInMap("managedStorageSize")
        public Long managedStorageSize;

        @NameInMap("name")
        public String name;

        @NameInMap("totalStorageSize")
        public Long totalStorageSize;

        public static ListDataStreamsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataStreamsResponseBodyResult self = new ListDataStreamsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataStreamsResponseBodyResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public ListDataStreamsResponseBodyResult setIlmPolicyName(String ilmPolicyName) {
            this.ilmPolicyName = ilmPolicyName;
            return this;
        }
        public String getIlmPolicyName() {
            return this.ilmPolicyName;
        }

        public ListDataStreamsResponseBodyResult setIndexTemplateName(String indexTemplateName) {
            this.indexTemplateName = indexTemplateName;
            return this;
        }
        public String getIndexTemplateName() {
            return this.indexTemplateName;
        }

        public ListDataStreamsResponseBodyResult setIndices(java.util.List<ListDataStreamsResponseBodyResultIndices> indices) {
            this.indices = indices;
            return this;
        }
        public java.util.List<ListDataStreamsResponseBodyResultIndices> getIndices() {
            return this.indices;
        }

        public ListDataStreamsResponseBodyResult setManagedStorageSize(Long managedStorageSize) {
            this.managedStorageSize = managedStorageSize;
            return this;
        }
        public Long getManagedStorageSize() {
            return this.managedStorageSize;
        }

        public ListDataStreamsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataStreamsResponseBodyResult setTotalStorageSize(Long totalStorageSize) {
            this.totalStorageSize = totalStorageSize;
            return this;
        }
        public Long getTotalStorageSize() {
            return this.totalStorageSize;
        }

    }

}
