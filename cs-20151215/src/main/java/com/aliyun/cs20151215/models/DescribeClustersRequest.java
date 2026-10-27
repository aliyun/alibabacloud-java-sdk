// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClustersRequest extends TeaModel {
    /**
     * <p>The cluster type.</p>
     * 
     * <strong>example:</strong>
     * <p>ManagedKubernetes</p>
     */
    @NameInMap("clusterType")
    public String clusterType;

    /**
     * <p>The cluster name used for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the resource group used to filter clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-a1b2c3d4e5f6g7h</p>
     */
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    public static DescribeClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersRequest self = new DescribeClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClustersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
