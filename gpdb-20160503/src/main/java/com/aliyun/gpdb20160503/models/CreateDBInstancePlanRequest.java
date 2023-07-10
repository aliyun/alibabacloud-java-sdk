// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstancePlanRequest extends TeaModel {
    /**
     * <p>The ID of instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The execution information of the plan. Specify the parameter in the JSON format. The parameter value varies based on the values of the **PlanType** and **PlanScheduleType** parameters. The following section describes the PlanConfig parameter.</p>
     */
    @NameInMap("PlanConfig")
    public String planConfig;

    /**
     * <p>The description of the plan.</p>
     */
    @NameInMap("PlanDesc")
    public String planDesc;

    /**
     * <p>The end time of the plan. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC. The end time must be later than the start time.</p>
     * <br>
     * <p>> *   This parameter is required only if the **PlanScheduleType** parameter is set to **Regular**.</p>
     * <p>> *   If you do not specify this parameter, the plan does not end.</p>
     */
    @NameInMap("PlanEndDate")
    public String planEndDate;

    /**
     * <p>The name of the plan.</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The execution mode of the plan. Valid values:</p>
     * <br>
     * <p>*   **Postpone**: The plan is executed later.</p>
     * <p>*   **Regular**: The plan is executed periodically.</p>
     */
    @NameInMap("PlanScheduleType")
    public String planScheduleType;

    /**
     * <p>The start time of the plan. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  *   This parameter is required only if the **PlanScheduleType** parameter is set to **Regular**.</p>
     * <p>>  *   If you do not specify this parameter, the plan is executed immediately.</p>
     */
    @NameInMap("PlanStartDate")
    public String planStartDate;

    /**
     * <p>The type of the plan. Valid values:</p>
     * <br>
     * <p>*   **PauseResume**: pauses and resumes an instance.</p>
     * <p>*   **Resize**: changes the number of compute nodes.</p>
     * <p>*   **ModifySpec**: changes compute node specifications.</p>
     * <br>
     * <p>> *   You can specify the value to Resize only for instances in Serverless mode.</p>
     * <p>> *   You can specify the value to ModifySpec only for instances in elastic storage mode.</p>
     */
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

    public CreateDBInstancePlanRequest setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }
    public String getPlanEndDate() {
        return this.planEndDate;
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

    public CreateDBInstancePlanRequest setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }
    public String getPlanStartDate() {
        return this.planStartDate;
    }

    public CreateDBInstancePlanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

}
