// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetTaskByUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTaskByUidResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTaskByUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByUidResponseBody self = new GetTaskByUidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskByUidResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTaskByUidResponseBody setData(GetTaskByUidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskByUidResponseBodyData getData() {
        return this.data;
    }

    public GetTaskByUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskByUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskByUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO extends TeaModel {
        @NameInMap("BindingNum")
        public Integer bindingNum;

        @NameInMap("ExchangeNum")
        public Integer exchangeNum;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImportType")
        public Integer importType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("QueueNum")
        public Integer queueNum;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("VhostName")
        public String vhostName;

        @NameInMap("VhostNum")
        public Integer vhostNum;

        public static GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO build(java.util.Map<String, ?> map) throws Exception {
            GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO self = new GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO();
            return TeaModel.build(map, self);
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setBindingNum(Integer bindingNum) {
            this.bindingNum = bindingNum;
            return this;
        }
        public Integer getBindingNum() {
            return this.bindingNum;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setExchangeNum(Integer exchangeNum) {
            this.exchangeNum = exchangeNum;
            return this;
        }
        public Integer getExchangeNum() {
            return this.exchangeNum;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setImportType(Integer importType) {
            this.importType = importType;
            return this;
        }
        public Integer getImportType() {
            return this.importType;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setQueueNum(Integer queueNum) {
            this.queueNum = queueNum;
            return this;
        }
        public Integer getQueueNum() {
            return this.queueNum;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

        public GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO setVhostNum(Integer vhostNum) {
            this.vhostNum = vhostNum;
            return this;
        }
        public Integer getVhostNum() {
            return this.vhostNum;
        }

    }

    public static class GetTaskByUidResponseBodyDataVoList extends TeaModel {
        @NameInMap("ImportDefinitionTaskDO")
        public java.util.List<GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO> importDefinitionTaskDO;

        public static GetTaskByUidResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetTaskByUidResponseBodyDataVoList self = new GetTaskByUidResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetTaskByUidResponseBodyDataVoList setImportDefinitionTaskDO(java.util.List<GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO> importDefinitionTaskDO) {
            this.importDefinitionTaskDO = importDefinitionTaskDO;
            return this;
        }
        public java.util.List<GetTaskByUidResponseBodyDataVoListImportDefinitionTaskDO> getImportDefinitionTaskDO() {
            return this.importDefinitionTaskDO;
        }

    }

    public static class GetTaskByUidResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public GetTaskByUidResponseBodyDataVoList voList;

        public static GetTaskByUidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskByUidResponseBodyData self = new GetTaskByUidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskByUidResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetTaskByUidResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetTaskByUidResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetTaskByUidResponseBodyData setVoList(GetTaskByUidResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public GetTaskByUidResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
