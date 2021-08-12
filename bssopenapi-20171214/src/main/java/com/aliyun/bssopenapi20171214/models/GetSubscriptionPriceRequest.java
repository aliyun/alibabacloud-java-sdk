// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceRequest extends TeaModel {
    @NameInMap("ServicePeriodUnit")
    public String servicePeriodUnit;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("ServicePeriodQuantity")
    public Integer servicePeriodQuantity;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("Region")
    public String region;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("ModuleList")
    public java.util.List<GetSubscriptionPriceRequestModuleList> moduleList;

    public static GetSubscriptionPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceRequest self = new GetSubscriptionPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionPriceRequest setServicePeriodUnit(String servicePeriodUnit) {
        this.servicePeriodUnit = servicePeriodUnit;
        return this;
    }
    public String getServicePeriodUnit() {
        return this.servicePeriodUnit;
    }

    public GetSubscriptionPriceRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public GetSubscriptionPriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSubscriptionPriceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetSubscriptionPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetSubscriptionPriceRequest setServicePeriodQuantity(Integer servicePeriodQuantity) {
        this.servicePeriodQuantity = servicePeriodQuantity;
        return this;
    }
    public Integer getServicePeriodQuantity() {
        return this.servicePeriodQuantity;
    }

    public GetSubscriptionPriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetSubscriptionPriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetSubscriptionPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSubscriptionPriceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public GetSubscriptionPriceRequest setModuleList(java.util.List<GetSubscriptionPriceRequestModuleList> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<GetSubscriptionPriceRequestModuleList> getModuleList() {
        return this.moduleList;
    }

    public static class GetSubscriptionPriceRequestModuleList extends TeaModel {
        @NameInMap("ModuleStatus")
        public Integer moduleStatus;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Config")
        public String config;

        public static GetSubscriptionPriceRequestModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceRequestModuleList self = new GetSubscriptionPriceRequestModuleList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceRequestModuleList setModuleStatus(Integer moduleStatus) {
            this.moduleStatus = moduleStatus;
            return this;
        }
        public Integer getModuleStatus() {
            return this.moduleStatus;
        }

        public GetSubscriptionPriceRequestModuleList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSubscriptionPriceRequestModuleList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetSubscriptionPriceRequestModuleList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
