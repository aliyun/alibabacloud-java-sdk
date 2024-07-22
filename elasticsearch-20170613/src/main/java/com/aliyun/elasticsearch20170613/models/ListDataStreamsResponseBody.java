// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataStreamsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListDataStreamsResponseBodyHeaders headers;

    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X-Managed-Count")
        public Integer xManagedCount;

        /**
         * <strong>example:</strong>
         * <p>143993923932990</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>Green</p>
         */
        @NameInMap("health")
        public String health;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isManaged")
        public Boolean isManaged;

        /**
         * <strong>example:</strong>
         * <p>following</p>
         */
        @NameInMap("managedStatus")
        public String managedStatus;

        /**
         * <strong>example:</strong>
         * <p>Log1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>15393899</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>Green</p>
         */
        @NameInMap("health")
        public String health;

        /**
         * <strong>example:</strong>
         * <p>rollver1</p>
         */
        @NameInMap("ilmPolicyName")
        public String ilmPolicyName;

        /**
         * <strong>example:</strong>
         * <p>template1</p>
         */
        @NameInMap("indexTemplateName")
        public String indexTemplateName;

        @NameInMap("indices")
        public java.util.List<ListDataStreamsResponseBodyResultIndices> indices;

        /**
         * <strong>example:</strong>
         * <p>1788239393298</p>
         */
        @NameInMap("managedStorageSize")
        public Long managedStorageSize;

        /**
         * <strong>example:</strong>
         * <p>my-index-0001</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1788239393298</p>
         */
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
