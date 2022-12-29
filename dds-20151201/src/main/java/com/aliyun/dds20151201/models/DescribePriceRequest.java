// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    // The business information. This is an additional parameter.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The code of the cluster. Valid values:
    // 
    // *   dds: a replica set instance that uses the pay-as-you-go billing method
    // *   badds: a replica set instance that uses the subscription billing method
    // *   dds_sharding: a sharded cluster instance that uses the pay-as-you-go billing method
    // *   badds_sharding: a sharded cluster instance that uses the subscription billing method
    // *   badds_sharding_intl: a sharded cluster instance that uses the subscription billing method and is available on the International site (alibabacloud.com)
    // *   badds_sharding_jp: a sharded cluster instance that uses the subscription billing method and is available on the Japan site (jp.alibabacloud.com)
    @NameInMap("CommodityCode")
    public String commodityCode;

    // The coupon code. Default value: **youhuiquan_promotion_option_id_for_blank**.
    @NameInMap("CouponNo")
    public String couponNo;

    // A JSON string that contains the details of the ApsaraDB for MongoDB instance. For more information, see Details of the [DBInstances](~~197291~~) parameter in the DescribePrice operation.
    @NameInMap("DBInstances")
    public String DBInstances;

    // Specifies whether to return the parameters about the order. Valid values:
    // 
    // *   false
    // *   true
    // 
    // Default value: **false**.
    @NameInMap("OrderParamOut")
    public String orderParamOut;

    // The type of the order. Valid values:
    // 
    // *   BUY: instance creation
    // *   UPGRADE: instance configuration change
    // *   RENEW: instance renewal
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The code of the service to which the instance belongs. Default value: **dds**.
    @NameInMap("ProductCode")
    public String productCode;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group. For more information, see [View basic information of a resource group](~~151181~~).
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public DescribePriceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribePriceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public DescribePriceRequest setDBInstances(String DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public String getDBInstances() {
        return this.DBInstances;
    }

    public DescribePriceRequest setOrderParamOut(String orderParamOut) {
        this.orderParamOut = orderParamOut;
        return this;
    }
    public String getOrderParamOut() {
        return this.orderParamOut;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePriceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePriceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
