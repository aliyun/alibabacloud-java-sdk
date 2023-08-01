// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The auto scaling policies of the application.</p>
     */
    @NameInMap("AppScalingRules")
    public DescribeApplicationScalingRulesResponseBodyAppScalingRules appScalingRules;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponseBody self = new DescribeApplicationScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponseBody setAppScalingRules(DescribeApplicationScalingRulesResponseBodyAppScalingRules appScalingRules) {
        this.appScalingRules = appScalingRules;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBodyAppScalingRules getAppScalingRules() {
        return this.appScalingRules;
    }

    public DescribeApplicationScalingRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeApplicationScalingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies extends TeaModel {
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown extends TeaModel {
        @NameInMap("Policies")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies> policies;

        @NameInMap("SelectPolicy")
        public String selectPolicy;

        @NameInMap("StabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown setPolicies(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDownPolicies> getPolicies() {
            return this.policies;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown setSelectPolicy(String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies extends TeaModel {
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp extends TeaModel {
        @NameInMap("Policies")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies> policies;

        @NameInMap("SelectPolicy")
        public String selectPolicy;

        @NameInMap("StabilizationWindowSeconds")
        public Integer stabilizationWindowSeconds;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp setPolicies(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUpPolicies> getPolicies() {
            return this.policies;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp setSelectPolicy(String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour extends TeaModel {
        @NameInMap("ScaleDown")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown scaleDown;

        @NameInMap("ScaleUp")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp scaleUp;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour setScaleDown(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleDown getScaleDown() {
            return this.scaleDown;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour setScaleUp(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviourScaleUp getScaleUp() {
            return this.scaleUp;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MetricTargetAverageUtilization")
        public Integer metricTargetAverageUtilization;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics setMetricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = metricTargetAverageUtilization;
            return this;
        }
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics> metrics;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric setMetrics(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetricMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers extends TeaModel {
        /**
         * <p>The metadata of the trigger.</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>The name of the trigger.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the trigger. Valid values: cron and app_metric.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger extends TeaModel {
        /**
         * <p>The maximum number of replicas. The upper limit is 1000.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The minimum number of replicas. The lower limit is 0.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>The configurations of the trigger.</p>
         */
        @NameInMap("Triggers")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers> triggers;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger setTriggers(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTriggerTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult extends TeaModel {
        /**
         * <p>The ID of the application to which the auto scaling policy belongs.</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Behaviour")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour behaviour;

        /**
         * <p>The time when the auto scaling policy was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the auto scaling policy was last disabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LastDisableTime")
        public Long lastDisableTime;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MaxReplicas")
        public Integer maxReplicas;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Metric")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric metric;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("MinReplicas")
        public Integer minReplicas;

        /**
         * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The auto scaling policy is enabled.</p>
         * <p>*   **false**: The auto scaling policy is disabled.</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The name of the auto scaling policy.</p>
         */
        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        /**
         * <p>The type of the auto scaling policy. The value is fixed to trigger.</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The configurations of the trigger.</p>
         */
        @NameInMap("Trigger")
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger trigger;

        /**
         * <p>The time when the auto scaling policy was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult self = new DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setBehaviour(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour behaviour) {
            this.behaviour = behaviour;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultBehaviour getBehaviour() {
            return this.behaviour;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setLastDisableTime(Long lastDisableTime) {
            this.lastDisableTime = lastDisableTime;
            return this;
        }
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setMetric(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric metric) {
            this.metric = metric;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultMetric getMetric() {
            return this.metric;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setTrigger(DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResultTrigger getTrigger() {
            return this.trigger;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyAppScalingRules extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of auto scaling policies returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information about auto scaling policies.</p>
         */
        @NameInMap("Result")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult> result;

        /**
         * <p>The total number of auto scaling policies.</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeApplicationScalingRulesResponseBodyAppScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyAppScalingRules self = new DescribeApplicationScalingRulesResponseBodyAppScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setResult(java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyAppScalingRulesResult> getResult() {
            return this.result;
        }

        public DescribeApplicationScalingRulesResponseBodyAppScalingRules setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
