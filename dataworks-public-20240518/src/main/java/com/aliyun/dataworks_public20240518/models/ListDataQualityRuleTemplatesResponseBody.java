// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRuleTemplatesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataQualityRuleTemplatesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>691CA452-D37A-4ED0-9441</p>
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
         * <p>Some types of thresholds need to query some reference samples, and then summarize the values of the reference samples to obtain the threshold for comparison. Here, an expression is used to represent the query method of the reference samples.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;bizdate&quot;: [ &quot;-1&quot;, &quot;-7&quot;, &quot;-1m&quot; ] }</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        /**
         * <p>Threshold Calculation method</p>
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
         * <p>The name of the sampled metric.</p>
         * <ul>
         * <li>Count: number of table rows</li>
         * <li>Min: minimum value of the field</li>
         * <li>Max: The maximum value of the field.</li>
         * <li>Avg: field mean</li>
         * <li>DistinctCount: number of unique field values</li>
         * <li>DistinctPercent: the ratio of the number of unique field values to the number of data rows.</li>
         * <li>DuplicatedCount: number of duplicate field values</li>
         * <li>DuplicatedPercent: the ratio of the number of duplicate field values to the number of data rows.</li>
         * <li>TableSize: table size</li>
         * <li>NullValueCount: number of rows with empty fields</li>
         * <li>NullValuePercent: the proportion of fields that are empty.</li>
         * <li>GroupCount: aggregate each value by field value and the corresponding number of data rows</li>
         * <li>CountNotIn: the enumerated value does not match the number of rows.</li>
         * <li>CountDistinctNotIn: the number of unique values that the enumerated values do not match.</li>
         * <li>UserDefinedSql: use custom SQL to collect samples</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Max</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>Parameters required for sample collection</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Sql&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <p>Before executing the sample statement, insert some runtime parameter setting statements, which can be up to 1000 characters in length. Currently, only MaxCompute are supported.</p>
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
         * <p>Sample verification settings</p>
         */
        @NameInMap("CheckingConfig")
        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesCheckingConfig checkingConfig;

        /**
         * <p>Rule template Code</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINED:123</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The directory in which the template is stored. Slashes (/) are used to separate directory levels. The name of each directory level can be up to 1,024 characters in length. It cannot contain whitespace characters or slashes (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/ods/order_data</p>
         */
        @NameInMap("DirectoryPath")
        public String directoryPath;

        /**
         * <p>The name of the template. The name can be up to 512 characters in length and can contain digits, letters, and punctuation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>Table row Count Verification</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>DataWorks workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>2043</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Settings required for sample collection</p>
         */
        @NameInMap("SamplingConfig")
        public ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplatesSamplingConfig samplingConfig;

        /**
         * <p>Available range of templates:</p>
         * <ul>
         * <li>Tenant: all tenants are available</li>
         * <li>Project: only available in the current Project</li>
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
         * <p>The templates.</p>
         */
        @NameInMap("DataQualityRuleTemplates")
        public java.util.List<ListDataQualityRuleTemplatesResponseBodyPagingInfoDataQualityRuleTemplates> dataQualityRuleTemplates;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of entries</p>
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
