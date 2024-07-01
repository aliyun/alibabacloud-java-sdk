// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanAttributeResponseBody extends TeaModel {
    /**
     * <p>The queried scaling plan.</p>
     */
    @NameInMap("ElasticPlan")
    public DescribeElasticPlanAttributeResponseBodyElasticPlan elasticPlan;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
     */
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
        /**
         * <p>Indicates whether <strong>Default Proportional Scaling for EIUs</strong> is enabled. Valid values: true: Default Proportional Scaling for EIUs is enabled. If you set this parameter to true, storage resources are scaled along with computing resources. false: Default Proportional Scaling for EIUs is not enabled.</p>
         * <blockquote>
         * <p> You can enable Default Proportional Scaling for EIUs for only a single scaling plan of a cluster. After you enable a scaling plan of the Default Proportional Scaling for EIUs type, you cannot enable scaling plans of other types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoScale")
        public Boolean autoScale;

        /**
         * <p>A CORN expression that indicates the scaling cycle and time for the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>0 20 14 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The name of the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ElasticPlanName")
        public String elasticPlanName;

        /**
         * <p>Indicates whether the scaling plan is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The end time of the scaling plan.</p>
         * <blockquote>
         * <p> The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T12:01:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the resource group used by the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The start time of the scaling plan.</p>
         * <blockquote>
         * <p> The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:01:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The amount of elastic resources after scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("TargetSize")
        public String targetSize;

        /**
         * <p>The type of the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>EXECUTOR</p>
         */
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
