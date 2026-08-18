// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRuleTemplatesResponseBody extends TeaModel {
    /**
     * <p>The paging result of the data quality rule template paged query.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityRuleTemplatesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityRuleTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRuleTemplatesResponseBody self = new ListDataQualityRuleTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRuleTemplatesResponseBody setPagingInfo(ListDataQualityRuleTemplatesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityRuleTemplatesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityRuleTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig extends TeaModel {
        /**
         * <p>An expression that specifies how to query reference samples. Some threshold types require querying reference samples and then aggregating their values to derive the threshold for comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>The threshold calculation method. Valid values:</p>
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

        public static ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig self = new ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig extends TeaModel {
        /**
         * <p>The metric name for sampling. Valid values:</p>
         * <ul>
         * <li>Count: table row count.</li>
         * <li>Min: minimum value of the field.</li>
         * <li>Max: maximum value of the field.</li>
         * <li>Avg: average value of the field.</li>
         * <li>DistinctCount: number of unique values in the field.</li>
         * <li>DistinctPercent: ratio of unique values to total rows.</li>
         * <li>DuplicatedCount: number of duplicate values in the field.</li>
         * <li>DuplicatedPercent: ratio of duplicate values to total rows.</li>
         * <li>TableSize: table size.</li>
         * <li>NullValueCount: number of rows where the field is null.</li>
         * <li>NullValuePercent: ratio of rows where the field is null.</li>
         * <li>GroupCount: row count for each value after aggregation by field value.</li>
         * <li>CountNotIn: number of rows with non-matching enumeration values.</li>
         * <li>CountDistinctNotIn: number of unique values with non-matching enumeration values.</li>
         * <li>UserDefinedSql: sample collection through custom SQL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Max</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sample collection.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Sql&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The runtime parameter setting statements that are executed before the sampling statement. The value can be up to 1000 characters in length. Currently, only MaxCompute is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig self = new ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates extends TeaModel {
        /**
         * <p>The sample verification settings.</p>
         */
        @NameInMap("CheckingConfig")
        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig checkingConfig;

        /**
         * <p>The code of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINED:123</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The category directory where the custom template is stored. Levels are separated by forward slashes. Each level name can be up to 1024 characters in length and cannot contain whitespace characters or forward slashes.</p>
         * 
         * <strong>example:</strong>
         * <p>/ods/order_data</p>
         */
        @NameInMap("DirectoryPath")
        public String directoryPath;

        /**
         * <p>The name of the rule template. The name can contain digits, letters, Chinese characters, and half-width or full-width punctuation marks. The name can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Table row Count Verification</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2043</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The settings required for sample collection.</p>
         */
        @NameInMap("SamplingConfig")
        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig samplingConfig;

        /**
         * <p>The visibility scope of the template. Valid values:</p>
         * <ul>
         * <li>Tenant: available to the entire tenant.</li>
         * <li>Project: available only in the current project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("VisibleScope")
        public String visibleScope;

        public static ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates self = new ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setCheckingConfig(ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setDirectoryPath(String directoryPath) {
            this.directoryPath = directoryPath;
            return this;
        }
        public String getDirectoryPath() {
            return this.directoryPath;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setSamplingConfig(ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates setVisibleScope(String visibleScope) {
            this.visibleScope = visibleScope;
            return this;
        }
        public String getVisibleScope() {
            return this.visibleScope;
        }

    }

    public static class ListDataQualityRuleTemplatesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of rule templates.</p>
         */
        @NameInMap("DataQualityRuleTemplates")
        public java.util.List<ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates> dataQualityRuleTemplates;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityRuleTemplatesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplatesResponseBodyPagingInfo self = new ListDataQualityRuleTemplatesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfo setDataQualityRuleTemplates(java.util.List<ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates> dataQualityRuleTemplates) {
            this.dataQualityRuleTemplates = dataQualityRuleTemplates;
            return this;
        }
        public java.util.List<ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates> getDataQualityRuleTemplates() {
            return this.dataQualityRuleTemplates;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityRuleTemplatesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
