// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
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
     * <p>The time used to filter plans. If you specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format, the plans created before this time are returned. The time must be in UTC. If you do not specify this parameter, all plans are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-17T23:00Z</p>
     */
    @NameInMap("PlanCreateDate")
    public String planCreateDate;

    /**
     * <p>The description of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test plan</p>
     */
    @NameInMap("PlanDesc")
    public String planDesc;

    /**
     * <p>The plan ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/449398.html">DescribeDBInstancePlans</a> operation to query the information about plans, including plan IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The execution mode of the plan. Valid values:</p>
     * <ul>
     * <li><strong>Postpone</strong>: The plan is executed later.</li>
     * <li><strong>Regular</strong>: The plan is executed periodically.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Regular</p>
     */
    @NameInMap("PlanScheduleType")
    public String planScheduleType;

    /**
     * <p>The type of the plan. Valid values:</p>
     * <ul>
     * <li><strong>PauseResume</strong>: pauses and resumes an instance.</li>
     * <li><strong>Resize</strong>: scales an instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PauseResume</p>
     */
    @NameInMap("PlanType")
    public String planType;

    public static DescribeDBInstancePlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePlansRequest self = new DescribeDBInstancePlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePlansRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePlansRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancePlansRequest setPlanCreateDate(String planCreateDate) {
        this.planCreateDate = planCreateDate;
        return this;
    }
    public String getPlanCreateDate() {
        return this.planCreateDate;
    }

    public DescribeDBInstancePlansRequest setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
        return this;
    }
    public String getPlanDesc() {
        return this.planDesc;
    }

    public DescribeDBInstancePlansRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public DescribeDBInstancePlansRequest setPlanScheduleType(String planScheduleType) {
        this.planScheduleType = planScheduleType;
        return this;
    }
    public String getPlanScheduleType() {
        return this.planScheduleType;
    }

    public DescribeDBInstancePlansRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

}
