// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetApplicationResponseBodyData data;

    // 请求失败原因
    @NameInMap("Message")
    public String message;

    // 请求ID
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
        // 资源标记
        @NameInMap("Lifecycle")
        public String lifecycle;

        // 区域
        @NameInMap("Region")
        public String region;

        // 失败原因
        @NameInMap("Remark")
        public String remark;

        // 产品code
        @NameInMap("ResourceCode")
        public String resourceCode;

        // 实例名
        @NameInMap("ResourceName")
        public String resourceName;

        // 校验结果
        @NameInMap("Result")
        public String result;

        // 规格
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
        // 支付类型
        @NameInMap("ChargeType")
        public String chargeType;

        // 数量
        @NameInMap("Count")
        public Long count;

        // 实例名
        @NameInMap("InstanceName")
        public String instanceName;

        // 资源标记
        @NameInMap("Lifecycle")
        public String lifecycle;

        // 单价
        @NameInMap("OnePrice")
        public Float onePrice;

        // 原价
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        // 时长
        @NameInMap("Period")
        public Float period;

        // 总价
        @NameInMap("Price")
        public Float price;

        // 单位
        @NameInMap("PriceUnit")
        public String priceUnit;

        // 区域
        @NameInMap("Region")
        public String region;

        // 产品code
        @NameInMap("ResourceCode")
        public String resourceCode;

        // 规格
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
        // 支付类型
        @NameInMap("ChargeType")
        public String chargeType;

        // 资源标记
        @NameInMap("Lifecycle")
        public String lifecycle;

        // 部署结果
        @NameInMap("Remark")
        public String remark;

        // 产品code
        @NameInMap("ResourceCode")
        public String resourceCode;

        // 实例ID
        @NameInMap("ResourceId")
        public String resourceId;

        // 实例名称
        @NameInMap("ResourceName")
        public String resourceName;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 资源部署结果
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
        // 应用ID
        @NameInMap("ApplicationId")
        public String applicationId;

        // 校验结果列表
        @NameInMap("Checklist")
        public java.util.List<GetApplicationResponseBodyDataChecklist> checklist;

        // 应用创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 应用描述
        @NameInMap("Description")
        public String description;

        // 失败原因
        @NameInMap("Error")
        public String error;

        // 数据库中图片地址
        @NameInMap("ImageURL")
        public String imageURL;

        // 应用名
        @NameInMap("Name")
        public String name;

        // 计费结果列表
        @NameInMap("PriceList")
        public java.util.List<GetApplicationResponseBodyDataPriceList> priceList;

        // 应用所属资源组ID
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // 资源列表
        @NameInMap("ResourceList")
        public java.util.List<GetApplicationResponseBodyDataResourceList> resourceList;

        // 应用状态
        @NameInMap("Status")
        public String status;

        // 应用关联模板ID
        @NameInMap("TemplateId")
        public String templateId;

        // 应用topo地址
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
