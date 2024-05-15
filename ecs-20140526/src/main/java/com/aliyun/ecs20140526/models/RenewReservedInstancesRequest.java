// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewReservedInstancesRequest extends TeaModel {
    /**
     * <p>The auto-renewal duration. Unit: months. This parameter takes effect only when AutoRenew is set to true.</p>
     * <br>
     * <p>Valid values: 12 and 36. Default value: 12.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>Specifies whether to enable auto-renewal for the reserved instance. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The unit of the validity period of the reserved instance.</p>
     * <br>
     * <p>Set the value to Year.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The validity period of the reserved instance.</p>
     * <br>
     * <p>Valid values: 1 and 3.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the reserved instance. You can call the [DescribeReservedInstances](https://help.aliyun.com/document_detail/100065.html) operation to query the IDs of reserved instances that you purchased.</p>
     * <br>
     * <p>You can specify up to 10 IDs of reserved instances in a single request.</p>
     */
    @NameInMap("ReservedInstanceId")
    public java.util.List<String> reservedInstanceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RenewReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewReservedInstancesRequest self = new RenewReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RenewReservedInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewReservedInstancesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public RenewReservedInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewReservedInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RenewReservedInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewReservedInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewReservedInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewReservedInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RenewReservedInstancesRequest setReservedInstanceId(java.util.List<String> reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }
    public java.util.List<String> getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public RenewReservedInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenewReservedInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
