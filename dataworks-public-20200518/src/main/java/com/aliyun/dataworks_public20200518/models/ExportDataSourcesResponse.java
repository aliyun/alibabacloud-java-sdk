// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ExportDataSourcesResponseData data;

    public static ExportDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDataSourcesResponse self = new ExportDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ExportDataSourcesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportDataSourcesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExportDataSourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDataSourcesResponse setData(ExportDataSourcesResponseData data) {
        this.data = data;
        return this;
    }
    public ExportDataSourcesResponseData getData() {
        return this.data;
    }

    public static class ExportDataSourcesResponseDataDataSources extends TeaModel {
        @NameInMap("Shared")
        @Validation(required = true)
        public Boolean shared;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("ConnectStatus")
        @Validation(required = true)
        public Integer connectStatus;

        @NameInMap("BindingCalcEngineId")
        @Validation(required = true)
        public Integer bindingCalcEngineId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DataSourceType")
        @Validation(required = true)
        public String dataSourceType;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("DefaultEngine")
        @Validation(required = true)
        public Boolean defaultEngine;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Sequence")
        @Validation(required = true)
        public Integer sequence;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("SubType")
        @Validation(required = true)
        public String subType;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Integer projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static ExportDataSourcesResponseDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseDataDataSources self = new ExportDataSourcesResponseDataDataSources();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ExportDataSourcesResponseDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExportDataSourcesResponseDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ExportDataSourcesResponseDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ExportDataSourcesResponseDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportDataSourcesResponseDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ExportDataSourcesResponseDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportDataSourcesResponseDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ExportDataSourcesResponseDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportDataSourcesResponseDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ExportDataSourcesResponseDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ExportDataSourcesResponseDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ExportDataSourcesResponseDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportDataSourcesResponseDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportDataSourcesResponseDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportDataSourcesResponseDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ExportDataSourcesResponseDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportDataSourcesResponseDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExportDataSourcesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("DataSources")
        @Validation(required = true)
        public java.util.List<ExportDataSourcesResponseDataDataSources> dataSources;

        public static ExportDataSourcesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseData self = new ExportDataSourcesResponseData();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ExportDataSourcesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ExportDataSourcesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ExportDataSourcesResponseData setDataSources(java.util.List<ExportDataSourcesResponseDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ExportDataSourcesResponseDataDataSources> getDataSources() {
            return this.dataSources;
        }

    }

}
