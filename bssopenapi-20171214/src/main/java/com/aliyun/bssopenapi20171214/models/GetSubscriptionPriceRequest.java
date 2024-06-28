// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceRequest extends TeaModel {
    /**
     * <p>The ID of the instance for which the price is queried. This parameter is required if you upgrade an instance. You can specify this parameter to obtain the pre-upgrade configurations of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-khkjhxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The information about the pricing module.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModuleList")
    public java.util.List<GetSubscriptionPriceRequestModuleList> moduleList;

    /**
     * <p>The type of the order. Valid values:</p>
     * <ul>
     * <li>NewOrder: purchases an instance of an Alibaba Cloud service.</li>
     * <li>Renewal: renews an instance of an Alibaba Cloud service.</li>
     * <li>Upgrade: upgrades an instance of an Alibaba Cloud service.</li>
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
     * <p>The code of the service. For more information about the service code, see <strong>Codes of Alibaba Cloud Services</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service. Specify the parameter based on the pricing document of the specific service.</p>
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
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The service duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServicePeriodQuantity")
    public Integer servicePeriodQuantity;

    /**
     * <p>The unit of the service duration. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("ServicePeriodUnit")
    public String servicePeriodUnit;

    /**
     * <p>The billing method. Set the value to Subscription.</p>
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
         * <p>The configurations of the Nth pricing module. Valid values of N: 1 to 50. Format: AA:aa,BB:bb. The values of AA and BB are the property IDs of the pricing module. The values of aa and bb are the property values of the pricing module.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageCode:version_1</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The identifier of the Nth pricing module.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageCode</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The status of the pricing module. This parameter is required only if the order type is Upgrade. Valid values:</p>
         * <ul>
         * <li>1: adds one or more instances.</li>
         * <li>2: modifies the configurations of an instance. In the upgrade scenario, if the configurations of the pricing module change, you must specify this value for the parameter.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModuleStatus")
        public Integer moduleStatus;

        /**
         * <p>The tag of the specified resource. This parameter is required only if you upgrade or modify the configurations of an Alibaba Cloud service. For example, if you want to modify the configurations of a disk, you can use a tag to identify the ID of the disk.</p>
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
