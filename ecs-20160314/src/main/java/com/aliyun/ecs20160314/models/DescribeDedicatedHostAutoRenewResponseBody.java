// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponseBody extends TeaModel {
    @NameInMap("InstanceRenewAttributes")
    public InstanceRenewAttributes instanceRenewAttributes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostAutoRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAutoRenewResponseBody self = new DescribeDedicatedHostAutoRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAutoRenewResponseBody setInstanceRenewAttributes(InstanceRenewAttributes instanceRenewAttributes) {
        this.instanceRenewAttributes = instanceRenewAttributes;
        return this;
    }
    public InstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    public DescribeDedicatedHostAutoRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstanceRenewAttribute extends TeaModel {
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("RenewalStatus")
        public String renewalStatus;

        public static InstanceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            InstanceRenewAttribute self = new InstanceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public InstanceRenewAttribute setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public InstanceRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public InstanceRenewAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstanceRenewAttribute setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public InstanceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

    }

    public static class InstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        public java.util.List<InstanceRenewAttribute> instanceRenewAttribute;

        public static InstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            InstanceRenewAttributes self = new InstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public InstanceRenewAttributes setInstanceRenewAttribute(java.util.List<InstanceRenewAttribute> instanceRenewAttribute) {
            this.instanceRenewAttribute = instanceRenewAttribute;
            return this;
        }
        public java.util.List<InstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

    }

}
