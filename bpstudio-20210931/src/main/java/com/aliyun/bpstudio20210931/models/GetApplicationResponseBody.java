// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The deployment result.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("Data")
    public GetApplicationResponseBodyData data;

    /**
     * <p>Possible application states:</p>
     * <br>
     * <p>*   Creating: The application is being created.</p>
     * <p>*   Modified: The application has been modified.</p>
     * <p>*   Verifying: The application is being verified.</p>
     * <p>*   Verified_Failure: The application failed to pass the verification.</p>
     * <p>*   Verified_Success: The application has passed the verification.</p>
     * <p>*   Valuating: Fees are being calculated for the application.</p>
     * <p>*   Valuating_Failure: Fees failed to be calculated for the application.</p>
     * <p>*   Valuating_Success: Fees are calculated for the application.</p>
     * <p>*   Deploying: The application is being deployed.</p>
     * <p>*   Deployed_Failure: The application failed to be deployed.</p>
     * <p>*   Partially_Deployed_Success: Some resources of the application are deployed.</p>
     * <p>*   Deployed_Success: The application is deployed.</p>
     * <p>*   Destroying: The application is being released.</p>
     * <p>*   Delayed_Destroy: The application release is delayed.</p>
     * <p>*   Destroyed_Failure: The application failed to be released.</p>
     * <p>*   Partially_Destroyed_Success: Some resources of the application are released.</p>
     * <p>*   Destroyed_Success: The application is released.</p>
     * <p>*   Revised: The application architecture is adjusted.</p>
     * <p>*   Verifying_In_Revision: The application resources are being verified during architecture adjustment.</p>
     * <p>*   Verified_Failure_In_Revision: The application resources failed to pass the verification during architecture adjustment.</p>
     * <p>*   Verified_Success_In_Revision: The application resources are verified during architecture adjustment.</p>
     * <p>*   Valuating_In_Revision: Fees are being calculated for the application during architecture adjustment.</p>
     * <p>*   Valuating_Failure_In_Revision: Fees failed to be calculated for the application during architecture adjustment.</p>
     * <p>*   Valuating_Success_In_Revision: Fees are calculated for the application during architecture adjustment.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
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
         * <p>The message returned for verification.</p>
         */
        @NameInMap("Lifecycle")
        public String lifecycle;

        /**
         * <p>The verification results returned.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The error message that is returned when a price query fails.</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>ECS instance sold out</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The service code.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The verification result.</p>
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

    public static class GetApplicationResponseBodyDataPriceList extends TeaModel {
        /**
         * <p>The price unit.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The original price.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The ID of the resource group to which the application belongs.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Lifecycle")
        public String lifecycle;

        /**
         * <p>The service code.</p>
         */
        @NameInMap("OnePrice")
        public Float onePrice;

        /**
         * <p>The billing results.</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("Period")
        public Float period;

        /**
         * <p>The quantity.</p>
         */
        @NameInMap("Price")
        public Float price;

        /**
         * <p>The unit price.</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>USD/Hour</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>The total price.</p>
         */
        @NameInMap("Specification")
        public String specification;

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

        public GetApplicationResponseBodyDataPriceList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
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

        public GetApplicationResponseBodyDataPriceList setOnePrice(Float onePrice) {
            this.onePrice = onePrice;
            return this;
        }
        public Float getOnePrice() {
            return this.onePrice;
        }

        public GetApplicationResponseBodyDataPriceList setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public GetApplicationResponseBodyDataPriceList setPeriod(Float period) {
            this.period = period;
            return this;
        }
        public Float getPeriod() {
            return this.period;
        }

        public GetApplicationResponseBodyDataPriceList setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
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

    }

    public static class GetApplicationResponseBodyDataResourceList extends TeaModel {
        /**
         * <p>The service code.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The billing method.</p>
         */
        @NameInMap("Lifecycle")
        public String lifecycle;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the application.</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>The resource deployment result.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resources.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The resource tag.</p>
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
         * <p>The description of the application.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The resource tag.</p>
         */
        @NameInMap("Checklist")
        public java.util.List<GetApplicationResponseBodyDataChecklist> checklist;

        /**
         * <p>The URL of the application topology image.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The message returned for the request.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <p>The URL of the image in the database.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the template associated with the application.</p>
         */
        @NameInMap("PriceList")
        public java.util.List<GetApplicationResponseBodyDataPriceList> priceList;

        /**
         * <p>1411182597819805/topo-MCEXDI5EL2OM10NY.json</p>
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
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>CADT application</p>
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

        public GetApplicationResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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
