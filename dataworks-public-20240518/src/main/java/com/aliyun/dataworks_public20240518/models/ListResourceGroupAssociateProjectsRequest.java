// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupAssociateProjectsRequest extends TeaModel {
    /**
     * <p>The ID of the serverless resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListResourceGroupAssociateProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupAssociateProjectsRequest self = new ListResourceGroupAssociateProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupAssociateProjectsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
