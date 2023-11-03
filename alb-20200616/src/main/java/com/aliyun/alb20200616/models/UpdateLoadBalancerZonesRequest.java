// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the ALB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The zones and the vSwitches. You must specify at least two zones. The specified zones overwrite the existing configurations.</p>
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
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The ID of the vSwitch in the zone. By default, you can specify only one vSwitch (subnet) for each zone of an ALB instance. You can specify up to 10 zone IDs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the zone. You can call the [DescribeZones](~~189196~~) operation to query the zones. You can specify up to 10 zone IDs.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateLoadBalancerZonesRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerZonesRequestZoneMappings self = new UpdateLoadBalancerZonesRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerZonesRequestZoneMappings setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
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
