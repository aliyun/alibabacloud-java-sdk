// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

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
