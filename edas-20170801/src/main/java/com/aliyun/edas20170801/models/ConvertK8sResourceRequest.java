// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ConvertK8sResourceRequest extends TeaModel {
    /**
     * <p>The ID of the cluster. You can call the ListCluster operation to query the cluster ID. For more information, see [ListCluster](https://help.aliyun.com/document_detail/154995.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The namespace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the resource.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource that is used. Set the value to deployment.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ConvertK8sResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertK8sResourceRequest self = new ConvertK8sResourceRequest();
        return TeaModel.build(map, self);
    }

    public ConvertK8sResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ConvertK8sResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ConvertK8sResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ConvertK8sResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
