// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDBInstancePlanStatusRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlanId")
    public String planId;

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
