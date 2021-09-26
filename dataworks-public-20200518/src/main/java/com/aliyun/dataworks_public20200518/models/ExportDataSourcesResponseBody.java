// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ExportDataSourcesResponseBodyData data;

    public static ExportDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDataSourcesResponseBody self = new ExportDataSourcesResponseBody();
        return TeaModel.build(map, self);
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

    public ExportDataSourcesResponseBody setData(ExportDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public static class ExportDataSourcesResponseBodyDataDataSources extends TeaModel {
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

        public static ExportDataSourcesResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseBodyDataDataSources self = new ExportDataSourcesResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseBodyDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportDataSourcesResponseBodyDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ExportDataSourcesResponseBodyDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExportDataSourcesResponseBodyDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ExportDataSourcesResponseBodyDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ExportDataSourcesResponseBodyDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ExportDataSourcesResponseBodyDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportDataSourcesResponseBodyDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportDataSourcesResponseBodyDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportDataSourcesResponseBodyDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportDataSourcesResponseBodyDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("DataSources")
        public java.util.List<ExportDataSourcesResponseBodyDataDataSources> dataSources;

        public static ExportDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseBodyData self = new ExportDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
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

        public ExportDataSourcesResponseBodyData setDataSources(java.util.List<ExportDataSourcesResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ExportDataSourcesResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
        }

    }

}
