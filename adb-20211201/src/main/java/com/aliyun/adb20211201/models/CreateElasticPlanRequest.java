// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateElasticPlanRequest extends TeaModel {
    @NameInMap("AutoScale")
    public Boolean autoScale;

    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TargetSize")
    public String targetSize;

    @NameInMap("Type")
    public String type;

    public static CreateElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanRequest self = new CreateElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanRequest setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    public CreateElasticPlanRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public CreateElasticPlanRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateElasticPlanRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateElasticPlanRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public CreateElasticPlanRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateElasticPlanRequest setTargetSize(String targetSize) {
        this.targetSize = targetSize;
        return this;
    }
    public String getTargetSize() {
        return this.targetSize;
    }

    public CreateElasticPlanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
