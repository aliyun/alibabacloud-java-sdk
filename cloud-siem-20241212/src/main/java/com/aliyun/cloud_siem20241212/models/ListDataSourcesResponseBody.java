// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("DataSources")
    public java.util.List<ListDataSourcesResponseBodyDataSources> dataSources;

    /**
     * <strong>example:</strong>
     * <p>50。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setDataSources(java.util.List<ListDataSourcesResponseBodyDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<ListDataSourcesResponseBodyDataSources> getDataSources() {
        return this.dataSources;
    }

    public ListDataSourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSourcesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDataSourcesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListDataSourcesResponseBodyDataSourcesDataSourceReferences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_account_snapshot_log_173326*******。</p>
         */
        @NameInMap("DataIngestionId")
        public String dataIngestionId;

        public static ListDataSourcesResponseBodyDataSourcesDataSourceReferences build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataSourcesDataSourceReferences self = new ListDataSourcesResponseBodyDataSourcesDataSourceReferences();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceReferences setDataIngestionId(String dataIngestionId) {
            this.dataIngestionId = dataIngestionId;
            return this;
        }
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

    }

    public static class ListDataSourcesResponseBodyDataSourcesDataSourceStores extends TeaModel {
        @NameInMap("CheckTime")
        public Long checkTime;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>center。</p>
         */
        @NameInMap("DataSourceStoreFrom")
        public String dataSourceStoreFrom;

        /**
         * <strong>example:</strong>
         * <p>di_xxxx_source_1。</p>
         */
        @NameInMap("DataSourceStoreId")
        public String dataSourceStoreId;

        /**
         * <strong>example:</strong>
         * <p>normal。</p>
         */
        @NameInMap("DataSourceStoreStatus")
        public String dataSourceStoreStatus;

        /**
         * <strong>example:</strong>
         * <p>LogStoreNotExist</p>
         */
        @NameInMap("DataSourceStoreStatusCode")
        public String dataSourceStoreStatusCode;

        /**
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou。</p>
         */
        @NameInMap("LogProjectName")
        public String logProjectName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou。</p>
         */
        @NameInMap("LogRegionId")
        public String logRegionId;

        /**
         * <strong>example:</strong>
         * <p>audit-activity。</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataSourcesResponseBodyDataSourcesDataSourceStores build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataSourcesDataSourceStores self = new ListDataSourcesResponseBodyDataSourcesDataSourceStores();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setCheckTime(Long checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public Long getCheckTime() {
            return this.checkTime;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setDataSourceStoreFrom(String dataSourceStoreFrom) {
            this.dataSourceStoreFrom = dataSourceStoreFrom;
            return this;
        }
        public String getDataSourceStoreFrom() {
            return this.dataSourceStoreFrom;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setDataSourceStoreId(String dataSourceStoreId) {
            this.dataSourceStoreId = dataSourceStoreId;
            return this;
        }
        public String getDataSourceStoreId() {
            return this.dataSourceStoreId;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setDataSourceStoreStatus(String dataSourceStoreStatus) {
            this.dataSourceStoreStatus = dataSourceStoreStatus;
            return this;
        }
        public String getDataSourceStoreStatus() {
            return this.dataSourceStoreStatus;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setDataSourceStoreStatusCode(String dataSourceStoreStatusCode) {
            this.dataSourceStoreStatusCode = dataSourceStoreStatusCode;
            return this;
        }
        public String getDataSourceStoreStatusCode() {
            return this.dataSourceStoreStatusCode;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setLogProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }
        public String getLogProjectName() {
            return this.logProjectName;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public ListDataSourcesResponseBodyDataSourcesDataSourceStores setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListDataSourcesResponseBodyDataSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>center。</p>
         */
        @NameInMap("DataSourceFrom")
        public String dataSourceFrom;

        /**
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c。</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>AD_LOG。</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("DataSourceRecognizeEnabled")
        public Boolean dataSourceRecognizeEnabled;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_account_snapshot。</p>
         */
        @NameInMap("DataSourceRecognizer")
        public String dataSourceRecognizer;

        @NameInMap("DataSourceReferences")
        public java.util.List<ListDataSourcesResponseBodyDataSourcesDataSourceReferences> dataSourceReferences;

        @NameInMap("DataSourceStatus")
        public String dataSourceStatus;

        @NameInMap("DataSourceStores")
        public java.util.List<ListDataSourcesResponseBodyDataSourcesDataSourceStores> dataSourceStores;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_account_snapshot_log_173326*******。</p>
         */
        @NameInMap("DataSourceTemplateId")
        public String dataSourceTemplateId;

        /**
         * <strong>example:</strong>
         * <p>custom。</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou。</p>
         */
        @NameInMap("LogProjectName")
        public String logProjectName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou。</p>
         */
        @NameInMap("LogRegionId")
        public String logRegionId;

        /**
         * <strong>example:</strong>
         * <p>audit-activity。</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <strong>example:</strong>
         * <p>173326*******。</p>
         */
        @NameInMap("LogUserId")
        public Long logUserId;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataSourcesResponseBodyDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataSources self = new ListDataSourcesResponseBodyDataSources();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataSources setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceFrom(String dataSourceFrom) {
            this.dataSourceFrom = dataSourceFrom;
            return this;
        }
        public String getDataSourceFrom() {
            return this.dataSourceFrom;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }
        public Boolean getDataSourceRecognizeEnabled() {
            return this.dataSourceRecognizeEnabled;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceRecognizer(String dataSourceRecognizer) {
            this.dataSourceRecognizer = dataSourceRecognizer;
            return this;
        }
        public String getDataSourceRecognizer() {
            return this.dataSourceRecognizer;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceReferences(java.util.List<ListDataSourcesResponseBodyDataSourcesDataSourceReferences> dataSourceReferences) {
            this.dataSourceReferences = dataSourceReferences;
            return this;
        }
        public java.util.List<ListDataSourcesResponseBodyDataSourcesDataSourceReferences> getDataSourceReferences() {
            return this.dataSourceReferences;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceStatus(String dataSourceStatus) {
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }
        public String getDataSourceStatus() {
            return this.dataSourceStatus;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceStores(java.util.List<ListDataSourcesResponseBodyDataSourcesDataSourceStores> dataSourceStores) {
            this.dataSourceStores = dataSourceStores;
            return this;
        }
        public java.util.List<ListDataSourcesResponseBodyDataSourcesDataSourceStores> getDataSourceStores() {
            return this.dataSourceStores;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceTemplateId(String dataSourceTemplateId) {
            this.dataSourceTemplateId = dataSourceTemplateId;
            return this;
        }
        public String getDataSourceTemplateId() {
            return this.dataSourceTemplateId;
        }

        public ListDataSourcesResponseBodyDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDataSourcesResponseBodyDataSources setLogProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }
        public String getLogProjectName() {
            return this.logProjectName;
        }

        public ListDataSourcesResponseBodyDataSources setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public ListDataSourcesResponseBodyDataSources setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public ListDataSourcesResponseBodyDataSources setLogUserId(Long logUserId) {
            this.logUserId = logUserId;
            return this;
        }
        public Long getLogUserId() {
            return this.logUserId;
        }

        public ListDataSourcesResponseBodyDataSources setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
