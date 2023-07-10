// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDBInstancePlanStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the plan.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstancePlans](~~449398~~) operation to query the details of plans, including plan IDs.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>Specifies whether to enable or disable the plan. Valid values:</p>
     * <br>
     * <p>*   **disable**: disables the plan.</p>
     * <p>*   **enable**: enables the plan.</p>
     */
    @NameInMap("PlanStatus")
    public String planStatus;

    public static SetDBInstancePlanStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDBInstancePlanStatusRequest self = new SetDBInstancePlanStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDBInstancePlanStatusRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SetDBInstancePlanStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDBInstancePlanStatusRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public SetDBInstancePlanStatusRequest setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
        return this;
    }
    public String getPlanStatus() {
        return this.planStatus;
    }

}
