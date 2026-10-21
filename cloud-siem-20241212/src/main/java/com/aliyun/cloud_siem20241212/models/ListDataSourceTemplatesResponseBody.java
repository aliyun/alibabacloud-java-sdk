// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourceTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of data source templates.</p>
     */
    @NameInMap("DataSourceTemplates")
    public java.util.List<ListDataSourceTemplatesResponseBodyDataSourceTemplates> dataSourceTemplates;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourceTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTemplatesResponseBody self = new ListDataSourceTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTemplatesResponseBody setDataSourceTemplates(java.util.List<ListDataSourceTemplatesResponseBodyDataSourceTemplates> dataSourceTemplates) {
        this.dataSourceTemplates = dataSourceTemplates;
        return this;
    }
    public java.util.List<ListDataSourceTemplatesResponseBodyDataSourceTemplates> getDataSourceTemplates() {
        return this.dataSourceTemplates;
    }

    public ListDataSourceTemplatesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourceTemplatesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourceTemplatesResponseBodyDataSourceTemplates extends TeaModel {
        /**
         * <p>Indicates whether automatic discovery of new users is enabled. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoScanNew")
        public String autoScanNew;

        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data source origin. Valid values:</p>
         * <ul>
         * <li>center</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("DataSourceFrom")
        public String dataSourceFrom;

        /**
         * <p>Indicates whether automatic discovery of new data sources is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSourceRecognizeEnabled")
        public Boolean dataSourceRecognizeEnabled;

        /**
         * <p>The data source recognizer.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_ingestion</p>
         */
        @NameInMap("DataSourceRecognizer")
        public String dataSourceRecognizer;

        /**
         * <p>The data source template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_ingestion</p>
         */
        @NameInMap("DataSourceTemplateId")
        public String dataSourceTemplateId;

        /**
         * <p>The data source template name.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_ingestion</p>
         */
        @NameInMap("DataSourceTemplateName")
        public String dataSourceTemplateName;

        /**
         * <p>The matching rule for the Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******</p>
         */
        @NameInMap("LogProjectPattern")
        public String logProjectPattern;

        /**
         * <p>The list of log storage region IDs.</p>
         */
        @NameInMap("LogRegionIds")
        public java.util.List<String> logRegionIds;

        /**
         * <p>The matching rule for the Simple Log Service Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-activity</p>
         */
        @NameInMap("LogStorePattern")
        public String logStorePattern;

        /**
         * <p>The list of user IDs for batch data ingestion.</p>
         */
        @NameInMap("LogUserIds")
        public java.util.List<String> logUserIds;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataSourceTemplatesResponseBodyDataSourceTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceTemplatesResponseBodyDataSourceTemplates self = new ListDataSourceTemplatesResponseBodyDataSourceTemplates();
            return TeaModel.build(map, self);
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setAutoScanNew(String autoScanNew) {
            this.autoScanNew = autoScanNew;
            return this;
        }
        public String getAutoScanNew() {
            return this.autoScanNew;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setDataSourceFrom(String dataSourceFrom) {
            this.dataSourceFrom = dataSourceFrom;
            return this;
        }
        public String getDataSourceFrom() {
            return this.dataSourceFrom;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }
        public Boolean getDataSourceRecognizeEnabled() {
            return this.dataSourceRecognizeEnabled;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setDataSourceRecognizer(String dataSourceRecognizer) {
            this.dataSourceRecognizer = dataSourceRecognizer;
            return this;
        }
        public String getDataSourceRecognizer() {
            return this.dataSourceRecognizer;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setDataSourceTemplateId(String dataSourceTemplateId) {
            this.dataSourceTemplateId = dataSourceTemplateId;
            return this;
        }
        public String getDataSourceTemplateId() {
            return this.dataSourceTemplateId;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setDataSourceTemplateName(String dataSourceTemplateName) {
            this.dataSourceTemplateName = dataSourceTemplateName;
            return this;
        }
        public String getDataSourceTemplateName() {
            return this.dataSourceTemplateName;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setLogProjectPattern(String logProjectPattern) {
            this.logProjectPattern = logProjectPattern;
            return this;
        }
        public String getLogProjectPattern() {
            return this.logProjectPattern;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setLogRegionIds(java.util.List<String> logRegionIds) {
            this.logRegionIds = logRegionIds;
            return this;
        }
        public java.util.List<String> getLogRegionIds() {
            return this.logRegionIds;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setLogStorePattern(String logStorePattern) {
            this.logStorePattern = logStorePattern;
            return this;
        }
        public String getLogStorePattern() {
            return this.logStorePattern;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setLogUserIds(java.util.List<String> logUserIds) {
            this.logUserIds = logUserIds;
            return this;
        }
        public java.util.List<String> getLogUserIds() {
            return this.logUserIds;
        }

        public ListDataSourceTemplatesResponseBodyDataSourceTemplates setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
