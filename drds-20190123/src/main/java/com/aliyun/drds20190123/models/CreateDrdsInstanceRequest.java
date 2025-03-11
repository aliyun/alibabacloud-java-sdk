// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceRequest extends TeaModel {
    /**
     * <p>Specifies the client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c1dd299c-10c6-11ea-bbbb-************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies the description of the instance. The description must meet the following requirements:</p>
     * <ul>
     * <li>The description cannot contain the prefix http:// or https://.</li>
     * <li>The description must start with a letter or a Chinese character, and can contain uppercase and lowercase letters, Chinese characters, digits, underscores (_), and hyphens (-).</li>
     * <li>The description must be 2 to 256 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies the purchase duration of the subscription instance.</p>
     * <ul>
     * <li>If the PricingCycle parameter is set to year, the value range of the Duration parameter is 1 to 3.</li>
     * <li>If the PricingCycle parameter is set to month, the value range of the Duration parameter is 1 to 9.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter only takes effect when the PayType parameter is set to drdsPre.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Specifies the instance type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>drds.sn2.4c16g</strong>: The instance is of the Starter Edition.</li>
     * <li><strong>drds.sn2.8c32g</strong>: The instance is of the Standard Edition</li>
     * <li><strong>drds.sn2.16c64g</strong>: The instance is of the Enterprise Edition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds.sn2.4c16g</p>
     */
    @NameInMap("InstanceSeries")
    public String instanceSeries;

    /**
     * <p>Specifies whether to enable automatic renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: If the PricingCycle parameter is set to month, the subscription is automatically renewed for one month. If the PricingCycle parameter is set to year, the subscription is automatically renewed for one year.</li>
     * <li><strong>false</strong>: The auto-renewal feature is disabled for the instance.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter only takes effect when the PayType parameter is set to drdsPre.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <p>Specifies the ID of the primary instance. This parameter is only required when you create a read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>drds***********</p>
     */
    @NameInMap("MasterInstId")
    public String masterInstId;

    /**
     * <p>Specifies the MySQL version that is supported by the instance. Valid values:</p>
     * <ul>
     * <li><strong>5</strong>: The instance is fully compatible with MySQL 5.x. This value is the default value.</li>
     * <li><strong>8</strong>: The instance is fully compatible with MySQL 8.0.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter only takes effect when you create a primary instance. By default, the MySQL version of the read-only instance is the same as that of the primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MySQLVersion")
    public Integer mySQLVersion;

    /**
     * <p>Specifies the billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>drdsPre</strong>: The instance uses the subscription billing method.</li>
     * <li><strong>drdsPost</strong>: The instance uses the pay-as-you-go billing method.</li>
     * <li><strong>drdsRo</strong>: By default, the pay-as-you-go billing method is used when you create read-only instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drdsPost</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Specifies the unit of the subscription duration of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>year</strong>: The unit of the subscription duration is year.</li>
     * <li><strong>month</strong>: The unit of the subscription duration is month.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you set the PayType parameter to drdsPre.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Specifies the number of instances to be created. You can set the value only to 1. The value specifies that you can create one instance each time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>Specifies the region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies the ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies the specification code of the instance. The value consists of the instance type and the specified instance specification. For example, you can set the value to drds.sn2.4c16g.8c32g.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds.sn2.4c16g.8C32g</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>Specifies the type of the instance. Set the value to PRIVATE. The value PRIVATE specifies that the instance is a dedicated instance.</p>
     * <blockquote>
     * <p> You can also set the value to 1 to specify that the instance is a dedicated instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies the ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies the ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VswitchId")
    public String vswitchId;

    /**
     * <p>Specifies the zone ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>Specifies whether the instance is a high-availability instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
