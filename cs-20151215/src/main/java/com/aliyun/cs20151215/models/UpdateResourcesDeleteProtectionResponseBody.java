// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateResourcesDeleteProtectionResponseBody extends TeaModel {
    /**
     * <p>The namespace of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The deletion protection status of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("protection")
    public String protection;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0527ac9a-c899-4341-a21a-xxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>namespaces</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The list of resources for which the deletion protection status is updated.</p>
     */
    @NameInMap("resources")
    public java.util.List<String> resources;

    public static UpdateResourcesDeleteProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourcesDeleteProtectionResponseBody self = new UpdateResourcesDeleteProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourcesDeleteProtectionResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateResourcesDeleteProtectionResponseBody setProtection(String protection) {
        this.protection = protection;
        return this;
    }
    public String getProtection() {
        return this.protection;
    }

    public UpdateResourcesDeleteProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourcesDeleteProtectionResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateResourcesDeleteProtectionResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
