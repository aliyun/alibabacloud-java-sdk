// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    @NameInMap("DedicatedHostRenewAttributes")
    public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostAutoRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAutoRenewResponseBody self = new DescribeDedicatedHostAutoRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAutoRenewResponseBody setDedicatedHostRenewAttributes(DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes dedicatedHostRenewAttributes) {
        this.dedicatedHostRenewAttributes = dedicatedHostRenewAttributes;
        return this;
    }
    public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes getDedicatedHostRenewAttributes() {
        return this.dedicatedHostRenewAttributes;
    }

    public DescribeDedicatedHostAutoRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute extends TeaModel {
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        @NameInMap("AutoRenewWithEcs")
        public String autoRenewWithEcs;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("RenewalStatus")
        public String renewalStatus;

        public static DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute self = new DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute setAutoRenewWithEcs(String autoRenewWithEcs) {
            this.autoRenewWithEcs = autoRenewWithEcs;
            return this;
        }
        public String getAutoRenewWithEcs() {
            return this.autoRenewWithEcs;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

    }

    public static class DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes extends TeaModel {
        @NameInMap("DedicatedHostRenewAttribute")
        public java.util.List<DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute> dedicatedHostRenewAttribute;

        public static DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes self = new DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes setDedicatedHostRenewAttribute(java.util.List<DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute> dedicatedHostRenewAttribute) {
            this.dedicatedHostRenewAttribute = dedicatedHostRenewAttribute;
            return this;
        }
        public java.util.List<DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributesDedicatedHostRenewAttribute> getDedicatedHostRenewAttribute() {
            return this.dedicatedHostRenewAttribute;
        }

    }

}
