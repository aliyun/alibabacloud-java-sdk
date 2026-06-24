// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataStreamsResponseBody extends TeaModel {
    /**
     * <p>The response headers.</p>
     */
    @NameInMap("Headers")
    public ListDataStreamsResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the returned data streams.</p>
     */
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
         * <p>The total number of data streams.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X-Managed-Count")
        public Integer xManagedCount;

        /**
         * <p>The total storage size of indexes. Unit: bytes.</p>
         * 
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
         * <p>The time when the data stream list was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The index status. Valid values:</p>
         * <ul>
         * <li><p>Green: healthy.</p>
         * </li>
         * <li><p>Yellow: warning.</p>
         * </li>
         * <li><p>Red: abnormal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Green</p>
         */
        @NameInMap("health")
        public String health;

        /**
         * <p>This field is deprecated and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isManaged")
        public Boolean isManaged;

        /**
         * <p>The managed status of the index. Valid values:</p>
         * <ul>
         * <li><p>following: managed.</p>
         * </li>
         * <li><p>closing: being unmanaged.</p>
         * </li>
         * <li><p>closed: not managed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>following</p>
         */
        @NameInMap("managedStatus")
        public String managedStatus;

        /**
         * <p>The data stream name.</p>
         * 
         * <strong>example:</strong>
         * <p>Log1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total storage space occupied by the current index. Unit: bytes.</p>
         * 
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
         * <p>The data stream status. Valid values:</p>
         * <ul>
         * <li><p>Green: healthy.</p>
         * </li>
         * <li><p>Yellow: warning.</p>
         * </li>
         * <li><p>Red: abnormal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Green</p>
         */
        @NameInMap("health")
        public String health;

        /**
         * <p>The index lifecycle policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>rollver1</p>
         */
        @NameInMap("ilmPolicyName")
        public String ilmPolicyName;

        /**
         * <p>The index template name.</p>
         * 
         * <strong>example:</strong>
         * <p>template1</p>
         */
        @NameInMap("indexTemplateName")
        public String indexTemplateName;

        /**
         * <p>The index information under the current data stream.</p>
         */
        @NameInMap("indices")
        public java.util.List<ListDataStreamsResponseBodyResultIndices> indices;

        /**
         * <p>The total storage space occupied by managed indexes under the current data stream. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1788239393298</p>
         */
        @NameInMap("managedStorageSize")
        public Long managedStorageSize;

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-index-0001</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The total storage space occupied by all indexes under the current data stream. Unit: bytes.</p>
         * 
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
