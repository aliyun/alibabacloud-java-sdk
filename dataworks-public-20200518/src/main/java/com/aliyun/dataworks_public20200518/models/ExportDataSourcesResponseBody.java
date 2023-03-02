// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The information about the export operation.</p>
     */
    @NameInMap("Data")
    public ExportDataSourcesResponseBodyData data;

    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <br>
     * <p>*   200: The request was successful.</p>
     * <p>*   Other values: The request failed. You can troubleshoot issues based on the HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExportDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDataSourcesResponseBody self = new ExportDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDataSourcesResponseBody setData(ExportDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public ExportDataSourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportDataSourcesResponseBodyDataDataSources extends TeaModel {
        /**
         * <p>The ID of the compute engine to which the data source is bound.</p>
         */
        @NameInMap("BindingCalcEngineId")
        public Integer bindingCalcEngineId;

        /**
         * <p>Indicates whether the data source is connected to an exclusive resource group. Valid values:</p>
         * <br>
         * <p>*   1: The data source is connected to at least one exclusive resource group.</p>
         * <p>*   0: The data source is not connected to any exclusive resource group.</p>
         */
        @NameInMap("ConnectStatus")
        public Integer connectStatus;

        /**
         * <p>The configuration of the data source.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   odps</p>
         * <p>*   mysql</p>
         * <p>*   rds</p>
         * <p>*   oss</p>
         * <p>*   sqlserver</p>
         * <p>*   polardb</p>
         * <p>*   oracle</p>
         * <p>*   mongodb</p>
         * <p>*   emr</p>
         * <p>*   postgresql</p>
         * <p>*   analyticdb_for_mysql</p>
         * <p>*   hybriddb_for_postgresql</p>
         * <p>*   holo</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>Indicates whether the compute engine to which the data source is bound is the default compute engine. Valid values:</p>
         * <br>
         * <p>*   true: The compute engine is the default compute engine.</p>
         * <p>*   false: The compute engine is not the default compute engine.</p>
         */
        @NameInMap("DefaultEngine")
        public Boolean defaultEngine;

        /**
         * <p>The description of the data source.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The environment to which the data source belongs. Valid values:</p>
         * <br>
         * <p>*   0: development environment</p>
         * <p>*   1: production environment</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>The time when the data source was created. Example: Mar 17, 2021 4:09:32 PM.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the data source was last modified. Example: Mar 17, 2021 4:09:32 PM.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user who exported the data source.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The ID of the DataWorks workspace to which the data source belongs.</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The sequence number of the data source.</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Indicates whether the data source can be shared. Valid values:</p>
         * <br>
         * <p>*   true: The data source can be shared.</p>
         * <p>*   false: The data source cannot be shared.</p>
         */
        @NameInMap("Shared")
        public Boolean shared;

        /**
         * <p>Indicates whether the data source is available. Valid values:</p>
         * <br>
         * <p>*   1: The data source is available.</p>
         * <p>*   0: The data source is unavailable.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The subtype of the data source. This parameter is returned only if the value of the DataSourceType parameter is rds.</p>
         * <br>
         * <p>If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the data source belongs.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ExportDataSourcesResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseBodyDataDataSources self = new ExportDataSourcesResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseBodyDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ExportDataSourcesResponseBodyDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ExportDataSourcesResponseBodyDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportDataSourcesResponseBodyDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportDataSourcesResponseBodyDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExportDataSourcesResponseBodyDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportDataSourcesResponseBodyDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportDataSourcesResponseBodyDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportDataSourcesResponseBodyDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ExportDataSourcesResponseBodyDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ExportDataSourcesResponseBodyDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ExportDataSourcesResponseBodyDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportDataSourcesResponseBodyDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ExportDataSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The details of the exported data sources.</p>
         * <br>
         * <p>The value is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a sample data source.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<ExportDataSourcesResponseBodyDataDataSources> dataSources;

        /**
         * <p>The page number of the returned page. The value of this parameter is a positive integer greater than or equal to 1.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ExportDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseBodyData self = new ExportDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseBodyData setDataSources(java.util.List<ExportDataSourcesResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ExportDataSourcesResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
        }

        public ExportDataSourcesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ExportDataSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ExportDataSourcesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
