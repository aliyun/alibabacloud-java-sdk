// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    // Details about the auto-renewal attributes of the dedicated hosts.
    @NameInMap("DedicatedHostRenewAttributes")
    public DescribeDedicatedHostAutoRenewResponseBodyDedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    // The ID of the request.
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
        // Indicates whether the subscription dedicated host is automatically renewed. Valid values:
        // 
        // *   true: The dedicated host is automatically renewed.
        // *   false: The dedicated host is not automatically renewed.
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        // Indicates whether the subscription dedicated host is automatically renewed along with the subscription Elastic Compute Service (ECS) instances hosted on it if the new expiration time of the renewed instances is later than the expiration time of the dedicated host. Valid values:
        // 
        // *   AutoRenewWithEcs: The subscription dedicated host is automatically renewed along with the subscription ECS instances hosted on it.
        // *   StopRenewWithEcs: The subscription dedicated host is not automatically renewed along with the subscription ECS instances hosted on it.
        @NameInMap("AutoRenewWithEcs")
        public String autoRenewWithEcs;

        // The ID of the dedicated host.
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        // The auto-renewal period.
        @NameInMap("Duration")
        public Integer duration;

        // The unit of the auto-renewal period. Valid values:
        // 
        // *   Week
        // *   Month
        @NameInMap("PeriodUnit")
        public String periodUnit;

        // Indicates whether the subscription dedicated host is automatically renewed. Valid values:
        // 
        // *   AutoRenewal: The dedicated host is automatically renewed.
        // *   Normal: The dedicated host is not automatically renewed, and you will receive notifications for renewal.
        // *   NotRenewal: The dedicated host is not renewed, and no expiration notification is sent. Notifications for renewal are automatically sent three days before the dedicated host expires. You can change the value of this parameter from NotRenewal to Normal for the dedicated host and manually renew it by calling the [RenewDedicatedHosts](~~93287~~) operation. Alternatively, you can set this parameter to AutoRenewal to configure the dedicated host to be automatically renewed.
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
