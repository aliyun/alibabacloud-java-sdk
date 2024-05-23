// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    /**
     * <p>The array that consists of dedicated host auto-renewal attributes.</p>
     */
    @NameInMap("DedicatedHostRenewAttributes")
    public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        /**
         * <p>Indicates whether the dedicated host is automatically renewed if a subscription ECS instance it hosts, after being automatically renewed, has a new expiration time that is later than that of the dedicated host. Valid values:</p>
         * <br>
         * <p>*   AutoRenewWithEcs: The dedicated host is automatically renewed along with the ECS instance.</p>
         * <p>*   StopRenewWithEcs: The dedicated host is not automatically renewed along with the ECS instance.</p>
         */
        @NameInMap("AutoRenewWithEcs")
        public String autoRenewWithEcs;

        /**
         * <p>The ID of the dedicated host.</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The auto-renewal period.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The unit of the auto-renewal duration. Valid values:</p>
         * <br>
         * <p>*   Week</p>
         * <p>*   Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>Indicates whether the subscription dedicated host is automatically renewed. Valid values:</p>
         * <br>
         * <p>*   AutoRenewal: The dedicated host is automatically renewed.</p>
         * <p>*   Normal: The dedicated host is not automatically renewed, but renewal notifications are sent.</p>
         * <p>*   NotRenewal: The dedicated host is not automatically renewed, and no expiration notification is sent. Alibaba Cloud sends only a non-renewal notice three days before the host expires. If the renewal status of a dedicated host is NotRenewal, you can change the value to Normal and then call [RenewDedicatedHosts](~~93287~~) to manually renew the dedicated host, or directly change the value to AutoRenewal.</p>
         */
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
