// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvAccountResponseBody extends TeaModel {
    /**
     * <p>The available capacity of all namespaces.</p>
     * 
     * <strong>example:</strong>
     * <p>2GB</p>
     */
    @NameInMap("CapacityString")
    public String capacityString;

    /**
     * <p>All namespaces have used capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>200 MB</p>
     */
    @NameInMap("CapacityUsedString")
    public String capacityUsedString;

    /**
     * <p>Details about the namespaces.</p>
     */
    @NameInMap("NamespaceList")
    public java.util.List<DescribeDcdnKvAccountResponseBodyNamespaceList> namespaceList;

    /**
     * <p>The maximum number of namespaces that you can apply for by using your account.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NamespaceQuota")
    public Integer namespaceQuota;

    /**
     * <p>The number of namespaces that you applied for by using your account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NamespaceUsed")
    public Integer namespaceUsed;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D61E4801-EAFF-4A63-AAE1-FBF6CE1CFD1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the account.</p>
     * <ul>
     * <li><strong>online</strong>: enabled</li>
     * <li><strong>offline</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online,offline</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDcdnKvAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvAccountResponseBody self = new DescribeDcdnKvAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvAccountResponseBody setCapacityString(String capacityString) {
        this.capacityString = capacityString;
        return this;
    }
    public String getCapacityString() {
        return this.capacityString;
    }

    public DescribeDcdnKvAccountResponseBody setCapacityUsedString(String capacityUsedString) {
        this.capacityUsedString = capacityUsedString;
        return this;
    }
    public String getCapacityUsedString() {
        return this.capacityUsedString;
    }

    public DescribeDcdnKvAccountResponseBody setNamespaceList(java.util.List<DescribeDcdnKvAccountResponseBodyNamespaceList> namespaceList) {
        this.namespaceList = namespaceList;
        return this;
    }
    public java.util.List<DescribeDcdnKvAccountResponseBodyNamespaceList> getNamespaceList() {
        return this.namespaceList;
    }

    public DescribeDcdnKvAccountResponseBody setNamespaceQuota(Integer namespaceQuota) {
        this.namespaceQuota = namespaceQuota;
        return this;
    }
    public Integer getNamespaceQuota() {
        return this.namespaceQuota;
    }

    public DescribeDcdnKvAccountResponseBody setNamespaceUsed(Integer namespaceUsed) {
        this.namespaceUsed = namespaceUsed;
        return this;
    }
    public Integer getNamespaceUsed() {
        return this.namespaceUsed;
    }

    public DescribeDcdnKvAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnKvAccountResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeDcdnKvAccountResponseBodyNamespaceList extends TeaModel {
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

        @NameInMap("CapacityUsed")
        public Long capacityUsed;

        /**
         * <p>The namespace has used capacity.</p>
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
         * <p>ns1</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>12423131231****</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The status of the namespace. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: normal</li>
         * <li><strong>delete</strong>: pending delete</li>
         * <li><strong>deleting</strong>: being deleted</li>
         * <li><strong>deleted</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDcdnKvAccountResponseBodyNamespaceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnKvAccountResponseBodyNamespaceList self = new DescribeDcdnKvAccountResponseBodyNamespaceList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setCapacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }
        public String getCapacityString() {
            return this.capacityString;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setCapacityUsed(Long capacityUsed) {
            this.capacityUsed = capacityUsed;
            return this;
        }
        public Long getCapacityUsed() {
            return this.capacityUsed;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setCapacityUsedString(String capacityUsedString) {
            this.capacityUsedString = capacityUsedString;
            return this;
        }
        public String getCapacityUsedString() {
            return this.capacityUsedString;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
