// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gwlb-9njtjmqt7zfcqm****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<UpdateLoadBalancerZonesRequestZoneMappings> zoneMappings;

    public static UpdateLoadBalancerZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerZonesRequest self = new UpdateLoadBalancerZonesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerZonesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerZonesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerZonesRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerZonesRequest setZoneMappings(java.util.List<UpdateLoadBalancerZonesRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<UpdateLoadBalancerZonesRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class UpdateLoadBalancerZonesRequestZoneMappings extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1n75pbs77v5q6p3****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateLoadBalancerZonesRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerZonesRequestZoneMappings self = new UpdateLoadBalancerZonesRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerZonesRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateLoadBalancerZonesRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
