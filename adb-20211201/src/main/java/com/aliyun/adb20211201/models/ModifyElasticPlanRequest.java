// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanRequest extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TargetSize")
    public String targetSize;

    public static ModifyElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanRequest self = new ModifyElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public ModifyElasticPlanRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyElasticPlanRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyElasticPlanRequest setTargetSize(String targetSize) {
        this.targetSize = targetSize;
        return this;
    }
    public String getTargetSize() {
        return this.targetSize;
    }

}
