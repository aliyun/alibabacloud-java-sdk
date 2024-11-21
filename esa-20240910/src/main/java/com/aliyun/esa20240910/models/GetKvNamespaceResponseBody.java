// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvNamespaceResponseBody extends TeaModel {
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
     * <p>10048576</p>
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
     * <p>643355322374688768</p>
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

    public static GetKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKvNamespaceResponseBody self = new GetKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKvNamespaceResponseBody setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public GetKvNamespaceResponseBody setCapacityString(String capacityString) {
        this.capacityString = capacityString;
        return this;
    }
    public String getCapacityString() {
        return this.capacityString;
    }

    public GetKvNamespaceResponseBody setCapacityUsed(Long capacityUsed) {
        this.capacityUsed = capacityUsed;
        return this;
    }
    public Long getCapacityUsed() {
        return this.capacityUsed;
    }

    public GetKvNamespaceResponseBody setCapacityUsedString(String capacityUsedString) {
        this.capacityUsedString = capacityUsedString;
        return this;
    }
    public String getCapacityUsedString() {
        return this.capacityUsedString;
    }

    public GetKvNamespaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetKvNamespaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetKvNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public GetKvNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKvNamespaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
