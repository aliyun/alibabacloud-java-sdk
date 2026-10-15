// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceRequest extends TeaModel {
    /**
     * <p>The ID of the instance for which you want to inquire about the price. This parameter is required in upgrade scenarios to obtain the configurations of the instance before the upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>i-khkjhxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of pricing modules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModuleList")
    public java.util.List<GetSubscriptionPriceRequestModuleList> moduleList;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>NewOrder: new purchase.</li>
     * <li>Renewal: renewal.</li>
     * <li>Upgrade: upgrade.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NewOrder</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type. Whether this parameter is required depends on the price inquiry documentation of the specific product.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The service period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServicePeriodQuantity")
    public Integer servicePeriodQuantity;

    /**
     * <p>The unit of the service period. Valid values:</p>
     * <ul>
     * <li>Year: years.</li>
     * <li>Month: months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("ServicePeriodUnit")
    public String servicePeriodUnit;

    /**
     * <p>The subscription type. Valid value: Subscription (subscription).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static GetSubscriptionPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceRequest self = new GetSubscriptionPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSubscriptionPriceRequest setModuleList(java.util.List<GetSubscriptionPriceRequestModuleList> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<GetSubscriptionPriceRequestModuleList> getModuleList() {
        return this.moduleList;
    }

    public GetSubscriptionPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
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

    public GetSubscriptionPriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetSubscriptionPriceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public GetSubscriptionPriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetSubscriptionPriceRequest setServicePeriodQuantity(Integer servicePeriodQuantity) {
        this.servicePeriodQuantity = servicePeriodQuantity;
        return this;
    }
    public Integer getServicePeriodQuantity() {
        return this.servicePeriodQuantity;
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

    public static class GetSubscriptionPriceRequestModuleList extends TeaModel {
        /**
         * <p>The configuration of the nth pricing module. Valid values of n: 1 to 50. Format: AA:aa,BB:bb. AA and BB are the identifiers of the pricing module attributes, and aa and bb are the attribute values of the pricing module attributes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageCode:version_1</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The identifier of the nth pricing module.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageCode</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The change status of the pricing module for this inquiry. This parameter is required only when the order type is Upgrade. Valid values:</p>
         * <ul>
         * <li>1: add.</li>
         * <li>2: modify. If the configuration of the pricing module changes in an upgrade scenario, you must explicitly specify this value.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModuleStatus")
        public Integer moduleStatus;

        /**
         * <p>The identifier of the specified resource. This parameter is required only for the upgrade and configuration change of specific products. For example, if you change the configuration of a cloud disk, you can use Tag to identify the ID of the specific cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>213213123</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static GetSubscriptionPriceRequestModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceRequestModuleList self = new GetSubscriptionPriceRequestModuleList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionPriceRequestModuleList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetSubscriptionPriceRequestModuleList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSubscriptionPriceRequestModuleList setModuleStatus(Integer moduleStatus) {
            this.moduleStatus = moduleStatus;
            return this;
        }
        public Integer getModuleStatus() {
            return this.moduleStatus;
        }

        public GetSubscriptionPriceRequestModuleList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
