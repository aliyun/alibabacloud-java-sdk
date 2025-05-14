// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeResourcesDeleteProtectionRequest extends TeaModel {
    /**
     * <p>The namespace in which the resources that you want to query reside.</p>
     * <p>This parameter is required when you set resource_type to services. Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The names of the resources that you want to query. Separate multiple resource names with commas (,).</p>
     * <ul>
     * <li>When you set resource_type to namespaces, you must specify namespace names. If you leave this parameter empty, all namespaces in the cluster are queried.</li>
     * <li>If you set resource_type to services, you must specify Service names.</li>
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
