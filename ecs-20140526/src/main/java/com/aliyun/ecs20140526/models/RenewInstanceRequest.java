// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Renews the instance to a <a href="https://help.aliyun.com/document_detail/63396.html">unified expiration date</a>. Valid values: 1 to 28.</p>
     * <p>To use this parameter, you must <a href="~~63396#694cb636c0rp6~~">set a unified expiration date for ECS instances</a>. The value of this parameter must match the unified expiration date that you have set. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>You must specify either the renewal period parameters (Period and PeriodUnit) or the unified expiration date parameter (ExpectedRenewDay), but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExpectedRenewDay")
    public Integer expectedRenewDay;

    /**
     * <p>The instance ID of the instance that you want to renewal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The renewal period for the subscription instance. If you specify DedicatedHostId, the value of Period cannot exceed the remaining subscription period of the dedicated host. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Week, valid values of Period: 1, 2, 3, and 4.</li>
     * <li>If PeriodUnit is set to Month, valid values of Period: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month, valid values of Period: 1, 2, 3, 4, 5, 6, 7, 8, 9, and 12.</p>
     * <blockquote>
     * <p>You must specify either the renewal period parameters (Period and PeriodUnit) or the unified expiration date parameter (ExpectedRenewDay), but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal period. This parameter specifies the unit of Period. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week.</li>
     * <li>Month.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;Month.</p>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
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
