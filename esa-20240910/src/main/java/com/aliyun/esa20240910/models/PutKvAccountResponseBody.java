// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvAccountResponseBody extends TeaModel {
    @NameInMap("NamespaceList")
    public java.util.List<PutKvAccountResponseBodyNamespaceList> namespaceList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NamespaceQuota")
    public Integer namespaceQuota;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NamespaceUsed")
    public Integer namespaceUsed;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static PutKvAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutKvAccountResponseBody self = new PutKvAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public PutKvAccountResponseBody setNamespaceList(java.util.List<PutKvAccountResponseBodyNamespaceList> namespaceList) {
        this.namespaceList = namespaceList;
        return this;
    }
    public java.util.List<PutKvAccountResponseBodyNamespaceList> getNamespaceList() {
        return this.namespaceList;
    }

    public PutKvAccountResponseBody setNamespaceQuota(Integer namespaceQuota) {
        this.namespaceQuota = namespaceQuota;
        return this;
    }
    public Integer getNamespaceQuota() {
        return this.namespaceQuota;
    }

    public PutKvAccountResponseBody setNamespaceUsed(Integer namespaceUsed) {
        this.namespaceUsed = namespaceUsed;
        return this;
    }
    public Integer getNamespaceUsed() {
        return this.namespaceUsed;
    }

    public PutKvAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutKvAccountResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class PutKvAccountResponseBodyNamespaceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>the first namespace</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>643355322374688768</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static PutKvAccountResponseBodyNamespaceList build(java.util.Map<String, ?> map) throws Exception {
            PutKvAccountResponseBodyNamespaceList self = new PutKvAccountResponseBodyNamespaceList();
            return TeaModel.build(map, self);
        }

        public PutKvAccountResponseBodyNamespaceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PutKvAccountResponseBodyNamespaceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PutKvAccountResponseBodyNamespaceList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public PutKvAccountResponseBodyNamespaceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
