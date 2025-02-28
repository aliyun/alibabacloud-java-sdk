// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Data")
    public GetApplicationResponseBodyData data;

    /**
     * <p>Reason for the request failure</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationResponseBody setData(GetApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationResponseBodyData getData() {
        return this.data;
    }

    public GetApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyDataChecklist extends TeaModel {
        /**
         * <p>The resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("Lifecycle")
        public String lifecycle;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The message returned for verification.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the region.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The verification result.</p>
         * 
         * <strong>example:</strong>
         * <p>Finish</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The resource specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("Specification")
        public String specification;

        public static GetApplicationResponseBodyDataChecklist build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataChecklist self = new GetApplicationResponseBodyDataChecklist();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataChecklist setLifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public String getLifecycle() {
            return this.lifecycle;
        }

        public GetApplicationResponseBodyDataChecklist setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetApplicationResponseBodyDataChecklist setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetApplicationResponseBodyDataChecklist setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public GetApplicationResponseBodyDataChecklist setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetApplicationResponseBodyDataChecklist setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetApplicationResponseBodyDataChecklist setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class GetApplicationResponseBodyDataComplianceListRules extends TeaModel {
        @NameInMap("ruleDetail")
        public String ruleDetail;

        @NameInMap("ruleId")
        public String ruleId;

        public static GetApplicationResponseBodyDataComplianceListRules build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataComplianceListRules self = new GetApplicationResponseBodyDataComplianceListRules();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataComplianceListRules setRuleDetail(String ruleDetail) {
            this.ruleDetail = ruleDetail;
            return this;
        }
        public String getRuleDetail() {
            return this.ruleDetail;
        }

        public GetApplicationResponseBodyDataComplianceListRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetApplicationResponseBodyDataComplianceList extends TeaModel {
        @NameInMap("ResourceCode")
        public String resourceCode;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Rules")
        public java.util.List<GetApplicationResponseBodyDataComplianceListRules> rules;

        public static GetApplicationResponseBodyDataComplianceList build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataComplianceList self = new GetApplicationResponseBodyDataComplianceList();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataComplianceList setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public GetApplicationResponseBodyDataComplianceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetApplicationResponseBodyDataComplianceList setRules(java.util.List<GetApplicationResponseBodyDataComplianceListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataComplianceListRules> getRules() {
            return this.rules;
        }

    }

    public static class GetApplicationResponseBodyDataPriceList extends TeaModel {
        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Resource Fill Labels.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("Lifecycle")
        public String lifecycle;

        /**
         * <p>The unit price of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("OnePrice")
        public Double onePrice;

        /**
         * <p>The original price of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3.570</p>
         */
        @NameInMap("OriginalPrice")
        public Double originalPrice;

        /**
         * <p>The service duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The total price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Price")
        public Double price;

        /**
         * <p>Unit: USD per hour</p>
         * 
         * <strong>example:</strong>
         * <p>The service duration.</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The error message that is returned when a price query fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.e3.large</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Product code</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>The instance type. This parameter indicates the information about the instance type. For example, 192.168.0.0/16 may be returned for a Virtual Private Cloud (VPC) instance, ecs.g5.large may be returned for an Elastic Compute Service (ECS) instance, and slb.s1.small may be returned for a Server Load Balancer (SLB) instance. If the resource does not have a specific type, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The billing method.</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The creation mode. Valid values:\
         * 1: creates a new instance.\
         * 2: imports an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public String type;

        public static GetApplicationResponseBodyDataPriceList build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPriceList self = new GetApplicationResponseBodyDataPriceList();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPriceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetApplicationResponseBodyDataPriceList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetApplicationResponseBodyDataPriceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetApplicationResponseBodyDataPriceList setLifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public String getLifecycle() {
            return this.lifecycle;
        }

        public GetApplicationResponseBodyDataPriceList setOnePrice(Double onePrice) {
            this.onePrice = onePrice;
            return this;
        }
        public Double getOnePrice() {
            return this.onePrice;
        }

        public GetApplicationResponseBodyDataPriceList setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public GetApplicationResponseBodyDataPriceList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetApplicationResponseBodyDataPriceList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public GetApplicationResponseBodyDataPriceList setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public GetApplicationResponseBodyDataPriceList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetApplicationResponseBodyDataPriceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetApplicationResponseBodyDataPriceList setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public GetApplicationResponseBodyDataPriceList setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public GetApplicationResponseBodyDataPriceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetApplicationResponseBodyDataResourceList extends TeaModel {
        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("Lifecycle")
        public String lifecycle;

        @NameInMap("NodeLabel")
        public String nodeLabel;

        /**
         * <p>The deployment result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;hostName&quot;:&quot;iZ2zehnzxqixu1pywsfbx1Z&quot;,&quot;memory&quot;:32768.0,&quot;creationTime&quot;:&quot;2021-09-28T11:23:46Z&quot;,&quot;instanceName&quot;:&quot;ecs&quot;,&quot;internetMaxBandwidthOut&quot;:0.0,&quot;description&quot;:&quot;&quot;,&quot;clusterId&quot;:&quot;&quot;,&quot;private_ip&quot;:&quot;192.168.0.247&quot;,&quot;instanceId&quot;:&quot;i-2zehnzxqixu1pywsfbx1&quot;,&quot;requestId&quot;:&quot;F1C64344-3723-51A0-855B-5F08B5634323&quot;,&quot;zoneId&quot;:&quot;cn-beijing-b&quot;,&quot;ioOptimized&quot;:&quot;optimized&quot;,&quot;id&quot;:&quot;i-2zehnzxqixu1pywsfbx1&quot;,&quot;instanceNetworkType&quot;:&quot;vpc&quot;,&quot;instanceChargeType&quot;:&quot;PostPaid&quot;,&quot;imageId&quot;:&quot;centos_8_4_x64_20G_alibase_20210824.vhd&quot;,&quot;serialNumber&quot;:&quot;cee246c4-38f3-4bf3-950b-c17e88ff6527&quot;,&quot;vlanId&quot;:&quot;&quot;,&quot;instanceType&quot;:&quot;ecs.e3.large&quot;,&quot;cpu&quot;:4.0,&quot;creditSpecification&quot;:&quot;&quot;,&quot;internetMaxBandwidthIn&quot;:-1.0,&quot;expiredTime&quot;:&quot;2099-12-31T15:59Z&quot;,&quot;internetChargeType&quot;:&quot;PayByTraffic&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;refId&quot;:&quot;79224644_0&quot;,&quot;stoppedMode&quot;:&quot;Not-applicable&quot;,&quot;status&quot;:&quot;Running&quot;}</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zehnzxqixu1pywsfbx1</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The resource deployment result.</p>
         * 
         * <strong>example:</strong>
         * <p>Finish</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetApplicationResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataResourceList self = new GetApplicationResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataResourceList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetApplicationResponseBodyDataResourceList setLifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public String getLifecycle() {
            return this.lifecycle;
        }

        public GetApplicationResponseBodyDataResourceList setNodeLabel(String nodeLabel) {
            this.nodeLabel = nodeLabel;
            return this;
        }
        public String getNodeLabel() {
            return this.nodeLabel;
        }

        public GetApplicationResponseBodyDataResourceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetApplicationResponseBodyDataResourceList setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public GetApplicationResponseBodyDataResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetApplicationResponseBodyDataResourceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetApplicationResponseBodyDataResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetApplicationResponseBodyDataResourceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetApplicationResponseBodyData extends TeaModel {
        /**
         * <p>App ID</p>
         * 
         * <strong>example:</strong>
         * <p>VVK605ZH00OA4MRT</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The resource tag.</p>
         */
        @NameInMap("Checklist")
        public java.util.List<GetApplicationResponseBodyDataChecklist> checklist;

        @NameInMap("ComplianceList")
        public java.util.List<GetApplicationResponseBodyDataComplianceList> complianceList;

        /**
         * <p>The time when the app was created</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-09 14:37:16</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeployPercent")
        public Double deployPercent;

        /**
         * <p>Application description</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The URL of the image in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>The details of the application.</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <p>App name</p>
         * 
         * <strong>example:</strong>
         * <p>1411182597819805/sr-8DWU4RUS49NIDII0.png</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The billing results.</p>
         */
        @NameInMap("PriceList")
        public java.util.List<GetApplicationResponseBodyDataPriceList> priceList;

        /**
         * <p>The ID of the resource group to which the app belongs</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzhfgmw4e6fwq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource specification.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<GetApplicationResponseBodyDataResourceList> resourceList;

        /**
         * <p>Verification passed</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed_Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the template associated with the application</p>
         * 
         * <strong>example:</strong>
         * <p>FYS9VZ535U20V7HT</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static GetApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyData self = new GetApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationResponseBodyData setChecklist(java.util.List<GetApplicationResponseBodyDataChecklist> checklist) {
            this.checklist = checklist;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataChecklist> getChecklist() {
            return this.checklist;
        }

        public GetApplicationResponseBodyData setComplianceList(java.util.List<GetApplicationResponseBodyDataComplianceList> complianceList) {
            this.complianceList = complianceList;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataComplianceList> getComplianceList() {
            return this.complianceList;
        }

        public GetApplicationResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetApplicationResponseBodyData setDeployPercent(Double deployPercent) {
            this.deployPercent = deployPercent;
            return this;
        }
        public Double getDeployPercent() {
            return this.deployPercent;
        }

        public GetApplicationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetApplicationResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public GetApplicationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyData setPriceList(java.util.List<GetApplicationResponseBodyDataPriceList> priceList) {
            this.priceList = priceList;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataPriceList> getPriceList() {
            return this.priceList;
        }

        public GetApplicationResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetApplicationResponseBodyData setResourceList(java.util.List<GetApplicationResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

        public GetApplicationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApplicationResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
