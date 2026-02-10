// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListIndicesResponseBody extends TeaModel {
    @NameInMap("Indices")
    public ListIndicesResponseBodyIndices indices;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>.</li>
     * <li><strong>fail</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListIndicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndicesResponseBody self = new ListIndicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndicesResponseBody setIndices(ListIndicesResponseBodyIndices indices) {
        this.indices = indices;
        return this;
    }
    public ListIndicesResponseBodyIndices getIndices() {
        return this.indices;
    }

    public ListIndicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIndicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndicesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListIndicesResponseBodyIndicesIndices extends TeaModel {
        @NameInMap("Collection")
        public String collection;

        @NameInMap("IndexDef")
        public String indexDef;

        @NameInMap("IndexName")
        public String indexName;

        @NameInMap("Namespace")
        public String namespace;

        public static ListIndicesResponseBodyIndicesIndices build(java.util.Map<String, ?> map) throws Exception {
            ListIndicesResponseBodyIndicesIndices self = new ListIndicesResponseBodyIndicesIndices();
            return TeaModel.build(map, self);
        }

        public ListIndicesResponseBodyIndicesIndices setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public ListIndicesResponseBodyIndicesIndices setIndexDef(String indexDef) {
            this.indexDef = indexDef;
            return this;
        }
        public String getIndexDef() {
            return this.indexDef;
        }

        public ListIndicesResponseBodyIndicesIndices setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public ListIndicesResponseBodyIndicesIndices setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class ListIndicesResponseBodyIndices extends TeaModel {
        @NameInMap("Indices")
        public java.util.List<ListIndicesResponseBodyIndicesIndices> indices;

        public static ListIndicesResponseBodyIndices build(java.util.Map<String, ?> map) throws Exception {
            ListIndicesResponseBodyIndices self = new ListIndicesResponseBodyIndices();
            return TeaModel.build(map, self);
        }

        public ListIndicesResponseBodyIndices setIndices(java.util.List<ListIndicesResponseBodyIndicesIndices> indices) {
            this.indices = indices;
            return this;
        }
        public java.util.List<ListIndicesResponseBodyIndicesIndices> getIndices() {
            return this.indices;
        }

    }

}
