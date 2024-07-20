// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: month. Valid values: <strong>1</strong> to <strong>12</strong>.</p>
     * <blockquote>
     * <p> This parameter is returned only if the value of <strong>AutoRenew</strong> is <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The ID of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1iquvlp8khla5emb3ia</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The auto-renewal status of the bandwidth plan.</p>
     * <ul>
     * <li><strong>AutoRenewal</strong>: The bandwidth plan is automatically renewed.</li>
     * <li><strong>Normal</strong>: You must manually renew the bandwidth plan.</li>
     * <li><strong>NotRenewal</strong>: The bandwidth plan is not renewed after it expires. The system sends a non-renewal reminder three days before the expiration date but no longer sends reminders to renew the bandwidth plan. You can change the auto-renewal status of a bandwidth plan from NotRenewal to <strong>Normal</strong> or <strong>AutoRenewal</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> <strong>RenewalStatus</strong> takes precedence over <strong>AutoRenew</strong>. If you do not specify <strong>RenewalStatus</strong>, <strong>AutoRenew</strong> is automatically used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B820E9F9-D459-5AE7-8F08-A368B53C1AC3</p>
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
