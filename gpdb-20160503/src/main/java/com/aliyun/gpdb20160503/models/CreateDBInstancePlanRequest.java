// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstancePlanRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The execution information of the plan. Specify the parameter in the JSON format. The parameter value varies based on the values of <strong>PlanType</strong> and <strong>PlanScheduleType</strong>. The following section describes the PlanConfig parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pause&quot;:{&quot;planCronTime&quot;:&quot;0 0 12 1/1 * ? &quot;},&quot;resume&quot;:{&quot;planCronTime&quot;:&quot;0 0 0 1/1 * ? &quot;}}</p>
     */
    @NameInMap("PlanConfig")
    public String planConfig;

    /**
     * <p>The description of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test plan</p>
     */
    @NameInMap("PlanDesc")
    public String planDesc;

    /**
     * <p>The end time of the plan. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC. The end time must be later than the start time.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified only when <strong>PlanScheduleType</strong> is set to <strong>Regular</strong>.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the plan does not end.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2023-04-17T23:00Z</p>
     */
    @NameInMap("PlanEndDate")
    public String planEndDate;

    /**
     * <p>The name of the plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-plan</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The execution mode of the plan. Valid values:</p>
     * <ul>
     * <li><strong>Postpone</strong>: The plan is executed later.</li>
     * <li><strong>Regular</strong>: The plan is executed periodically.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Regular</p>
     */
    @NameInMap("PlanScheduleType")
    public String planScheduleType;

    /**
     * <p>The start time of the plan. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter must be specified only when <strong>PlanScheduleType</strong> is set to <strong>Regular</strong>.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the plan is executed immediately.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-04-17T23:00Z</p>
     */
    @NameInMap("PlanStartDate")
    public String planStartDate;

    /**
     * <p>The type of the plan. Valid values:</p>
     * <ul>
     * <li><strong>PauseResume</strong>: pauses and resumes an instance.</li>
     * <li><strong>Resize</strong>: changes the number of compute nodes.</li>
     * <li><strong>ModifySpec</strong>: changes compute node specifications.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can specify the value to Resize only for instances in Serverless mode.</p>
     * </li>
     * <li><p>You can specify the value to ModifySpec only for instances in elastic storage mode.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PauseResume</p>
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
