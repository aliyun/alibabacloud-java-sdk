// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostId")
    @Validation(required = true)
    public String dedicatedHostId;

    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ActionOnMaintenance")
    public String actionOnMaintenance;

    @NameInMap("NetworkAttributes")
    @Validation(required = true)
    public ModifyDedicatedHostAttributeRequestNetworkAttributes networkAttributes;

    @NameInMap("AutoPlacement")
    public String autoPlacement;

    public static ModifyDedicatedHostAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeRequest self = new ModifyDedicatedHostAttributeRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyDedicatedHostAttributeRequestNetworkAttributes extends TeaModel {
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static ModifyDedicatedHostAttributeRequestNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostAttributeRequestNetworkAttributes self = new ModifyDedicatedHostAttributeRequestNetworkAttributes();
            return TeaModel.build(map, self);
        }

    }

}
