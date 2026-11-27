// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CancelShiftLoadBalancerZonesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client. Make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without adding the zone back. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The application load balancing instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The zone and vSwitch mappings.</p>
     * <blockquote>
     * <p>You can add back only one zone in each call.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<CancelShiftLoadBalancerZonesRequestZoneMappings> zoneMappings;

    public static CancelShiftLoadBalancerZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelShiftLoadBalancerZonesRequest self = new CancelShiftLoadBalancerZonesRequest();
        return TeaModel.build(map, self);
    }

    public CancelShiftLoadBalancerZonesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelShiftLoadBalancerZonesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CancelShiftLoadBalancerZonesRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CancelShiftLoadBalancerZonesRequest setZoneMappings(java.util.List<CancelShiftLoadBalancerZonesRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<CancelShiftLoadBalancerZonesRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class CancelShiftLoadBalancerZonesRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of the vSwitch that corresponds to the zone. By default, each zone uses one vSwitch and one subnet.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1rmcrwg3erh1fh8****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID. You can obtain the zone ID by calling the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CancelShiftLoadBalancerZonesRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            CancelShiftLoadBalancerZonesRequestZoneMappings self = new CancelShiftLoadBalancerZonesRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public CancelShiftLoadBalancerZonesRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CancelShiftLoadBalancerZonesRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
