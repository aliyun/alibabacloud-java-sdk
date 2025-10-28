// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterRequest extends TeaModel {
    /**
     * <p>The ID of the namespace. You can call the ListUserDefineRegion operation to query the namespace ID. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
     * <ul>
     * <li>If this parameter is left empty, the clusters in the default namespace are queried.</li>
     * <li>If this parameter is specified, the clusters in the specified namespace are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The ID of the resource group. You can call the ListResourceGroup operation to query the resource group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62055.html">ListResourceGroup</a>.</p>
     * <ul>
     * <li>If this parameter is left empty, the clusters in the default resource group are queried.</li>
     * <li>If this parameter is specified, the clusters in the specified resource group are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>461</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterRequest self = new ListClusterRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
