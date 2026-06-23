// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateResourcesDeleteProtectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable deletion protection for the resource. Valid values:</p>
     * <ul>
     * <li><p>true: Enables deletion protection. After deletion protection is enabled, you must manually disable deletion protection before you can delete the specified resource.</p>
     * </li>
     * <li><p>false: Disables deletion protection.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The namespace of the resource.</p>
     * <p>Default value: default.</p>
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
     * <p>The type of resource to update. Valid values:</p>
     * <ul>
     * <li><p>namespaces: namespace.</p>
     * </li>
     * <li><p>services: service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>services</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The list of target resources.</p>
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
