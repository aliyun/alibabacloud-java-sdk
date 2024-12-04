// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityRuleTemplateResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityRuleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRuleTemplateResponseBody self = new ListDataQualityRuleTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRuleTemplateResponseBody setPagingInfo(ListDataQualityRuleTemplateResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataQualityRuleTemplateResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataQualityRuleTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig extends TeaModel {
        /**
         * <p>The method that is used to query the referenced samples. To obtain some types of thresholds, you need to query reference samples and perform aggregate operations on the reference values. In this example, an expression is used to indicate the query method of referenced samples.</p>
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

        public static ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig self = new ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig extends TeaModel {
        /**
         * <p>The metrics used for sampling. Valid values:</p>
         * <ul>
         * <li>Count: the number of rows in the table.</li>
         * <li>Min: the minimum value of the field.</li>
         * <li>Max: the maximum value of the field.</li>
         * <li>Avg: the average value of the field.</li>
         * <li>DistinctCount: the number of unique values of the field after deduplication.</li>
         * <li>DistinctPercent: the proportion of the number of unique values of the field after deduplication to the number of rows in the table.</li>
         * <li>DuplicatedCount: the number of duplicated values of the field.</li>
         * <li>DuplicatedPercent: the proportion of the number of duplicated values of the field to the number of rows in the table.</li>
         * <li>TableSize: the table size.</li>
         * <li>NullValueCount: the number of rows in which the field value is null.</li>
         * <li>NullValuePercent: the proportion of the number of rows in which the field value is null to the number of rows in the table.</li>
         * <li>GroupCount: the field value and the number of rows for each field value.</li>
         * <li>CountNotIn: the number of rows in which the field values are different from the referenced values that you specified in the rule.</li>
         * <li>CountDistinctNotIn: the number of unique values that are different from the referenced values that you specified in the rule after deduplication.</li>
         * <li>UserDefinedSql: indicates that data is sampled by executing custom SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Max</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The parameters required for sampling.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>The statements that are used to configure the parameters required for sampling before you execute the sampling statements. The statements can be up to 1,000 characters in length. Only the MaxCompute database is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SET odps.sql.udf.timeout=600s; 
         * SET odps.sql.python.version=cp27;</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig self = new ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates extends TeaModel {
        /**
         * <p>The check settings for sample data.</p>
         */
        @NameInMap("CheckingConfig")
        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig checkingConfig;

        /**
         * <p>The code for the template.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINED:123</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The path of the template. The backslash is used as the separator character in the path name. Each directory name can be up to 1024 characters in length. It cannot contain whitespace characters or slashes.</p>
         */
        @NameInMap("DirectoryPath")
        public String directoryPath;

        /**
         * <p>The name of the template. The name can be up to 512 characters in length and can contain digits, letters, and punctuation marks.</p>
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
         * <p>The sampling settings.</p>
         */
        @NameInMap("SamplingConfig")
        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig samplingConfig;

        /**
         * <p>The ID of the DataWorks tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>195820716552192</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The applicable scope of the template. Valid values:</p>
         * <ul>
         * <li>Tenant: The template is available in all workspaces in the current tenant.</li>
         * <li>Project: The template is available only in the current workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("VisibleScope")
        public String visibleScope;

        public static ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates self = new ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setCheckingConfig(ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setDirectoryPath(String directoryPath) {
            this.directoryPath = directoryPath;
            return this;
        }
        public String getDirectoryPath() {
            return this.directoryPath;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setSamplingConfig(ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates setVisibleScope(String visibleScope) {
            this.visibleScope = visibleScope;
            return this;
        }
        public String getVisibleScope() {
            return this.visibleScope;
        }

    }

    public static class ListDataQualityRuleTemplateResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The templates.</p>
         */
        @NameInMap("DataQualityRuleTemplates")
        public java.util.List<ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates> dataQualityRuleTemplates;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityRuleTemplateResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityRuleTemplateResponseBodyPagingInfo self = new ListDataQualityRuleTemplateResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfo setDataQualityRuleTemplates(java.util.List<ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates> dataQualityRuleTemplates) {
            this.dataQualityRuleTemplates = dataQualityRuleTemplates;
            return this;
        }
        public java.util.List<ListDataQualityRuleTemplateResponseBodyPagingInfoDataQualityRuleTemplates> getDataQualityRuleTemplates() {
            return this.dataQualityRuleTemplates;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityRuleTemplateResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
