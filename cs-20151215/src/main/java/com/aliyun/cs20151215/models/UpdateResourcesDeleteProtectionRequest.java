// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateResourcesDeleteProtectionRequest extends TeaModel {
    /**
     * <p>Specify whether to enable deletion protection. Set the value to true to enable deletion protection and set the value to false to disable deletion protection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The namespace to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The type of resource for which deletion protection is enabled or disabled. You can specify namespaces or Services.</p>
     * 
     * <strong>example:</strong>
     * <p>services</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The resources list.</p>
     */
    @NameInMap("resources")
    public java.util.List<String> resources;

    public static UpdateResourcesDeleteProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourcesDeleteProtectionRequest self = new UpdateResourcesDeleteProtectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourcesDeleteProtectionRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateResourcesDeleteProtectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateResourcesDeleteProtectionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateResourcesDeleteProtectionRequest setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
