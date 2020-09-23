// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListConnectionsResponse extends TeaModel {
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
    public ListConnectionsResponseData data;

    public static ListConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponse self = new ListConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectionsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConnectionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionsResponse setData(ListConnectionsResponseData data) {
        this.data = data;
        return this;
    }
    public ListConnectionsResponseData getData() {
        return this.data;
    }

    public static class ListConnectionsResponseDataConnections extends TeaModel {
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

        @NameInMap("ConnectionType")
        @Validation(required = true)
        public String connectionType;

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

        public static ListConnectionsResponseDataConnections build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseDataConnections self = new ListConnectionsResponseDataConnections();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseDataConnections setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ListConnectionsResponseDataConnections setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListConnectionsResponseDataConnections setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ListConnectionsResponseDataConnections setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ListConnectionsResponseDataConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectionsResponseDataConnections setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public ListConnectionsResponseDataConnections setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListConnectionsResponseDataConnections setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ListConnectionsResponseDataConnections setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListConnectionsResponseDataConnections setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListConnectionsResponseDataConnections setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ListConnectionsResponseDataConnections setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListConnectionsResponseDataConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectionsResponseDataConnections setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListConnectionsResponseDataConnections setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListConnectionsResponseDataConnections setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListConnectionsResponseDataConnections setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListConnectionsResponseDataConnections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListConnectionsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Connections")
        @Validation(required = true)
        public java.util.List<ListConnectionsResponseDataConnections> connections;

        public static ListConnectionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseData self = new ListConnectionsResponseData();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConnectionsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConnectionsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListConnectionsResponseData setConnections(java.util.List<ListConnectionsResponseDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<ListConnectionsResponseDataConnections> getConnections() {
            return this.connections;
        }

    }

}
