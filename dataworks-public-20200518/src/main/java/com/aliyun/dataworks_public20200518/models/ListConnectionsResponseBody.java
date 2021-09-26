// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListConnectionsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ListConnectionsResponseBodyData data;

    public static ListConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponseBody self = new ListConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListConnectionsResponseBody setData(ListConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConnectionsResponseBodyData getData() {
        return this.data;
    }

    public static class ListConnectionsResponseBodyDataConnections extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ConnectionType")
        public String connectionType;

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

        public static ListConnectionsResponseBodyDataConnections build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnections self = new ListConnectionsResponseBodyDataConnections();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnections setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListConnectionsResponseBodyDataConnections setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public ListConnectionsResponseBodyDataConnections setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListConnectionsResponseBodyDataConnections setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListConnectionsResponseBodyDataConnections setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListConnectionsResponseBodyDataConnections setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ListConnectionsResponseBodyDataConnections setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ListConnectionsResponseBodyDataConnections setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListConnectionsResponseBodyDataConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectionsResponseBodyDataConnections setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListConnectionsResponseBodyDataConnections setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ListConnectionsResponseBodyDataConnections setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ListConnectionsResponseBodyDataConnections setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListConnectionsResponseBodyDataConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectionsResponseBodyDataConnections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListConnectionsResponseBodyDataConnections setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListConnectionsResponseBodyDataConnections setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ListConnectionsResponseBodyDataConnections setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListConnectionsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Connections")
        public java.util.List<ListConnectionsResponseBodyDataConnections> connections;

        public static ListConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyData self = new ListConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConnectionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConnectionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListConnectionsResponseBodyData setConnections(java.util.List<ListConnectionsResponseBodyDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnections> getConnections() {
            return this.connections;
        }

    }

}
