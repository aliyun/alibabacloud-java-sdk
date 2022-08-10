// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstancePlanRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlanConfig")
    public String planConfig;

    @NameInMap("PlanDesc")
    public String planDesc;

    @NameInMap("PlanEndTime")
    public String planEndTime;

    @NameInMap("PlanName")
    public String planName;

    @NameInMap("PlanScheduleType")
    public String planScheduleType;

    @NameInMap("PlanStartTime")
    public String planStartTime;

    @NameInMap("PlanType")
    public String planType;

    public static CreateDBInstancePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstancePlanRequest self = new CreateDBInstancePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstancePlanRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstancePlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstancePlanRequest setPlanConfig(String planConfig) {
        this.planConfig = planConfig;
        return this;
    }
    public String getPlanConfig() {
        return this.planConfig;
    }

    public CreateDBInstancePlanRequest setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
        return this;
    }
    public String getPlanDesc() {
        return this.planDesc;
    }

    public CreateDBInstancePlanRequest setPlanEndTime(String planEndTime) {
        this.planEndTime = planEndTime;
        return this;
    }
    public String getPlanEndTime() {
        return this.planEndTime;
    }

    public CreateDBInstancePlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public CreateDBInstancePlanRequest setPlanScheduleType(String planScheduleType) {
        this.planScheduleType = planScheduleType;
        return this;
    }
    public String getPlanScheduleType() {
        return this.planScheduleType;
    }

    public CreateDBInstancePlanRequest setPlanStartTime(String planStartTime) {
        this.planStartTime = planStartTime;
        return this;
    }
    public String getPlanStartTime() {
        return this.planStartTime;
    }

    public CreateDBInstancePlanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

}
