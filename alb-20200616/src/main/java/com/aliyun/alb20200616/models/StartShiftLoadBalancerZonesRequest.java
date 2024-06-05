// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StartShiftLoadBalancerZonesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ALB instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The mappings between zones and vSwitches.</p>
     * <br>
     * <p>>  You can remove only one zone in each call.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The ID of the vSwitch in the zone. By default, each zone uses one vSwitch and one subnet.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID. You can call the [DescribeZones](https://help.aliyun.com/document_detail/189196.html) operation to query the most recent zone list.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
