// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlanCreateDate")
    public String planCreateDate;

    @NameInMap("PlanDesc")
    public String planDesc;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("PlanSchedulerType")
    public String planSchedulerType;

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

    public DescribeDBInstancePlansRequest setPlanSchedulerType(String planSchedulerType) {
        this.planSchedulerType = planSchedulerType;
        return this;
    }
    public String getPlanSchedulerType() {
        return this.planSchedulerType;
    }

    public DescribeDBInstancePlansRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

}
