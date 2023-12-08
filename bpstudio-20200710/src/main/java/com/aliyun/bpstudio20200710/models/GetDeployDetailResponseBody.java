// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20200710.models;

import com.aliyun.tea.*;

public class GetDeployDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetDeployDetailResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public Long nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetDeployDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeployDetailResponseBody self = new GetDeployDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeployDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeployDetailResponseBody setData(java.util.List<GetDeployDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDeployDetailResponseBodyData> getData() {
        return this.data;
    }

    public GetDeployDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeployDetailResponseBody setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public GetDeployDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeployDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetDeployDetailResponseBodyDataResourceListOperation extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operations")
        public java.util.Map<String, ?> operations;

        public static GetDeployDetailResponseBodyDataResourceListOperation build(java.util.Map<String, ?> map) throws Exception {
            GetDeployDetailResponseBodyDataResourceListOperation self = new GetDeployDetailResponseBodyDataResourceListOperation();
            return TeaModel.build(map, self);
        }

        public GetDeployDetailResponseBodyDataResourceListOperation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeployDetailResponseBodyDataResourceListOperation setOperations(java.util.Map<String, ?> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.Map<String, ?> getOperations() {
            return this.operations;
        }

    }

    public static class GetDeployDetailResponseBodyDataResourceList extends TeaModel {
        @NameInMap("BuyDuration")
        public String buyDuration;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ExecutionStrategy")
        public String executionStrategy;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("MonitorURL")
        public String monitorURL;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Operation")
        public GetDeployDetailResponseBodyDataResourceListOperation operation;

        @NameInMap("RefId")
        public Long refId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceCode")
        public String resourceCode;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        public static GetDeployDetailResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetDeployDetailResponseBodyDataResourceList self = new GetDeployDetailResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public GetDeployDetailResponseBodyDataResourceList setBuyDuration(String buyDuration) {
            this.buyDuration = buyDuration;
            return this;
        }
        public String getBuyDuration() {
            return this.buyDuration;
        }

        public GetDeployDetailResponseBodyDataResourceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetDeployDetailResponseBodyDataResourceList setExecutionStrategy(String executionStrategy) {
            this.executionStrategy = executionStrategy;
            return this;
        }
        public String getExecutionStrategy() {
            return this.executionStrategy;
        }

        public GetDeployDetailResponseBodyDataResourceList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDeployDetailResponseBodyDataResourceList setMonitorURL(String monitorURL) {
            this.monitorURL = monitorURL;
            return this;
        }
        public String getMonitorURL() {
            return this.monitorURL;
        }

        public GetDeployDetailResponseBodyDataResourceList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetDeployDetailResponseBodyDataResourceList setOperation(GetDeployDetailResponseBodyDataResourceListOperation operation) {
            this.operation = operation;
            return this;
        }
        public GetDeployDetailResponseBodyDataResourceListOperation getOperation() {
            return this.operation;
        }

        public GetDeployDetailResponseBodyDataResourceList setRefId(Long refId) {
            this.refId = refId;
            return this;
        }
        public Long getRefId() {
            return this.refId;
        }

        public GetDeployDetailResponseBodyDataResourceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetDeployDetailResponseBodyDataResourceList setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public GetDeployDetailResponseBodyDataResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetDeployDetailResponseBodyDataResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetDeployDetailResponseBodyDataResourceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetDeployDetailResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CurrentProcess")
        public String currentProcess;

        @NameInMap("DeletingNodeList")
        public java.util.List<java.util.Map<String, ?>> deletingNodeList;

        @NameInMap("DeployPercent")
        public Double deployPercent;

        @NameInMap("DeployedNodeList")
        public java.util.List<java.util.Map<String, ?>> deployedNodeList;

        @NameInMap("DeployingNodeList")
        public java.util.List<java.util.Map<String, ?>> deployingNodeList;

        @NameInMap("Error")
        public String error;

        @NameInMap("ExecutionTime")
        public Integer executionTime;

        @NameInMap("FailStatus")
        public Integer failStatus;

        @NameInMap("OrderIdList")
        public java.util.List<String> orderIdList;

        @NameInMap("PdfUrl")
        public String pdfUrl;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceList")
        public java.util.List<GetDeployDetailResponseBodyDataResourceList> resourceList;

        @NameInMap("Status")
        public String status;

        @NameInMap("TerraformScriptUrl")
        public String terraformScriptUrl;

        public static GetDeployDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeployDetailResponseBodyData self = new GetDeployDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeployDetailResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetDeployDetailResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeployDetailResponseBodyData setCurrentProcess(String currentProcess) {
            this.currentProcess = currentProcess;
            return this;
        }
        public String getCurrentProcess() {
            return this.currentProcess;
        }

        public GetDeployDetailResponseBodyData setDeletingNodeList(java.util.List<java.util.Map<String, ?>> deletingNodeList) {
            this.deletingNodeList = deletingNodeList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDeletingNodeList() {
            return this.deletingNodeList;
        }

        public GetDeployDetailResponseBodyData setDeployPercent(Double deployPercent) {
            this.deployPercent = deployPercent;
            return this;
        }
        public Double getDeployPercent() {
            return this.deployPercent;
        }

        public GetDeployDetailResponseBodyData setDeployedNodeList(java.util.List<java.util.Map<String, ?>> deployedNodeList) {
            this.deployedNodeList = deployedNodeList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDeployedNodeList() {
            return this.deployedNodeList;
        }

        public GetDeployDetailResponseBodyData setDeployingNodeList(java.util.List<java.util.Map<String, ?>> deployingNodeList) {
            this.deployingNodeList = deployingNodeList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDeployingNodeList() {
            return this.deployingNodeList;
        }

        public GetDeployDetailResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetDeployDetailResponseBodyData setExecutionTime(Integer executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public Integer getExecutionTime() {
            return this.executionTime;
        }

        public GetDeployDetailResponseBodyData setFailStatus(Integer failStatus) {
            this.failStatus = failStatus;
            return this;
        }
        public Integer getFailStatus() {
            return this.failStatus;
        }

        public GetDeployDetailResponseBodyData setOrderIdList(java.util.List<String> orderIdList) {
            this.orderIdList = orderIdList;
            return this;
        }
        public java.util.List<String> getOrderIdList() {
            return this.orderIdList;
        }

        public GetDeployDetailResponseBodyData setPdfUrl(String pdfUrl) {
            this.pdfUrl = pdfUrl;
            return this;
        }
        public String getPdfUrl() {
            return this.pdfUrl;
        }

        public GetDeployDetailResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetDeployDetailResponseBodyData setResourceList(java.util.List<GetDeployDetailResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetDeployDetailResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

        public GetDeployDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeployDetailResponseBodyData setTerraformScriptUrl(String terraformScriptUrl) {
            this.terraformScriptUrl = terraformScriptUrl;
            return this;
        }
        public String getTerraformScriptUrl() {
            return this.terraformScriptUrl;
        }

    }

}
