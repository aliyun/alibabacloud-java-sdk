// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The time used to filter plans. If you specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format, the plans created before this time are returned. The time must be in UTC. If you do not specify this parameter, all plans are returned.</p>
     */
    @NameInMap("PlanCreateDate")
    public String planCreateDate;

    /**
     * <p>The description of the plan.</p>
     */
    @NameInMap("PlanDesc")
    public String planDesc;

    /**
     * <p>The plan ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstancePlans](https://help.aliyun.com/document_detail/449398.html) operation to query the information about plans, including plan IDs.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The execution mode of the plan. Valid values:</p>
     * <br>
     * <p>*   **Postpone**: The plan is executed later.</p>
     * <p>*   **Regular**: The plan is executed periodically.</p>
     */
    @NameInMap("PlanScheduleType")
    public String planScheduleType;

    /**
     * <p>The type of the plan. Valid values:</p>
     * <br>
     * <p>*   **PauseResume**: pauses and resumes an instance.</p>
     * <p>*   **Resize**: scales an instance.</p>
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
