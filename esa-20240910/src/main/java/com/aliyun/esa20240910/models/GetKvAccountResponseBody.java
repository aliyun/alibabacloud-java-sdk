// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvAccountResponseBody extends TeaModel {
    /**
     * <p>The available capacity of all namespaces in the account. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The available capacity of all namespaces in the account.</p>
     * 
     * <strong>example:</strong>
     * <p>1 GB</p>
     */
    @NameInMap("CapacityString")
    public String capacityString;

    /**
     * <p>The used capacity of all namespaces in the account. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10048576</p>
     */
    @NameInMap("CapacityUsed")
    public Long capacityUsed;

    /**
     * <p>The used capacity of all namespaces in the account.</p>
     * 
     * <strong>example:</strong>
     * <p>100 MB</p>
     */
    @NameInMap("CapacityUsedString")
    public String capacityUsedString;

    /**
     * <p>The namespaces in the account.</p>
     */
    @NameInMap("NamespaceList")
    public java.util.List<GetKvAccountResponseBodyNamespaceList> namespaceList;

    /**
     * <p>The maximum number of namespaces that can be created in the account.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NamespaceQuota")
    public Integer namespaceQuota;

    /**
     * <p>The number of created namespaces that store key-value data in the account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NamespaceUsed")
    public Integer namespaceUsed;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether Edge KV is activated for the Alibaba Cloud account.</p>
     * <ul>
     * <li><strong>online</strong></li>
     * <li><strong>offline</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetKvAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKvAccountResponseBody self = new GetKvAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKvAccountResponseBody setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public GetKvAccountResponseBody setCapacityString(String capacityString) {
        this.capacityString = capacityString;
        return this;
    }
    public String getCapacityString() {
        return this.capacityString;
    }

    public GetKvAccountResponseBody setCapacityUsed(Long capacityUsed) {
        this.capacityUsed = capacityUsed;
        return this;
    }
    public Long getCapacityUsed() {
        return this.capacityUsed;
    }

    public GetKvAccountResponseBody setCapacityUsedString(String capacityUsedString) {
        this.capacityUsedString = capacityUsedString;
        return this;
    }
    public String getCapacityUsedString() {
        return this.capacityUsedString;
    }

    public GetKvAccountResponseBody setNamespaceList(java.util.List<GetKvAccountResponseBodyNamespaceList> namespaceList) {
        this.namespaceList = namespaceList;
        return this;
    }
    public java.util.List<GetKvAccountResponseBodyNamespaceList> getNamespaceList() {
        return this.namespaceList;
    }

    public GetKvAccountResponseBody setNamespaceQuota(Integer namespaceQuota) {
        this.namespaceQuota = namespaceQuota;
        return this;
    }
    public Integer getNamespaceQuota() {
        return this.namespaceQuota;
    }

    public GetKvAccountResponseBody setNamespaceUsed(Integer namespaceUsed) {
        this.namespaceUsed = namespaceUsed;
        return this;
    }
    public Integer getNamespaceUsed() {
        return this.namespaceUsed;
    }

    public GetKvAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKvAccountResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetKvAccountResponseBodyNamespaceList extends TeaModel {
        /**
         * <p>The available capacity of the namespace. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The available capacity of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1 GB</p>
         */
        @NameInMap("CapacityString")
        public String capacityString;

        /**
         * <p>The used capacity of the namespace. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>100048576</p>
         */
        @NameInMap("CapacityUsed")
        public Long capacityUsed;

        /**
         * <p>The used capacity of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>100 MB</p>
         */
        @NameInMap("CapacityUsedString")
        public String capacityUsedString;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>the first namespace</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>643355322374688768</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The status of the namespace. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: normal.</li>
         * <li><strong>delete</strong>: pending deletion.</li>
         * <li><strong>deleting</strong>: being deleted.</li>
         * <li><strong>deleted</strong>: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetKvAccountResponseBodyNamespaceList build(java.util.Map<String, ?> map) throws Exception {
            GetKvAccountResponseBodyNamespaceList self = new GetKvAccountResponseBodyNamespaceList();
            return TeaModel.build(map, self);
        }

        public GetKvAccountResponseBodyNamespaceList setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public GetKvAccountResponseBodyNamespaceList setCapacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }
        public String getCapacityString() {
            return this.capacityString;
        }

        public GetKvAccountResponseBodyNamespaceList setCapacityUsed(Long capacityUsed) {
            this.capacityUsed = capacityUsed;
            return this;
        }
        public Long getCapacityUsed() {
            return this.capacityUsed;
        }

        public GetKvAccountResponseBodyNamespaceList setCapacityUsedString(String capacityUsedString) {
            this.capacityUsedString = capacityUsedString;
            return this;
        }
        public String getCapacityUsedString() {
            return this.capacityUsedString;
        }

        public GetKvAccountResponseBodyNamespaceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKvAccountResponseBodyNamespaceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetKvAccountResponseBodyNamespaceList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetKvAccountResponseBodyNamespaceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
