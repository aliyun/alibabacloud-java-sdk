// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackagaAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false** disables auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Unit: months. Valid values: **1** to **12**.</p>
     * <br>
     * <p>>  This parameter is required only if **AutoRenew** is set to **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the bandwidth plan.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the bandwidth plan.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The auto-renewal status of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **AutoRenewal**: The system automatically renews the bandwidth plan.</p>
     * <p>*   **Normal**: You must manually renew the bandwidth plan.</p>
     * <p>*   **NotRenewal**: Choose this option if you do not want to renew the bandwidth plan after it expires. The system sends only a non-renewal reminder three days before the expiration date. The system no longer sends notifications to remind you to renew the bandwidth plan. You can change the value of this parameter from NotRenewal to Normal for a bandwidth plan, and then manually renew the bandwidth plan. You can also set the RenewalStatus parameter to **AutoRenewal**.</p>
     * <br>
     * <p>>  **RenewalStatus** takes precedence over **AutoRenew**. If you do not specify **RenewalStatus**, the **AutoRenew** parameter is used by default.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    public static UpdateBandwidthPackagaAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackagaAutoRenewAttributeRequest self = new UpdateBandwidthPackagaAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBandwidthPackagaAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

}
