// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourceTemplatesResponseBody extends TeaModel {
    @NameInMap("DataSourceTemplates")
    public java.util.List<ListDataSourceTemplatesResponseBodyDataSourceTemplates> dataSourceTemplates;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

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
        @NameInMap("AutoScanNew")
        public String autoScanNew;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataSourceFrom")
        public String dataSourceFrom;

        @NameInMap("DataSourceRecognizeEnabled")
        public Boolean dataSourceRecognizeEnabled;

        @NameInMap("DataSourceRecognizer")
        public String dataSourceRecognizer;

        @NameInMap("DataSourceTemplateId")
        public String dataSourceTemplateId;

        @NameInMap("DataSourceTemplateName")
        public String dataSourceTemplateName;

        @NameInMap("LogProjectPattern")
        public String logProjectPattern;

        @NameInMap("LogRegionIds")
        public java.util.List<String> logRegionIds;

        @NameInMap("LogStorePattern")
        public String logStorePattern;

        @NameInMap("LogUserIds")
        public java.util.List<String> logUserIds;

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
