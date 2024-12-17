// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20200710.models;

import com.aliyun.tea.*;

public class GetDeployDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetDeployDetailResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public Long nextToken;

    /**
     * <strong>example:</strong>
     * <p>E15B71B4-5D8F-5484-BC07-989E2987EE7C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ecsDelete</p>
         */
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

    public static class GetDeployDetailResponseBodyDataResourceListResourceTimeList extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CreationEndTime")
        public Long creationEndTime;

        @NameInMap("CreationStartTime")
        public Long creationStartTime;

        @NameInMap("id")
        public Long id;

        public static GetDeployDetailResponseBodyDataResourceListResourceTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetDeployDetailResponseBodyDataResourceListResourceTimeList self = new GetDeployDetailResponseBodyDataResourceListResourceTimeList();
            return TeaModel.build(map, self);
        }

        public GetDeployDetailResponseBodyDataResourceListResourceTimeList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetDeployDetailResponseBodyDataResourceListResourceTimeList setCreationEndTime(Long creationEndTime) {
            this.creationEndTime = creationEndTime;
            return this;
        }
        public Long getCreationEndTime() {
            return this.creationEndTime;
        }

        public GetDeployDetailResponseBodyDataResourceListResourceTimeList setCreationStartTime(Long creationStartTime) {
            this.creationStartTime = creationStartTime;
            return this;
        }
        public Long getCreationStartTime() {
            return this.creationStartTime;
        }

        public GetDeployDetailResponseBodyDataResourceListResourceTimeList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetDeployDetailResponseBodyDataResourceList extends TeaModel {
        @NameInMap("BuyDuration")
        public String buyDuration;

        /**
         * <strong>example:</strong>
         * <p>Free</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>OpenApi</p>
         */
        @NameInMap("ExecutionStrategy")
        public String executionStrategy;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <strong>example:</strong>
         * <p>1714031840000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cloudmonitor.console.aliyun.com/?#/generalcharts/product=vpc&group=&type=&return&region=cn-hangzhou&dimension=instanceId:vpc-bp1n6uc5jqxtff2euhnx5">https://cloudmonitor.console.aliyun.com/?#/generalcharts/product=vpc&amp;group=&amp;type=&amp;return&amp;region=cn-hangzhou&amp;dimension=instanceId:vpc-bp1n6uc5jqxtff2euhnx5</a></p>
         */
        @NameInMap("MonitorURL")
        public String monitorURL;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Operation")
        public GetDeployDetailResponseBodyDataResourceListOperation operation;

        /**
         * <strong>example:</strong>
         * <p>1716049421</p>
         */
        @NameInMap("RefId")
        public Long refId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Description\&quot;:\&quot;\&quot;,\&quot;ClassicLinkEnabled\&quot;:false,\&quot;ResourceGroupId\&quot;:\&quot;rg-acfm4mlwqjalz7a\&quot;,\&quot;SecondaryCidrBlocks\&quot;:[],\&quot;CidrBlock\&quot;:\&quot;192.168.0.0/16\&quot;,\&quot;UserCidrs\&quot;:[],\&quot;NetworkAclNum\&quot;:\&quot;0\&quot;,\&quot;VRouterId\&quot;:\&quot;vrt-m5ek7vcyld0x5ym8m9hix\&quot;,\&quot;OwnerId\&quot;:1986207497633020,\&quot;AssociatedCens\&quot;:[],\&quot;id\&quot;:\&quot;vpc-m5e3c9nz4lj19byan9m2g\&quot;,\&quot;CloudResources\&quot;:[{\&quot;ResourceCount\&quot;:1,\&quot;ResourceType\&quot;:\&quot;VSwitch\&quot;},{\&quot;ResourceCount\&quot;:1,\&quot;ResourceType\&quot;:\&quot;VRouter\&quot;},{\&quot;ResourceCount\&quot;:1,\&quot;ResourceType\&quot;:\&quot;RouteTable\&quot;}],\&quot;Tags\&quot;:[],\&quot;Status\&quot;:\&quot;Available\&quot;,\&quot;IsDefault\&quot;:false,\&quot;RequestId\&quot;:\&quot;494646FB-14C0-5B4C-9684-B6EFBF4DF01C\&quot;,\&quot;SupportIpv4Gateway\&quot;:false,\&quot;Ipv4GatewayId\&quot;:\&quot;\&quot;,\&quot;VSwitchIds\&quot;:[\&quot;vsw-m5egl9wtppiadysjwlgb1\&quot;],\&quot;VpcId\&quot;:\&quot;vpc-m5e3c9nz4lj19byan9m2g\&quot;,\&quot;CreationTime\&quot;:\&quot;2024-04-25T07:56:59Z\&quot;,\&quot;VpcName\&quot;:\&quot;vpc\&quot;,\&quot;refId\&quot;:\&quot;1714031764_0\&quot;,\&quot;RegionId\&quot;:\&quot;cn-qingdao\&quot;,\&quot;Ipv6CidrBlock\&quot;:\&quot;\&quot;,\&quot;Ipv6CidrBlocks\&quot;:[]}</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <strong>example:</strong>
         * <p>i-2zehnzxqixu1pywsfbx1</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceTimeList")
        public java.util.List<GetDeployDetailResponseBodyDataResourceListResourceTimeList> resourceTimeList;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Finish</p>
         */
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

        public GetDeployDetailResponseBodyDataResourceList setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
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

        public GetDeployDetailResponseBodyDataResourceList setResourceTimeList(java.util.List<GetDeployDetailResponseBodyDataResourceListResourceTimeList> resourceTimeList) {
            this.resourceTimeList = resourceTimeList;
            return this;
        }
        public java.util.List<GetDeployDetailResponseBodyDataResourceListResourceTimeList> getResourceTimeList() {
            return this.resourceTimeList;
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
        /**
         * <strong>example:</strong>
         * <p>EQ4W772D0VJ33IV1</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>1645516991000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>DEPLOY</p>
         */
        @NameInMap("CurrentProcess")
        public String currentProcess;

        @NameInMap("DeletingNodeList")
        public java.util.List<java.util.Map<String, ?>> deletingNodeList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeployPercent")
        public Double deployPercent;

        @NameInMap("DeployedNodeList")
        public java.util.List<java.util.Map<String, ?>> deployedNodeList;

        @NameInMap("DeployingNodeList")
        public java.util.List<java.util.Map<String, ?>> deployingNodeList;

        /**
         * <strong>example:</strong>
         * <p>OperationNotSupport.SubscriptionCommodityCanNotDelete</p>
         */
        @NameInMap("Error")
        public String error;

        @NameInMap("ExecutionTime")
        public Integer executionTime;

        @NameInMap("FailStatus")
        public Integer failStatus;

        @NameInMap("OrderIdList")
        public java.util.List<String> orderIdList;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cadt-studio-publish.oss-cn-hangzhou.aliyuncs.com/1986207497633020/deployReport-EXN4FNUR12M35KJM.pdf?Expires=1716967763&OSSAccessKeyId=********nw4rvYAweFuQc3&Signature=*******fKo6164wykT9jBOsSGeQ%3D">https://cadt-studio-publish.oss-cn-hangzhou.aliyuncs.com/1986207497633020/deployReport-EXN4FNUR12M35KJM.pdf?Expires=1716967763&amp;OSSAccessKeyId=********nw4rvYAweFuQc3&amp;Signature=*******fKo6164wykT9jBOsSGeQ%3D</a></p>
         */
        @NameInMap("PdfUrl")
        public String pdfUrl;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzhfgmw4e6fwq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceList")
        public java.util.List<GetDeployDetailResponseBodyDataResourceList> resourceList;

        /**
         * <strong>example:</strong>
         * <p>Revised</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cadt-studio-publish.oss-cn-hangzhou.aliyuncs.com/1986207497633020/app_EXN4FNUR12M35KJM.tf?Expires=1716967763&OSSAccessKeyId=*******nw4rvYAweFuQc3&Signature=%2********lYROqJLNvyA8g6qD9U%3D">https://cadt-studio-publish.oss-cn-hangzhou.aliyuncs.com/1986207497633020/app_EXN4FNUR12M35KJM.tf?Expires=1716967763&amp;OSSAccessKeyId=*******nw4rvYAweFuQc3&amp;Signature=%2********lYROqJLNvyA8g6qD9U%3D</a></p>
         */
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
