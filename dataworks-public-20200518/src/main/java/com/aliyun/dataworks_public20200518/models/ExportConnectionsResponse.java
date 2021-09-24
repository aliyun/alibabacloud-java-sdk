// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportConnectionsResponse extends TeaModel {
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
    public ExportConnectionsResponseData data;

    public static ExportConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportConnectionsResponse self = new ExportConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ExportConnectionsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportConnectionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExportConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportConnectionsResponse setData(ExportConnectionsResponseData data) {
        this.data = data;
        return this;
    }
    public ExportConnectionsResponseData getData() {
        return this.data;
    }

    public static class ExportConnectionsResponseDataDataSources extends TeaModel {
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

        public static ExportConnectionsResponseDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ExportConnectionsResponseDataDataSources self = new ExportConnectionsResponseDataDataSources();
            return TeaModel.build(map, self);
        }

        public ExportConnectionsResponseDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ExportConnectionsResponseDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExportConnectionsResponseDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ExportConnectionsResponseDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ExportConnectionsResponseDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportConnectionsResponseDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ExportConnectionsResponseDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportConnectionsResponseDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ExportConnectionsResponseDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportConnectionsResponseDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ExportConnectionsResponseDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ExportConnectionsResponseDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ExportConnectionsResponseDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportConnectionsResponseDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportConnectionsResponseDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportConnectionsResponseDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ExportConnectionsResponseDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportConnectionsResponseDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ExportConnectionsResponseData extends TeaModel {
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
        public java.util.List<ExportConnectionsResponseDataDataSources> dataSources;

        public static ExportConnectionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExportConnectionsResponseData self = new ExportConnectionsResponseData();
            return TeaModel.build(map, self);
        }

        public ExportConnectionsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ExportConnectionsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ExportConnectionsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ExportConnectionsResponseData setDataSources(java.util.List<ExportConnectionsResponseDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ExportConnectionsResponseDataDataSources> getDataSources() {
            return this.dataSources;
        }

    }

}
