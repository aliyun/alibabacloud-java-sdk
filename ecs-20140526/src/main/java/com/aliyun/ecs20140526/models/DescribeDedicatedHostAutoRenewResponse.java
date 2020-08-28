// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAutoRenewResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostRenewAttributes")
    @Validation(required = true)
    public DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributes dedicatedHostRenewAttributes;

    public static DescribeDedicatedHostAutoRenewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAutoRenewResponse self = new DescribeDedicatedHostAutoRenewResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributesDedicatedHostRenewAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("AutoRenewEnabled")
        @Validation(required = true)
        public Boolean autoRenewEnabled;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("PeriodUnit")
        @Validation(required = true)
        public String periodUnit;

        @NameInMap("RenewalStatus")
        @Validation(required = true)
        public String renewalStatus;

        public static DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributesDedicatedHostRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributesDedicatedHostRenewAttribute self = new DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributesDedicatedHostRenewAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributes extends TeaModel {
        @NameInMap("DedicatedHostRenewAttribute")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributesDedicatedHostRenewAttribute> dedicatedHostRenewAttribute;

        public static DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributes self = new DescribeDedicatedHostAutoRenewResponseDedicatedHostRenewAttributes();
            return TeaModel.build(map, self);
        }

    }

}
