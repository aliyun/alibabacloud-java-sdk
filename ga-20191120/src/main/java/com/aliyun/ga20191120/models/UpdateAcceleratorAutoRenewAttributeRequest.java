// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Specifies whether to enable auto-renewal for the GA instance. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal for the GA instance.</p>
     * <p>*   **false**: does not enable auto-renewal for the GA instance.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Unit: months.</p>
     * <br>
     * <p>Valid values: **1** to **12**.</p>
     * <br>
     * <p>>  This parameter is required only if **AutoRenew** is set to **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a token, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the GA instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies how to renew the GA instance. Valid values:</p>
     * <br>
     * <p>*   **AutoRenewal**: The GA instance is automatically renewed.</p>
     * <p>*   **Normal**: You must manually renew the GA instance.</p>
     * <p>*   **NotRenewal**: Choose this option if you do not want to renew the GA instance after the instance expires. The system sends only a non-renewal reminder three days before the expiration date. The system no longer sends notifications to remind you to renew the GA instance. You can change the value of this parameter from NotRenewal to **Normal** for a GA instance, and then manually renew the instance. You can also set the RenewalStatus parameter to **AutoRenewal**.</p>
     * <br>
     * <p>>  **RenewalStatus** takes precedence over **AutoRenew**. If you do not specify **RenewalStatus**, the **AutoRenew** parameter is used by default.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    public static UpdateAcceleratorAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorAutoRenewAttributeRequest self = new UpdateAcceleratorAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAcceleratorAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

}
