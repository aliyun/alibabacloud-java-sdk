// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityResultsResponseBody extends TeaModel {
    /**
     * <p>数据质量校验结果分页查询结果。</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityResultsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>API请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityResultsResponseBody self = new ListDataQualityResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityResultsResponseBody setPagingInfo(ListDataQualityResultsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityResultsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails extends TeaModel {
        /**
         * <p>最终用来与阈值比较的值。</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("CheckedValue")
        public String checkedValue;

        /**
         * <p>使用引用的样本，用来参与CheckedValue计算的基准值。</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ReferencedValue")
        public String referencedValue;

        /**
         * <p>最终的比较结果状态：</p>
         * <ul>
         * <li>Error</li>
         * <li>Passed</li>
         * <li>Warned</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails setCheckedValue(String checkedValue) {
            this.checkedValue = checkedValue;
            return this;
        }
        public String getCheckedValue() {
            return this.checkedValue;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails setReferencedValue(String referencedValue) {
            this.referencedValue = referencedValue;
            return this;
        }
        public String getReferencedValue() {
            return this.referencedValue;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <p>阈值表达式。</p>
         * <p>波动率类型规则必须使用表达式方式表示波动阈值。如：</p>
         * <ul>
         * <li>波动上升大于0.01： $checkValue &gt; 0.01 </li>
         * <li>波动下降大于0.01：$checkValue &lt; -0.01 </li>
         * <li>波动率绝对值：abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>固定值类型规则也可以使用表达式方式配置阈值，如果同时配置，表达式优先级高于Operator和Value。</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>比较符：</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>阈值数值。</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <p>阈值表达式。</p>
         * <p>波动率类型规则必须使用表达式方式表示波动阈值。如：</p>
         * <ul>
         * <li>波动上升大于0.01： $checkValue &gt; 0.01 </li>
         * <li>波动下降大于0.01：$checkValue &lt; -0.01 </li>
         * <li>波动率绝对值：abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>固定值类型规则也可以使用表达式方式配置阈值，如果同时配置，表达式优先级高于Operator和Value。</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>比较符：</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>阈值数值。</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <p>阈值表达式。</p>
         * <p>波动率类型规则必须使用表达式方式表示波动阈值。如：</p>
         * <ul>
         * <li>波动上升大于0.01： $checkValue &gt; 0.01 </li>
         * <li>波动下降大于0.01：$checkValue &lt; -0.01 </li>
         * <li>波动率绝对值：abs($checkValue) &gt; 0.01</li>
         * </ul>
         * <p>固定值类型规则也可以使用表达式方式配置阈值，如果同时配置，表达式优先级高于Operator和Value。</p>
         * 
         * <strong>example:</strong>
         * <p>$checkValue &gt; 0.01</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>比较符：</p>
         * <ul>
         * <li>\&gt;</li>
         * <li>\&gt;=</li>
         * <li>\&lt;</li>
         * <li>\&lt;=</li>
         * <li>!=</li>
         * <li>=</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>阈值数值。</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds extends TeaModel {
        /**
         * <p>严重警告的阈值设置。</p>
         */
        @NameInMap("Critical")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical critical;

        /**
         * <p>期望的阈值设置。</p>
         */
        @NameInMap("Expected")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected expected;

        /**
         * <p>普通警告的阈值设置。</p>
         */
        @NameInMap("Warned")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned warned;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds setCritical(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds setExpected(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds setWarned(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig extends TeaModel {
        /**
         * <p>有些类型的阈值需要查询出一些参考样本，然后对参考样本的值进行汇总得出进行比较的阈值，这里使用一个表达式来表示参考样本的查询方式。</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>阈值设置。</p>
         */
        @NameInMap("Thresholds")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds thresholds;

        /**
         * <p>阈值计算方式：</p>
         * <ul>
         * <li>Fixed</li>
         * <li>Fluctation</li>
         * <li>FluctationDiscreate</li>
         * <li>Auto</li>
         * <li>Average</li>
         * <li>Variance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig setThresholds(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers extends TeaModel {
        /**
         * <p>如果是自定义SQL规则，需要用户指定SQL来过滤问题数据。</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM tb_api_log WHERE id IS NULL</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <p>处理器类型。</p>
         * <ul>
         * <li>SaveErrorData</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig extends TeaModel {
        /**
         * <p>采样的指标名称：</p>
         * <ul>
         * <li>Count：表行数</li>
         * <li>Min：字段最小值</li>
         * <li>Max：字段最大值</li>
         * <li>Avg：字段均值</li>
         * <li>DistinctCount：字段唯一值个数</li>
         * <li>DistinctPercent：字段唯一值个数与数据行数占比</li>
         * <li>DuplicatedCount：字段重复值个数</li>
         * <li>DuplicatedPercent：字段重复值个数与数据行数占比</li>
         * <li>TableSize：表大小</li>
         * <li>NullValueCount：字段为空的行数</li>
         * <li>NullValuePercent：字段为空的比例</li>
         * <li>GroupCount：按字段值聚合后每个值与对应的数据行数</li>
         * <li>CountNotIn：枚举值不匹配行数</li>
         * <li>CountDistinctNotIn：枚举值不匹配唯一值个数</li>
         * <li>UserDefinedSql：通过自定义SQL做样本采集</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>样本采集时，所需的参数。</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] }</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>采样时，对不关注的数据进行二次过滤的条件，最多16777215个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>id IS NULL</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <p>具体执行采样语句前，插入执行的一些运行时参数设置语句，最长1000个字符。目前只支持MaxCompute。</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget extends TeaModel {
        /**
         * <p>表类型的数据集，表所属的数据库类型：</p>
         * <ul>
         * <li>maxcompute</li>
         * <li>emr</li>
         * <li>cdh</li>
         * <li>hologres</li>
         * <li>analyticdb_for_postgresql</li>
         * <li>analyticdb_for_mysql</li>
         * <li>starrocks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>表在数据地图中的唯一ID。</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>监控对象类型：</p>
         * <ul>
         * <li>Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule extends TeaModel {
        /**
         * <p>样本校验设置。</p>
         */
        @NameInMap("CheckingConfig")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig checkingConfig;

        /**
         * <p>规则描述信息，最长500个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>this is a odps _sql task</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>规则是否启用。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>质量规则校验问题处理器。</p>
         */
        @NameInMap("ErrorHandlers")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> errorHandlers;

        /**
         * <p>规则ID。</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>规则名称，数字、英文字母、汉字、半角全角标点符号组合，最长255个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>The table cannot be empty.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>DataWorks项目空间ID。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>样本采集所需的设置。</p>
         */
        @NameInMap("SamplingConfig")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig samplingConfig;

        /**
         * <p>规则对于业务的等级（对应页面上的强弱规则）：</p>
         * <ul>
         * <li>High</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>规则所监控的对象。</p>
         */
        @NameInMap("Target")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget target;

        /**
         * <p>创建规则时所引用的规则模板Code。</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM:user_defined_sql</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setCheckingConfig(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setErrorHandlers(java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setSamplingConfig(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setTarget(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget getTarget() {
            return this.target;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfoDataQualityResults extends TeaModel {
        /**
         * <p>校验结果生成时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1708284916414</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>本次校验的详情。</p>
         */
        @NameInMap("Details")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> details;

        /**
         * <p>校验结果ID。</p>
         * 
         * <strong>example:</strong>
         * <p>16033</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>校验开始时，规则配置快照。</p>
         */
        @NameInMap("Rule")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule rule;

        /**
         * <p>本次校验所使用的样本值。</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;gender&quot;: &quot;male&quot;,
         *     &quot;_count&quot;: 100
         *   }, {
         *     &quot;gender&quot;: &quot;female&quot;,
         *     &quot;_count&quot;: 100
         *   }
         * ]</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>校验结果状态：</p>
         * <ul>
         * <li>Running</li>
         * <li>Error</li>
         * <li>Passed</li>
         * <li>Warned</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Passed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>校验任务实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResults build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResults self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResults();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setDetails(java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> getDetails() {
            return this.details;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setRule(ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule rule) {
            this.rule = rule;
            return this;
        }
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule getRule() {
            return this.rule;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResults setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

    }

    public static class ListDataQualityResultsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>质量校验结果列表。</p>
         */
        @NameInMap("DataQualityResults")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> dataQualityResults;

        /**
         * <p>页码。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>页大小。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>总条数。</p>
         * 
         * <strong>example:</strong>
         * <p>219</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityResultsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfo self = new ListDataQualityResultsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityResultsResponseBodyPagingInfo setDataQualityResults(java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> dataQualityResults) {
            this.dataQualityResults = dataQualityResults;
            return this;
        }
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> getDataQualityResults() {
            return this.dataQualityResults;
        }

        public ListDataQualityResultsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityResultsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityResultsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
