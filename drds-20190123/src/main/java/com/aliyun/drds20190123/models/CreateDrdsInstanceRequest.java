// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("InstanceSeries")
    public String instanceSeries;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("isHa")
    public Boolean isHa;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    @NameInMap("MasterInstId")
    public String masterInstId;

    @NameInMap("MySQLVersion")
    public Integer mySQLVersion;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateDrdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsInstanceRequest self = new CreateDrdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDrdsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDrdsInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDrdsInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDrdsInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateDrdsInstanceRequest setInstanceSeries(String instanceSeries) {
        this.instanceSeries = instanceSeries;
        return this;
    }
    public String getInstanceSeries() {
        return this.instanceSeries;
    }

    public CreateDrdsInstanceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreateDrdsInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDrdsInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDrdsInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDrdsInstanceRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateDrdsInstanceRequest setIsHa(Boolean isHa) {
        this.isHa = isHa;
        return this;
    }
    public Boolean getIsHa() {
        return this.isHa;
    }

    public CreateDrdsInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateDrdsInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateDrdsInstanceRequest setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public CreateDrdsInstanceRequest setMasterInstId(String masterInstId) {
        this.masterInstId = masterInstId;
        return this;
    }
    public String getMasterInstId() {
        return this.masterInstId;
    }

    public CreateDrdsInstanceRequest setMySQLVersion(Integer mySQLVersion) {
        this.mySQLVersion = mySQLVersion;
        return this;
    }
    public Integer getMySQLVersion() {
        return this.mySQLVersion;
    }

    public CreateDrdsInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
