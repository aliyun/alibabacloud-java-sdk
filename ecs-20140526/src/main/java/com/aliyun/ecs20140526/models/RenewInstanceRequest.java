// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The synchronized expiration date. Set the value to a synchronized expiration date that you specified. Otherwise, the call fails. If you configure this parameter, your instance will be renewed to the specified synchronized expiration date. Valid values: 1 to 28.</p>
     * <br>
     * <p>For information about how to synchronize the expiration dates of instances, see [Synchronize the expiration dates of subscription instances](https://help.aliyun.com/document_detail/108486.html).</p>
     * <br>
     * <p>> The renewal period-related parameter pair (`Period` and `PeriodUnit`) and `ExpectedRenewDay` are mutually exclusive.</p>
     */
    @NameInMap("ExpectedRenewDay")
    public Integer expectedRenewDay;

    /**
     * <p>The ID of the instance that you want to renew.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The renewal period of the subscription instance. If `DedicatedHostId` is specified, the value of Period cannot exceed the subscription period of the specified dedicated host.</p>
     * <br>
     * <p>Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, and 12.</p>
     * <br>
     * <p>> The renewal period-related parameter pair (`Period` and `PeriodUnit`) and `ExpectedRenewDay` are mutually exclusive.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal period. Valid values:</p>
     * <br>
     * <p>Month</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewInstanceRequest setExpectedRenewDay(Integer expectedRenewDay) {
        this.expectedRenewDay = expectedRenewDay;
        return this;
    }
    public Integer getExpectedRenewDay() {
        return this.expectedRenewDay;
    }

    public RenewInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RenewInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenewInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
