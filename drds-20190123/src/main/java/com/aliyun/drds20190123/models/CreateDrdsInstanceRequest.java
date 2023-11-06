// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceRequest extends TeaModel {
    /**
     * <p>Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies the description of the instance. The description must meet the following requirements:</p>
     * <br>
     * <p>*   The description cannot contain the prefix http:// or https://.</p>
     * <p>*   The description must start with a letter or a Chinese character, and can contain uppercase and lowercase letters, Chinese characters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The description must be 2 to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies the purchase duration of the subscription instance.</p>
     * <br>
     * <p>*   If the PricingCycle parameter is set to year, the value range of the Duration parameter is 1 to 3.</p>
     * <p>*   If the PricingCycle parameter is set to month, the value range of the Duration parameter is 1 to 9.</p>
     * <br>
     * <p>>  This parameter only takes effect when the PayType parameter is set to drdsPre.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies the instance type of the instance. Valid values:</p>
     * <br>
     * <p>*   **drds.sn2.4c16g**: The instance is of the Starter Edition.</p>
     * <p>*   **drds.sn2.8c32g**: The instance is of the Standard Edition</p>
     * <p>*   **drds.sn2.16c64g**: The instance is of the Enterprise Edition.</p>
     */
    @NameInMap("InstanceSeries")
    public String instanceSeries;

    /**
     * <p>Specifies whether to enable automatic renewal. Valid values:</p>
     * <br>
     * <p>*   **true**: If the PricingCycle parameter is set to month, the subscription is automatically renewed for one month. If the PricingCycle parameter is set to year, the subscription is automatically renewed for one year.</p>
     * <p>*   **false**: The auto-renewal feature is disabled for the instance.</p>
     * <br>
     * <p>>  This parameter only takes effect when the PayType parameter is set to drdsPre.</p>
     */
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <p>Specifies the ID of the primary instance. This parameter is only required when you create a read-only instance.</p>
     */
    @NameInMap("MasterInstId")
    public String masterInstId;

    /**
     * <p>Specifies the MySQL version that is supported by the instance. Valid values:</p>
     * <br>
     * <p>*   **5**: The instance is fully compatible with MySQL 5.x. This value is the default value.</p>
     * <p>*   **8**: The instance is fully compatible with MySQL 8.0.</p>
     * <br>
     * <p>>  This parameter only takes effect when you create a primary instance. By default, the MySQL version of the read-only instance is the same as that of the primary instance.</p>
     */
    @NameInMap("MySQLVersion")
    public Integer mySQLVersion;

    /**
     * <p>Specifies the billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **drdsPre**: The instance uses the subscription billing method.</p>
     * <p>*   **drdsPost**: The instance uses the pay-as-you-go billing method.</p>
     * <p>*   **drdsRo**: By default, the pay-as-you-go billing method is used when you create read-only instances.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Specifies the unit of the subscription duration of the subscription instance. Valid values:</p>
     * <br>
     * <p>*   **year**: The unit of the subscription duration is year.</p>
     * <p>*   **month**: The unit of the subscription duration is month.</p>
     * <br>
     * <p>>  This parameter is required if you set the PayType parameter to drdsPre.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Specifies the number of instances to be created. You can set the value only to 1. The value specifies that you can create one instance each time.</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>Specifies the region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies the ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies the specification code of the instance. The value consists of the instance type and the specified instance specification. For example, you can set the value to drds.sn2.4c16g.8c32g.</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>Specifies the type of the instance. Set the value to PRIVATE. The value PRIVATE specifies that the instance is a dedicated instance.</p>
     * <br>
     * <p>>  You can also set the value to 1 to specify that the instance is a dedicated instance.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies the ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies the ID of the vSwitch.</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>Specifies the zone ID of the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>Specifies whether the instance is a high-availability instance.</p>
     */
    @NameInMap("isHa")
    public Boolean isHa;

    public static CreateDrdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsInstanceRequest self = new CreateDrdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDrdsInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDrdsInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateDrdsInstanceRequest setInstanceSeries(String instanceSeries) {
        this.instanceSeries = instanceSeries;
        return this;
    }
    public String getInstanceSeries() {
        return this.instanceSeries;
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

    public CreateDrdsInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDrdsInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateDrdsInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateDrdsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDrdsInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDrdsInstanceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreateDrdsInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
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

    public CreateDrdsInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateDrdsInstanceRequest setIsHa(Boolean isHa) {
        this.isHa = isHa;
        return this;
    }
    public Boolean getIsHa() {
        return this.isHa;
    }

}
