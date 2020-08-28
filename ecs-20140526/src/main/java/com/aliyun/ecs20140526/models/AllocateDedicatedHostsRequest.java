// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<AllocateDedicatedHostsRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    @NameInMap("DedicatedHostType")
    @Validation(required = true)
    public String dedicatedHostType;

    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    @NameInMap("NetworkAttributes")
    @Validation(required = true)
    public AllocateDedicatedHostsRequestNetworkAttributes networkAttributes;

    @NameInMap("Description")
    public String description;

    @NameInMap("AutoPlacement")
    public String autoPlacement;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Quantity")
    public Integer quantity;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocateDedicatedHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateDedicatedHostsRequest self = new AllocateDedicatedHostsRequest();
        return TeaModel.build(map, self);
    }

    public static class AllocateDedicatedHostsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static AllocateDedicatedHostsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AllocateDedicatedHostsRequestTag self = new AllocateDedicatedHostsRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class AllocateDedicatedHostsRequestNetworkAttributes extends TeaModel {
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static AllocateDedicatedHostsRequestNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            AllocateDedicatedHostsRequestNetworkAttributes self = new AllocateDedicatedHostsRequestNetworkAttributes();
            return TeaModel.build(map, self);
        }

    }

}
