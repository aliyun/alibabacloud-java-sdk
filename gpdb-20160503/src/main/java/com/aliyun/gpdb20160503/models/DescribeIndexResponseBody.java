// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testcollection</p>
     */
    @NameInMap("Collection")
    public String collection;

    /**
     * <strong>example:</strong>
     * <p>CREATE INDEX testindex ON mynamespace. testcollection</p>
     */
    @NameInMap("IndexDef")
    public String indexDef;

    /**
     * <strong>example:</strong>
     * <p>testindex</p>
     */
    @NameInMap("IndexName")
    public String indexName;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>mynamespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndexResponseBody self = new DescribeIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIndexResponseBody setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

    public DescribeIndexResponseBody setIndexDef(String indexDef) {
        this.indexDef = indexDef;
        return this;
    }
    public String getIndexDef() {
        return this.indexDef;
    }

    public DescribeIndexResponseBody setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    public String getIndexName() {
        return this.indexName;
    }

    public DescribeIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIndexResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIndexResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
