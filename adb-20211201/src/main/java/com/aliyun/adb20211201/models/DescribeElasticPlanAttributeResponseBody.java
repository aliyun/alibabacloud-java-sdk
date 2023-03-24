// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanAttributeResponseBody extends TeaModel {
    @NameInMap("ElasticPlan")
    public DescribeElasticPlanAttributeResponseBodyElasticPlan elasticPlan;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticPlanAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanAttributeResponseBody self = new DescribeElasticPlanAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanAttributeResponseBody setElasticPlan(DescribeElasticPlanAttributeResponseBodyElasticPlan elasticPlan) {
        this.elasticPlan = elasticPlan;
        return this;
    }
    public DescribeElasticPlanAttributeResponseBodyElasticPlan getElasticPlan() {
        return this.elasticPlan;
    }

    public DescribeElasticPlanAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticPlanAttributeResponseBodyElasticPlan extends TeaModel {
        @NameInMap("AutoScale")
        public Boolean autoScale;

        @NameInMap("CronExpression")
        public String cronExpression;

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

        public static DescribeElasticPlanAttributeResponseBodyElasticPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticPlanAttributeResponseBodyElasticPlan self = new DescribeElasticPlanAttributeResponseBodyElasticPlan();
            return TeaModel.build(map, self);
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setAutoScale(Boolean autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setElasticPlanName(String elasticPlanName) {
            this.elasticPlanName = elasticPlanName;
            return this;
        }
        public String getElasticPlanName() {
            return this.elasticPlanName;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setTargetSize(String targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public String getTargetSize() {
            return this.targetSize;
        }

        public DescribeElasticPlanAttributeResponseBodyElasticPlan setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
