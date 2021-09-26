// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportConnectionsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ExportConnectionsResponseBodyData data;

    public static ExportConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportConnectionsResponseBody self = new ExportConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportConnectionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExportConnectionsResponseBody setData(ExportConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportConnectionsResponseBodyData getData() {
        return this.data;
    }

    public static class ExportConnectionsResponseBodyDataDataSources extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ProjectId")
        public Integer projectId;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("ConnectStatus")
        public Integer connectStatus;

        @NameInMap("Sequence")
        public Integer sequence;

        @NameInMap("Description")
        public String description;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("DefaultEngine")
        public Boolean defaultEngine;

        @NameInMap("Shared")
        public Boolean shared;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("BindingCalcEngineId")
        public Integer bindingCalcEngineId;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ExportConnectionsResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ExportConnectionsResponseBodyDataDataSources self = new ExportConnectionsResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public ExportConnectionsResponseBodyDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportConnectionsResponseBodyDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ExportConnectionsResponseBodyDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportConnectionsResponseBodyDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExportConnectionsResponseBodyDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ExportConnectionsResponseBodyDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ExportConnectionsResponseBodyDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ExportConnectionsResponseBodyDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportConnectionsResponseBodyDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ExportConnectionsResponseBodyDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportConnectionsResponseBodyDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ExportConnectionsResponseBodyDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ExportConnectionsResponseBodyDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportConnectionsResponseBodyDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportConnectionsResponseBodyDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportConnectionsResponseBodyDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportConnectionsResponseBodyDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ExportConnectionsResponseBodyDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ExportConnectionsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("DataSources")
        public java.util.List<ExportConnectionsResponseBodyDataDataSources> dataSources;

        public static ExportConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportConnectionsResponseBodyData self = new ExportConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportConnectionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ExportConnectionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ExportConnectionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ExportConnectionsResponseBodyData setDataSources(java.util.List<ExportConnectionsResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ExportConnectionsResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
        }

    }

}
