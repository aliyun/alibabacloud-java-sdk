// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ListDataSourcesResponseBodyData data;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataSourcesResponseBody setData(ListDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public static class ListDataSourcesResponseBodyDataDataSources extends TeaModel {
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

        public static ListDataSourcesResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataDataSources self = new ListDataSourcesResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataSourcesResponseBodyDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataSourcesResponseBodyDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListDataSourcesResponseBodyDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataSourcesResponseBodyDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ListDataSourcesResponseBodyDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ListDataSourcesResponseBodyDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListDataSourcesResponseBodyDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourcesResponseBodyDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDataSourcesResponseBodyDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSourcesResponseBodyDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ListDataSourcesResponseBodyDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ListDataSourcesResponseBodyDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataSourcesResponseBodyDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourcesResponseBodyDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDataSourcesResponseBodyDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListDataSourcesResponseBodyDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ListDataSourcesResponseBodyDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("DataSources")
        public java.util.List<ListDataSourcesResponseBodyDataDataSources> dataSources;

        public static ListDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyData self = new ListDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataSourcesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataSourcesResponseBodyData setDataSources(java.util.List<ListDataSourcesResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ListDataSourcesResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
        }

    }

}
