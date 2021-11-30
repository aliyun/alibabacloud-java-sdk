// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAcceleratorAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorAutoRenewAttributeResponseBody self = new DescribeAcceleratorAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorAutoRenewAttributeResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeAcceleratorAutoRenewAttributeResponseBody setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeAcceleratorAutoRenewAttributeResponseBody setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public DescribeAcceleratorAutoRenewAttributeResponseBody setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public DescribeAcceleratorAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
