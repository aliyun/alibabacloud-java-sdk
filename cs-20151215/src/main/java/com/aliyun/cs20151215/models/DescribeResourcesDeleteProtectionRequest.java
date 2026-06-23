// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeResourcesDeleteProtectionRequest extends TeaModel {
    /**
     * <p>The namespace of the resource to query.</p>
     * <p>This parameter is required when resource_type is set to services. If this parameter is not specified, the namespace defaults to default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The name of the resource to query. Separate multiple resources with commas (,).</p>
     * <ul>
     * <li><p>If resource_type is set to namespaces, set this parameter to namespace names. If this parameter is not specified, the deletion protection status of all namespaces in the cluster is queried.</p>
     * </li>
     * <li><p>If resource_type is set to services, this parameter is required. Set this parameter to service names.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test1,test2</p>
     */
    @NameInMap("resources")
    public String resources;

    public static DescribeResourcesDeleteProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesDeleteProtectionRequest self = new DescribeResourcesDeleteProtectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesDeleteProtectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeResourcesDeleteProtectionRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
