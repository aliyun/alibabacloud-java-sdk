// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesRequest extends TeaModel {
    /**
     * <p>The list of threshold alert rules.</p>
     * <p>Valid values of N: 1 to 50.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<PutResourceMetricRulesRequestRules> rules;

    public static PutResourceMetricRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRulesRequest self = new PutResourceMetricRulesRequest();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRulesRequest setRules(java.util.List<PutResourceMetricRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<PutResourceMetricRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class PutResourceMetricRulesRequestRulesEscalationsCritical extends TeaModel {
        /**
         * <p>Critical级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <p>N的取值范围：1~50。</p>
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
        public Integer n;

        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>Critical级别报警统计方法。</p>
         * <p>N的取值范围：1~50。</p>
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
         * <p>Critical级别报警阈值。</p>
         * <p>N的取值范围：1~50。</p>
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
         * <p>Critical级别报警重试次数。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsCritical build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsCritical self = new PutResourceMetricRulesRequestRulesEscalationsCritical();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsCritical setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalationsInfo extends TeaModel {
        /**
         * <p>Info级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <p>N的取值范围：1~50。</p>
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
        public Integer n;

        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>Info级别报警统计方法。</p>
         * <p>N的取值范围：1~50。</p>
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
         * <p>Info级别报警阈值。</p>
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
         * <p>Info级别报警重试次数。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsInfo build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsInfo self = new PutResourceMetricRulesRequestRulesEscalationsInfo();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsInfo setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalationsWarn extends TeaModel {
        /**
         * <p>Warn级别阈值比较符。取值：</p>
         * <ul>
         * <li>GreaterThanOrEqualToThreshold：大于等于。</li>
         * <li>GreaterThanThreshold：大于。</li>
         * <li>LessThanOrEqualToThreshold：小于等于。</li>
         * <li>LessThanThreshold：小于。</li>
         * <li>NotEqualToThreshold：不等于。</li>
         * <li>EqualToThreshold：等于。</li>
         * <li>GreaterThanYesterday：同比昨天时间上涨。</li>
         * <li>LessThanYesterday：同比昨天时间下降。</li>
         * <li>GreaterThanLastWeek：同比上周同一时间上涨。</li>
         * <li>LessThanLastWeek：同比上周同一时间下降。</li>
         * <li>GreaterThanLastPeriod：环比上周期上涨。</li>
         * <li>LessThanLastPeriod：环比上周期下降。</li>
         * </ul>
         * <p>N的取值范围：1~50。</p>
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
        public Integer n;

        @NameInMap("PreCondition")
        public String preCondition;

        /**
         * <p>Warn级别报警统计方法。</p>
         * <p>N的取值范围：1~50。</p>
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
         * <p>Warn级别报警阈值。</p>
         * <p>N的取值范围：1~50。</p>
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
         * <p>Warn级别报警重试次数。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>报警级别Critical（严重）、Warn（警告）或Info（信息）至少设置一个，且该报警级别中的参数Statistics、ComparisonOperator、Threshold和Times必须同时设置。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Times")
        public Integer times;

        public static PutResourceMetricRulesRequestRulesEscalationsWarn build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalationsWarn self = new PutResourceMetricRulesRequestRulesEscalationsWarn();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setN(Integer n) {
            this.n = n;
            return this;
        }
        public Integer getN() {
            return this.n;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setPreCondition(String preCondition) {
            this.preCondition = preCondition;
            return this;
        }
        public String getPreCondition() {
            return this.preCondition;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

        public PutResourceMetricRulesRequestRulesEscalationsWarn setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class PutResourceMetricRulesRequestRulesEscalations extends TeaModel {
        @NameInMap("Critical")
        public PutResourceMetricRulesRequestRulesEscalationsCritical critical;

        @NameInMap("Info")
        public PutResourceMetricRulesRequestRulesEscalationsInfo info;

        @NameInMap("Warn")
        public PutResourceMetricRulesRequestRulesEscalationsWarn warn;

        public static PutResourceMetricRulesRequestRulesEscalations build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesEscalations self = new PutResourceMetricRulesRequestRulesEscalations();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesEscalations setCritical(PutResourceMetricRulesRequestRulesEscalationsCritical critical) {
            this.critical = critical;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsCritical getCritical() {
            return this.critical;
        }

        public PutResourceMetricRulesRequestRulesEscalations setInfo(PutResourceMetricRulesRequestRulesEscalationsInfo info) {
            this.info = info;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsInfo getInfo() {
            return this.info;
        }

        public PutResourceMetricRulesRequestRulesEscalations setWarn(PutResourceMetricRulesRequestRulesEscalationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class PutResourceMetricRulesRequestRulesLabels extends TeaModel {
        /**
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
         * <blockquote>
         * <p>标签值支持模板参数，将模板参数替换为实际标签值。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutResourceMetricRulesRequestRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRulesLabels self = new PutResourceMetricRulesRequestRulesLabels();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRulesLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutResourceMetricRulesRequestRulesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutResourceMetricRulesRequestRules extends TeaModel {
        @NameInMap("Escalations")
        public PutResourceMetricRulesRequestRulesEscalations escalations;

        /**
         * <p>报警联系组。报警通知会发送给该报警联系组中的报警联系人。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>报警联系组是一组报警联系人，可以包含一个或多个报警联系人。关于如何创建报警联系人和报警联系组，请参见<a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a>和<a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>。</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        @NameInMap("ContactGroups")
        public String contactGroups;

        /**
         * <p>报警规则的生效时间范围。</p>
         * <p>N的取值范围：1~50。</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-23:59</p>
         */
        @NameInMap("EffectiveInterval")
        public String effectiveInterval;

        /**
         * <p>报警邮件主题。</p>
         * <p>N的取值范围：1~50。</p>
         * 
         * <strong>example:</strong>
         * <p>ECS instance alert</p>
         */
        @NameInMap("EmailSubject")
        public String emailSubject;

        /**
         * <p>报警规则的触发周期。</p>
         * <p>单位：秒。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>关于如何查询监控项的统计周期，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>当监控项达到报警条件并进行报警时，标签同时写入监控项，在报警通知中进行展示。</p>
         */
        @NameInMap("Labels")
        public java.util.List<PutResourceMetricRulesRequestRulesLabels> labels;

        /**
         * <p>监控项名称。</p>
         * <p>N的取值范围：1~50。</p>
         * <p>关于如何查询监控项名称，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>云产品的数据命名空间。</p>
         * <p>N的取值范围：1~50。</p>
         * <p>关于如何查询云产品的数据命名空间，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>无监控数据时报警的处理方式。取值：</p>
         * <ul>
         * <li>KEEP_LAST_STATE（默认值）：不做任何处理。</li>
         * <li>INSUFFICIENT_DATA：报警内容为无数据。</li>
         * <li>OK：正常。</li>
         * </ul>
         * <p>N的取值范围：1~50。</p>
         * 
         * <strong>example:</strong>
         * <p>KEEP_LAST_STATE</p>
         */
        @NameInMap("NoDataPolicy")
        public String noDataPolicy;

        /**
         * <p>报警规则的失效时间范围。</p>
         * <p>N的取值范围：1~50。</p>
         * 
         * <strong>example:</strong>
         * <p>00:00-06:00</p>
         */
        @NameInMap("NoEffectiveInterval")
        public String noEffectiveInterval;

        /**
         * <p>监控项的统计周期。</p>
         * <p>单位：秒。默认为监控项的原始上报周期。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>关于如何查询监控项的统计周期，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>资源信息，例如：<code>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</code>、<code>[{&quot;userId&quot;:&quot;100931896542****&quot;}]</code>。</p>
         * <p>N的取值范围：1~50。</p>
         * <p>关于资源信息支持的维度Dimensions，请参见<a href="https://help.aliyun.com/document_detail/163515.html">云产品监控项</a>。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;instanceId&quot;:&quot;i-uf6j91r34rnwawoo****&quot;}]</p>
         */
        @NameInMap("Resources")
        public String resources;

        /**
         * <p>报警规则ID。</p>
         * <p>N的取值范围：1~50。</p>
         * <p>您可以输入新的报警规则ID，也可以使用云监控已存在的报警规则ID。关于如何查询报警规则ID，请参见<a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>。</p>
         * <blockquote>
         * <p>输入新的报警规则ID，表示创建一条阈值报警规则。</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a151cd6023eacee2f0978e03863cc1697c89508****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>报警规则名称。</p>
         * <p>N的取值范围：1~50。</p>
         * <p>您可以输入新的报警规则名称，也可以使用云监控已存在的报警规则名称。关于如何查询报警规则名称，请参见<a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>。</p>
         * <blockquote>
         * <p>输入新的报警规则名称，表示创建一条阈值报警规则。</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>是否发送恢复通知</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SendOK")
        public Boolean sendOK;

        /**
         * <p>通道沉默周期。</p>
         * <p>单位：秒，默认值：86400。</p>
         * <p>N的取值范围：1~50。</p>
         * <blockquote>
         * <p>通道沉默周期是指报警发生后未恢复正常，间隔多久重新发送一次报警通知。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("SilenceTime")
        public Integer silenceTime;

        /**
         * <p>报警发生回调时指定的URL地址，向URL发送POST请求。</p>
         * <p>N的取值范围：1~50。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alert.aliyun.com.com:8080/callback">https://alert.aliyun.com.com:8080/callback</a></p>
         */
        @NameInMap("Webhook")
        public String webhook;

        public static PutResourceMetricRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesRequestRules self = new PutResourceMetricRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesRequestRules setEscalations(PutResourceMetricRulesRequestRulesEscalations escalations) {
            this.escalations = escalations;
            return this;
        }
        public PutResourceMetricRulesRequestRulesEscalations getEscalations() {
            return this.escalations;
        }

        public PutResourceMetricRulesRequestRules setContactGroups(String contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public String getContactGroups() {
            return this.contactGroups;
        }

        public PutResourceMetricRulesRequestRules setEffectiveInterval(String effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public PutResourceMetricRulesRequestRules setEmailSubject(String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public String getEmailSubject() {
            return this.emailSubject;
        }

        public PutResourceMetricRulesRequestRules setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public PutResourceMetricRulesRequestRules setLabels(java.util.List<PutResourceMetricRulesRequestRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<PutResourceMetricRulesRequestRulesLabels> getLabels() {
            return this.labels;
        }

        public PutResourceMetricRulesRequestRules setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public PutResourceMetricRulesRequestRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PutResourceMetricRulesRequestRules setNoDataPolicy(String noDataPolicy) {
            this.noDataPolicy = noDataPolicy;
            return this;
        }
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        public PutResourceMetricRulesRequestRules setNoEffectiveInterval(String noEffectiveInterval) {
            this.noEffectiveInterval = noEffectiveInterval;
            return this;
        }
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        public PutResourceMetricRulesRequestRules setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public PutResourceMetricRulesRequestRules setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public PutResourceMetricRulesRequestRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public PutResourceMetricRulesRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public PutResourceMetricRulesRequestRules setSendOK(Boolean sendOK) {
            this.sendOK = sendOK;
            return this;
        }
        public Boolean getSendOK() {
            return this.sendOK;
        }

        public PutResourceMetricRulesRequestRules setSilenceTime(Integer silenceTime) {
            this.silenceTime = silenceTime;
            return this;
        }
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        public PutResourceMetricRulesRequestRules setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
