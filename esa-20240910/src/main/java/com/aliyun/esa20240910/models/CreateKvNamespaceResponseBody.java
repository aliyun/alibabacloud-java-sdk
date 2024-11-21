// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateKvNamespaceResponseBody extends TeaModel {
    /**
     * <p>The description of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test namespace.</p>
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
     * <p>657717877171818496</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the namespace. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: working as expected.</li>
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

    public static CreateKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKvNamespaceResponseBody self = new CreateKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKvNamespaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKvNamespaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateKvNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateKvNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKvNamespaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
