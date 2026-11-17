// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class LogOffAllSessionsInAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The delivery group ID.</p>
     * <p>Note:</p>
     * <ul>
     * <li>The delivery group must meet the following status requirements:</li>
     * </ul>
     * <ol>
     * <li>ChargeType=PostPaid</li>
     * <li>NodePool.StrategyType=NODE_SCALING_BY_SCHEDULE</li>
     * <li>Status=PUBLISHED</li>
     * <li>The current time is not within the NodePool.RecurrenceSchedules window.</li>
     * </ol>
     * <ul>
     * <li>You can call the ListAppInstanceGroup or GetAppInstanceGroup operation to query the current status of the delivery group.</li>
     * <li>You can call the CreateAppInstanceGroup operation to create a delivery group that meets the requirements.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static LogOffAllSessionsInAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        LogOffAllSessionsInAppInstanceGroupRequest self = new LogOffAllSessionsInAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public LogOffAllSessionsInAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public LogOffAllSessionsInAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
