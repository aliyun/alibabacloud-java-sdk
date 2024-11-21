// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateKvNamespaceResponseBody extends TeaModel {
    /**
     * <p>The description of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test ns.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The updated name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>new_ns1</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static UpdateKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKvNamespaceResponseBody self = new UpdateKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKvNamespaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKvNamespaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateKvNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateKvNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKvNamespaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
