// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateDBInstancePlanRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
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
     * 
     * <strong>example:</strong>
     * <p>{&quot;pause&quot;:{&quot;executeTime&quot;:&quot;2022-08-30T16:00:00Z&quot;}}</p>
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
     * <p> This parameter is required only for <strong>periodically executed</strong> plans.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-04-17T23:00Z</p>
     */
    @NameInMap("PlanEndDate")
    public String planEndDate;

    /**
     * <p>The ID of the plan.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/449398.html">DescribeDBInstancePlans</a> operation to query the details of plans, including plan IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The name of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>test-plan</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The start time of the plan. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p> This parameter is required only for <strong>periodically executed</strong> plans.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-04-17T23:00Z</p>
     */
    @NameInMap("PlanStartDate")
    public String planStartDate;

    public static UpdateDBInstancePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstancePlanRequest self = new UpdateDBInstancePlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstancePlanRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpdateDBInstancePlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDBInstancePlanRequest setPlanConfig(String planConfig) {
        this.planConfig = planConfig;
        return this;
    }
    public String getPlanConfig() {
        return this.planConfig;
    }

    public UpdateDBInstancePlanRequest setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
        return this;
    }
    public String getPlanDesc() {
        return this.planDesc;
    }

    public UpdateDBInstancePlanRequest setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }
    public String getPlanEndDate() {
        return this.planEndDate;
    }

    public UpdateDBInstancePlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateDBInstancePlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public UpdateDBInstancePlanRequest setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }
    public String getPlanStartDate() {
        return this.planStartDate;
    }

}
