// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetApplicationResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Lifecycle")
        public String lifecycle;

        @NameInMap("Region")
        public String region;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceCode")
        public String resourceCode;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Result")
        public String result;

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
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Count")
        public Long count;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Lifecycle")
        public String lifecycle;

        @NameInMap("OnePrice")
        public Float onePrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Period")
        public Float period;

        @NameInMap("Price")
        public Float price;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("Region")
        public String region;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceCode")
        public String resourceCode;

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
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Lifecycle")
        public String lifecycle;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceCode")
        public String resourceCode;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

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
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("Checklist")
        public java.util.List<GetApplicationResponseBodyDataChecklist> checklist;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Error")
        public String error;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Name")
        public String name;

        @NameInMap("PriceList")
        public java.util.List<GetApplicationResponseBodyDataPriceList> priceList;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceList")
        public java.util.List<GetApplicationResponseBodyDataResourceList> resourceList;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TopoURL")
        public String topoURL;

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

        public GetApplicationResponseBodyData setTopoURL(String topoURL) {
            this.topoURL = topoURL;
            return this;
        }
        public String getTopoURL() {
            return this.topoURL;
        }

    }

}
