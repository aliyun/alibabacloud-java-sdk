// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("Commodity")
    public String commodity;

    @NameInMap("DefaultVpc")
    public String defaultVpc;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("NeedSpotPrice")
    public Boolean needSpotPrice;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Verbose")
    public Boolean verbose;

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

    public DescribePriceRequest setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public DescribePriceRequest setDefaultVpc(String defaultVpc) {
        this.defaultVpc = defaultVpc;
        return this;
    }
    public String getDefaultVpc() {
        return this.defaultVpc;
    }

    public DescribePriceRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public DescribePriceRequest setNeedSpotPrice(Boolean needSpotPrice) {
        this.needSpotPrice = needSpotPrice;
        return this;
    }
    public Boolean getNeedSpotPrice() {
        return this.needSpotPrice;
    }

    public DescribePriceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
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

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribePriceRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
