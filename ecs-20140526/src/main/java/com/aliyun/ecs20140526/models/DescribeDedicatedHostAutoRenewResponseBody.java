// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DedicatedHostRenewAttributes")
    public java.util.List<DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes> dedicatedHostRenewAttributes;

    public static DescribeDedicatedHostAutoRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAutoRenewResponseBody self = new DescribeDedicatedHostAutoRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAutoRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostAutoRenewResponseBody setDedicatedHostRenewAttributes(java.util.List<DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes> dedicatedHostRenewAttributes) {
        this.dedicatedHostRenewAttributes = dedicatedHostRenewAttributes;
        return this;
    }
    public java.util.List<DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes> getDedicatedHostRenewAttributes() {
        return this.dedicatedHostRenewAttributes;
    }

    public static class DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes extends TeaModel {
        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("RenewalStatus")
        public String renewalStatus;

        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        public static DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes self = new DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

    }

}
