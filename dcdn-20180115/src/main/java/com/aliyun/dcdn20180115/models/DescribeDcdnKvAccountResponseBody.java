// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvAccountResponseBody extends TeaModel {
    @NameInMap("CapacityString")
    public String capacityString;

    @NameInMap("CapacityUsedString")
    public String capacityUsedString;

    /**
     * <p>Details about the namespaces.</p>
     */
    @NameInMap("NamespaceList")
    public java.util.List<DescribeDcdnKvAccountResponseBodyNamespaceList> namespaceList;

    /**
     * <p>The maximum number of namespaces that you can apply for by using your account.</p>
     */
    @NameInMap("NamespaceQuota")
    public Integer namespaceQuota;

    /**
     * <p>The number of namespaces that you applied for by using your account.</p>
     */
    @NameInMap("NamespaceUsed")
    public Integer namespaceUsed;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the account.</p>
     * <br>
     * <p>*   **online**: enabled</p>
     * <p>*   **offline**: disabled</p>
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
        @NameInMap("CapacityString")
        public String capacityString;

        @NameInMap("CapacityUsedString")
        public String capacityUsedString;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The status of the namespace. Valid values:</p>
         * <br>
         * <p>*   **online**: normal</p>
         * <p>*   **delete**: pending delete</p>
         * <p>*   **deleting**: being deleted</p>
         * <p>*   **deleted**: deleted</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDcdnKvAccountResponseBodyNamespaceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnKvAccountResponseBodyNamespaceList self = new DescribeDcdnKvAccountResponseBodyNamespaceList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnKvAccountResponseBodyNamespaceList setCapacityString(String capacityString) {
            this.capacityString = capacityString;
            return this;
        }
        public String getCapacityString() {
            return this.capacityString;
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
