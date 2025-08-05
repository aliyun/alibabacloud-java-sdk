// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDataQualityResultsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDataQualityResultsResponseBodyPagingInfo pagingInfo;

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
        @NameInMap("CheckedValue")
        public String checkedValue;

        @NameInMap("ReferencedValue")
        public String referencedValue;

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
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
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
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
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
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned self = new ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
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
        @NameInMap("Critical")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholdsExpected expected;

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
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfigThresholds thresholds;

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
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

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
        @NameInMap("Metric")
        public String metric;

        @NameInMap("MetricParameters")
        public String metricParameters;

        @NameInMap("SamplingFilter")
        public String samplingFilter;

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
        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("PartitionSpec")
        public String partitionSpec;

        @NameInMap("TableGuid")
        public String tableGuid;

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

        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
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
        @NameInMap("CheckingConfig")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleCheckingConfig checkingConfig;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ErrorHandlers")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleErrorHandlers> errorHandlers;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SamplingConfig")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleSamplingConfig samplingConfig;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Target")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRuleTarget target;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Details")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsDetails> details;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Rule")
        public ListDataQualityResultsResponseBodyPagingInfoDataQualityResultsRule rule;

        @NameInMap("Sample")
        public String sample;

        @NameInMap("Status")
        public String status;

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
        @NameInMap("DataQualityResults")
        public java.util.List<ListDataQualityResultsResponseBodyPagingInfoDataQualityResults> dataQualityResults;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
