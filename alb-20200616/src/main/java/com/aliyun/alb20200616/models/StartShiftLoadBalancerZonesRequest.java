// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StartShiftLoadBalancerZonesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ZoneMappings")
    public java.util.List<StartShiftLoadBalancerZonesRequestZoneMappings> zoneMappings;

    public static StartShiftLoadBalancerZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartShiftLoadBalancerZonesRequest self = new StartShiftLoadBalancerZonesRequest();
        return TeaModel.build(map, self);
    }

    public StartShiftLoadBalancerZonesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartShiftLoadBalancerZonesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StartShiftLoadBalancerZonesRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public StartShiftLoadBalancerZonesRequest setZoneMappings(java.util.List<StartShiftLoadBalancerZonesRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<StartShiftLoadBalancerZonesRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class StartShiftLoadBalancerZonesRequestZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static StartShiftLoadBalancerZonesRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            StartShiftLoadBalancerZonesRequestZoneMappings self = new StartShiftLoadBalancerZonesRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public StartShiftLoadBalancerZonesRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public StartShiftLoadBalancerZonesRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
