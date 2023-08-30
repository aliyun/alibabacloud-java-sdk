// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvNamespaceResponseBody extends TeaModel {
    /**
     * <p>The available capacity of all namespaces in your account.</p>
     */
    @NameInMap("CapacityString")
    public String capacityString;

    /**
     * <p>The used capacity of all namespaces in your account.</p>
     */
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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeDcdnKvNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvNamespaceResponseBody self = new DescribeDcdnKvNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvNamespaceResponseBody setCapacityString(String capacityString) {
        this.capacityString = capacityString;
        return this;
    }
    public String getCapacityString() {
        return this.capacityString;
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
