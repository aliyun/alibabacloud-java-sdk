// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ConvertK8sResourceRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ClusterId")
    public String clusterId;

    public static ConvertK8sResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertK8sResourceRequest self = new ConvertK8sResourceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertK8sResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ConvertK8sResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ConvertK8sResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ConvertK8sResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
