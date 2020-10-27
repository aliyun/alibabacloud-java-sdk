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
    public ModifyDedicatedHostAttributeRequestNetworkAttributes networkAttributes;

    @NameInMap("AutoPlacement")
    public String autoPlacement;

    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    @NameInMap("CpuOverCommitRatio")
    public Float cpuOverCommitRatio;

    public static ModifyDedicatedHostAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAttributeRequest self = new ModifyDedicatedHostAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDedicatedHostAttributeRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyDedicatedHostAttributeRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public ModifyDedicatedHostAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDedicatedHostAttributeRequest setActionOnMaintenance(String actionOnMaintenance) {
        this.actionOnMaintenance = actionOnMaintenance;
        return this;
    }
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    public ModifyDedicatedHostAttributeRequest setNetworkAttributes(ModifyDedicatedHostAttributeRequestNetworkAttributes networkAttributes) {
        this.networkAttributes = networkAttributes;
        return this;
    }
    public ModifyDedicatedHostAttributeRequestNetworkAttributes getNetworkAttributes() {
        return this.networkAttributes;
    }

    public ModifyDedicatedHostAttributeRequest setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }
    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    public ModifyDedicatedHostAttributeRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyDedicatedHostAttributeRequest setCpuOverCommitRatio(Float cpuOverCommitRatio) {
        this.cpuOverCommitRatio = cpuOverCommitRatio;
        return this;
    }
    public Float getCpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
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

        public ModifyDedicatedHostAttributeRequestNetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public ModifyDedicatedHostAttributeRequestNetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

}
