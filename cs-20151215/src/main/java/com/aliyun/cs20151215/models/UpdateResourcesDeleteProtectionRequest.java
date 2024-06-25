// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateResourcesDeleteProtectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>services</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

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
