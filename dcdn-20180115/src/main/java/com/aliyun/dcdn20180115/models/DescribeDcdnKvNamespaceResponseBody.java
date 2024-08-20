// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvNamespaceResponseBody extends TeaModel {
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The available capacity of all namespaces in your account.</p>
     * 
     * <strong>example:</strong>
     * <p>1 GB</p>
     */
    @NameInMap("CapacityString")
    public String capacityString;

    @NameInMap("CapacityUsed")
    public Long capacityUsed;

    /**
     * <p>The used capacity of all namespaces in your account.</p>
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
     * <p>The system behavior when a key-value pair fails to be obtained at the edge. Valid values:</p>
     * <ul>
     * <li>Normal (default): If a key-value pair fails to be obtained at the edge, DCDN attempts to query the key-value pair from the origin server to ensure global data consistency.</li>
     * <li>Rapid: If a key-value pair fails to be obtained at the edge, an error message indicating that the key does not exist is returned. This feature enhances key-value query performance but may decrease the hit rate of queries. To enable this feature, submit a ticket.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Mode")
    public String mode;

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

    public static DescribeDcdnKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvNamespaceResponseBody self = new DescribeDcdnKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvNamespaceResponseBody setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public DescribeDcdnKvNamespaceResponseBody setCapacityString(String capacityString) {
        this.capacityString = capacityString;
        return this;
    }
    public String getCapacityString() {
        return this.capacityString;
    }

    public DescribeDcdnKvNamespaceResponseBody setCapacityUsed(Long capacityUsed) {
        this.capacityUsed = capacityUsed;
        return this;
    }
    public Long getCapacityUsed() {
        return this.capacityUsed;
    }

    public DescribeDcdnKvNamespaceResponseBody setCapacityUsedString(String capacityUsedString) {
        this.capacityUsedString = capacityUsedString;
        return this;
    }
    public String getCapacityUsedString() {
        return this.capacityUsedString;
    }

    public DescribeDcdnKvNamespaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDcdnKvNamespaceResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeDcdnKvNamespaceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeDcdnKvNamespaceResponseBody setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeDcdnKvNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnKvNamespaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
