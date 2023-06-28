// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: enabled</p>
     * <p>*   **false** (default): disabled</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Unit: months. Valid values: **1** to **12**.</p>
     * <br>
     * <p>> : This parameter takes effect only if **AutoRenew** is set to **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The ID of the bandwidth plan.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The auto-renewal status of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **AutoRenewal**: The bandwidth plan is automatically renewed.</p>
     * <p>*   **Normal**: You must manually renew the bandwidth plan.</p>
     * <p>*   **NotRenewal**: Choose this option if you do not want to renew the bandwidth plan after it expires. The system sends only a non-renewal reminder three days before the expiration date. The system no longer sends notifications to remind you to renew the bandwidth plan. You can change the value of this parameter from NotRenewal to Normal for a bandwidth plan, and then manually renew the bandwidth plan. You can also set the RenewalStatus parameter to **AutoRenewal**.</p>
     * <br>
     * <p>> The **RenewalStatus** parameter takes precedence over the **AutoRenew** parameter. If you do not set **RenewalStatus**, the **AutoRenew** parameter is used by default.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBandwidthPackageAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageAutoRenewAttributeResponseBody self = new DescribeBandwidthPackageAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponseBody setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponseBody setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public DescribeBandwidthPackageAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
