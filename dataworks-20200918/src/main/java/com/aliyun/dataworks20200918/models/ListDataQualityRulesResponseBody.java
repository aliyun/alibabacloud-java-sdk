// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDataQualityRulesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDataQualityRulesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRulesResponseBody self = new ListDataQualityRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRulesResponseBody setPagingInfo(ListDataQualityRulesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityRulesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds extends TeaModel {
        @NameInMap("Critical")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected expected;

        @NameInMap("Warned")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned warned;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds setCritical(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds setExpected(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds setWarned(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig extends TeaModel {
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds thresholds;

        @NameInMap("Type")
        public String type;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig setThresholds(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers extends TeaModel {
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        @NameInMap("Type")
        public String type;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig extends TeaModel {
        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricParameters")
        public String metricParameters;

        @NameInMap("SamplingFilter")
        public String samplingFilter;

        @NameInMap("SettingConfig")
        public String settingConfig;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget extends TeaModel {
        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("PartitionSpec")
        public String partitionSpec;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("Type")
        public String type;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfoDataQualityRules extends TeaModel {
        @NameInMap("CheckingConfig")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig checkingConfig;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ErrorHandlers")
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers> errorHandlers;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SamplingConfig")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig samplingConfig;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Target")
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget target;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static ListDataQualityRulesResponseBodyPagingInfoDataQualityRules build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfoDataQualityRules self = new ListDataQualityRulesResponseBodyPagingInfoDataQualityRules();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setCheckingConfig(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setErrorHandlers(java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setSamplingConfig(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setTarget(ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget target) {
            this.target = target;
            return this;
        }
        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRulesTarget getTarget() {
            return this.target;
        }

        public ListDataQualityRulesResponseBodyPagingInfoDataQualityRules setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class ListDataQualityRulesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("DataQualityRules")
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRules> dataQualityRules;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityRulesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRulesResponseBodyPagingInfo self = new ListDataQualityRulesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRulesResponseBodyPagingInfo setDataQualityRules(java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRules> dataQualityRules) {
            this.dataQualityRules = dataQualityRules;
            return this;
        }
        public java.util.List<ListDataQualityRulesResponseBodyPagingInfoDataQualityRules> getDataQualityRules() {
            return this.dataQualityRules;
        }

        public ListDataQualityRulesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityRulesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityRulesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
