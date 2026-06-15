// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePlanMaintenanceWindowRequest extends TeaModel {
    /**
     * <p>The ID of the maintenance window to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pw-bp12kkvnebe7hksqnx9w</p>
     */
    @NameInMap("PlanWindowId")
    public String planWindowId;

    /**
     * <p>The ID of the region. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to retrieve the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeletePlanMaintenanceWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePlanMaintenanceWindowRequest self = new DeletePlanMaintenanceWindowRequest();
        return TeaModel.build(map, self);
    }

    public DeletePlanMaintenanceWindowRequest setPlanWindowId(String planWindowId) {
        this.planWindowId = planWindowId;
        return this;
    }
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    public DeletePlanMaintenanceWindowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
