// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvNamespaceResponseBody extends TeaModel {
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D61E4801-EAFF-4A63-AAE1-FBF6CE1CFD1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static PutDcdnKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvNamespaceResponseBody self = new PutDcdnKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvNamespaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutDcdnKvNamespaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutDcdnKvNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public PutDcdnKvNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutDcdnKvNamespaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
