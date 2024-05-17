// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListClusterRequest extends TeaModel {
    /**
     * <p>The ID of the namespace. You can call the ListUserDefineRegion operation to query the namespace ID. For more information, see [ListUserDefineRegion](https://help.aliyun.com/document_detail/149377.html).</p>
     * <br>
     * <p>*   If this parameter is left empty, the clusters in the default namespace are queried.</p>
     * <p>*   If this parameter is specified, the clusters in the specified namespace are queried.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The ID of the resource group. You can call the ListResourceGroup operation to query the resource group ID. For more information, see [ListResourceGroup](https://help.aliyun.com/document_detail/62055.html).</p>
     * <br>
     * <p>*   If this parameter is left empty, the clusters in the default resource group are queried.</p>
     * <p>*   If this parameter is specified, the clusters in the specified resource group are queried.</p>
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
