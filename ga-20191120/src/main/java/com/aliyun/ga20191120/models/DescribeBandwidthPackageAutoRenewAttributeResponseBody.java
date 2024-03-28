// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: month. Valid values: **1** to **12**.</p>
     * <br>
     * <p>>  This parameter is returned only if the value of **AutoRenew** is **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The ID of the bandwidth plan.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The auto-renewal status of the bandwidth plan.</p>
     * <br>
     * <p>*   **AutoRenewal**: The bandwidth plan is automatically renewed.</p>
     * <p>*   **Normal**: You must manually renew the bandwidth plan.</p>
     * <p>*   **NotRenewal**: The bandwidth plan is not renewed after it expires. The system sends a non-renewal reminder three days before the expiration date but no longer sends reminders to renew the bandwidth plan. You can change the auto-renewal status of a bandwidth plan from NotRenewal to **Normal** or **AutoRenewal**.</p>
     * <br>
     * <p>>  **RenewalStatus** takes precedence over **AutoRenew**. If you do not specify **RenewalStatus**, **AutoRenew** is automatically used.</p>
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
