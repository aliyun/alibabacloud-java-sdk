// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanAttributeResponseBody extends TeaModel {
    /**
     * <p>The elastic plan.</p>
     */
    @NameInMap("ElasticPlan")
    public DescribeElasticPlanAttributeResponseBodyElasticPlan elasticPlan;

    /**
     * <p>The ID of the request.</p>
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
         * <p>Indicates whether <strong>proportional default elastic scaling for the storage acceleration service (EIU)</strong> is enabled.
         * Valid values:</p>
         * <ul>
         * <li>true: Enabled. After this feature is enabled, storage resources scale in or out along with the elastic scaling of compute resources.</li>
         * <li>false: Disabled.<blockquote>
         * <p>Only one storage elastic plan with proportional default elastic scaling for the storage acceleration service (EIU) can be enabled for the entire cluster. After this type of elastic plan is enabled, no other storage elastic plans can be enabled.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoScale")
        public Boolean autoScale;

        /**
         * <p>The cron expression, which indicates the scaling cycle and scaling time of the elastic plan.</p>
         * 
         * <strong>example:</strong>
         * <p>0 20 14 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The name of the elastic plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ElasticPlanName")
        public String elasticPlanName;

        /**
         * <p>Indicates whether the elastic plan is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The end time.</p>
         * <blockquote>
         * <p>The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T12:01:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The name of the resource group to which the elastic plan belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The start time.</p>
         * <blockquote>
         * <p>The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:01:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The target specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("TargetSize")
        public String targetSize;

        /**
         * <p>The type of the elastic plan.</p>
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
