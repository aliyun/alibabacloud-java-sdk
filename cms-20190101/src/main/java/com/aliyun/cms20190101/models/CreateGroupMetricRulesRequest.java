// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3607****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The list of metric-based alert rules for the application group.</p>
     */
    @NameInMap("GroupMetricRules")
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGroupMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesRequest self = new CreateGroupMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupMetricRulesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateGroupMetricRulesRequest setGroupMetricRules(java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> groupMetricRules) {
        this.groupMetricRules = groupMetricRules;
        return this;
    }
    public java.util.List<CreateGroupMetricRulesRequestGroupMetricRules> getGroupMetricRules() {
        return this.groupMetricRules;
    }

    public CreateGroupMetricRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical extends TeaModel {
        /**
         * <p>紧急级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。 </li>
         * <li>GreaterThanThreshold：大于。 </li>
         * <li>LessThanOrEqualToThreshold：小于等于。 </li>
         * <li>LessThanThreshold：小于。 </li>
         * <li>NotEqualToThreshold：不等于。 </li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。 </li>
         * <li>LessThanYesterday：同比昨天时间下降。 </li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。 </li>
         * <li>LessThanLastWeek：同比上周同一时间下降。 </li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。 </li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public String n;

        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>紧急级别报警统计方法。</p>
         * <p>N的取值范围：1~200。</p>
         * <p>该参数的取值由指定云产品的<code>MetricName</code>对应的<code>Statistics</code>列决定，例如：Maximum、Minimum和Average。关于如何获取该参数的取值，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>触发紧急级别报警通知的阈值。</p>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>发送紧急报警通知需要监控指标达到报警阈值的次数。</p>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo extends TeaModel {
        /**
         * <p>普通级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。 </li>
         * <li>GreaterThanThreshold：大于。 </li>
         * <li>LessThanOrEqualToThreshold：小于等于。 </li>
         * <li>LessThanThreshold：小于。 </li>
         * <li>NotEqualToThreshold：不等于。 </li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。 </li>
         * <li>LessThanYesterday：同比昨天时间下降。 </li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。 </li>
         * <li>LessThanLastWeek：同比上周同一时间下降。 </li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。 </li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public String n;

        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>普通级别报警统计方法。</p>
         * <p>N的取值范围：1~200。</p>
         * <p>该参数的取值由指定云产品的<code>MetricName</code>对应的<code>Statistics</code>列决定，例如：Maximum、Minimum和Average。关于如何获取该参数的取值，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>普通级别报警阈值。</p>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>发送普通报警通知需要监控指标达到报警阈值的次数。</p>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn extends TeaModel {
        /**
         * <p>警告级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。 </li>
         * <li>GreaterThanThreshold：大于。 </li>
         * <li>LessThanOrEqualToThreshold：小于等于。 </li>
         * <li>LessThanThreshold：小于。 </li>
         * <li>NotEqualToThreshold：不等于。 </li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。 </li>
         * <li>LessThanYesterday：同比昨天时间下降。 </li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。 </li>
         * <li>LessThanLastWeek：同比上周同一时间下降。 </li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。 </li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanOrEqualToThreshold</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("N")
        public String n;

        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>警告级别报警统计方法。</p>
         * <p>N的取值范围：1~200。</p>
         * <p>该参数的取值由指定云产品的<code>MetricName</code>对应的<code>Statistics</code>列决定，例如：Maximum、Minimum和Average。关于如何获取该参数的取值，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>警告级别报警阈值。</p>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        /**
         * <p>发送警告报警通知需要监控指标达到报警阈值的次数。</p>
         * <p>N的取值范围：1~200。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setN(String n) {
            this.n = n;
            return this;
        }
        public String getN() {
            return this.n;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical;

        @NameInMap("Info")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info;

        @NameInMap("Warn")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn;

        public static CreateGroupMetricRulesRequestGroupMetricRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesEscalations self = new CreateGroupMetricRulesRequestGroupMetricRulesEscalations();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setCritical(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsCritical getCritical() {
            return this.critical;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setInfo(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsInfo getInfo() {
            return this.info;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations setWarn(CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRulesLabels extends TeaModel {
        /**
         * <p>The tag key of the alert rule. The tag is included in alert notifications.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the alert rule. The tag is included in alert notifications.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGroupMetricRulesRequestGroupMetricRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRulesLabels self = new CreateGroupMetricRulesRequestGroupMetricRulesLabels();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGroupMetricRulesRequestGroupMetricRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateGroupMetricRulesRequestGroupMetricRules extends TeaModel {
        @NameInMap("Escalations")
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the abbreviation, see the <code>metricCategory</code> tag in the <code>Labels</code> response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The alert contact group.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the alert contact group, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>The monitoring dimensions of the specified resource.</p>
         * <p>The value is a collection of <code>key:value</code> pairs, such as <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}]</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The effective period of the alert rule. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>05:31-23:59</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>The subject of the alert notification email.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS instance</p>
         */
        @NameInMap("EmailSubject")
        public String emailSubject;

        /**
         * <p>The detection period of the alert rule.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>Unit: seconds. The default value is the minimum reporting period of the metric.</p>
         * <blockquote>
         * <p>Keep the detection period of the alert rule consistent with the data reporting period. If the detection period is shorter than the data reporting period, alerts may not be triggered due to insufficient data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The tag keys of the alert rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> labels;

        /**
         * <p>The name of the metric.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the metric name, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the Alibaba Cloud service.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>For information about how to obtain the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The processing method when no monitoring data is found. Valid values:</p>
         * <ul>
         * <li>KEEP_LAST_STATE (default): No action is performed.</li>
         * <li>INSUFFICIENT_DATA: An alert whose content is &quot;Insufficient Data&quot; is triggered.</li>
         * <li>OK: The status is considered normal.</li>
         * </ul>
         * <p>Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>KEEP_LAST_STATE</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-05:30</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>The advanced settings.</p>
         * <p>Format: {&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}. For example, {&quot;NotSendOK&quot;:true} specifies whether to send an alert recovery notification. The key is NotSendOK, and the value is true (do not send) or false (send, which is the default).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;NotSendOK&quot;: true
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The reporting period of monitoring data.</p>
         * <p>Valid values of N: 1 to 200. </p>
         * <p>The value of <code>Period</code> must be 60 or a multiple of 60. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The ID of the alert rule.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>456789</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         * <p>Valid values of N: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Rule1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The mute period of the alert notification. Valid values of N: 1 to 200.</p>
         * <p>Unit: seconds. Default value: 86400. Minimum value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>The callback URL to which an alert notification is sent. Valid values of N: 1 to 200.</p>
         * <p>Enter a publicly accessible URL. CloudMonitor sends alert information to this URL by using POST requests. Only the HTTP protocol is supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static CreateGroupMetricRulesRequestGroupMetricRules build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesRequestGroupMetricRules self = new CreateGroupMetricRulesRequestGroupMetricRules();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEscalations(CreateGroupMetricRulesRequestGroupMetricRulesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public CreateGroupMetricRulesRequestGroupMetricRulesEscalations getEscalations() {
            return this.escalations;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setLabels(java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateGroupMetricRulesRequestGroupMetricRulesLabels> getLabels() {
            return this.labels;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public CreateGroupMetricRulesRequestGroupMetricRules setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
