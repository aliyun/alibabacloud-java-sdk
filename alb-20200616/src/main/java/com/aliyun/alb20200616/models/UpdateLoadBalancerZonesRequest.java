// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
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
     * <li><p><strong>true</strong>: performs a dry run and does not modify the active zone property of the application load balancing instance. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends a Normal request. If the request passes the dry run, the system returns an <code>HTTP_2xx</code> status code and performs the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the application load balancing instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hfn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The types of resources that undergo automatic creation and attach to the ALB instance, which need to be retained. When you remove an active zone from an Internet-facing ALB instance, you can update the Settings to eip to retain the EIP that undergoes automatic creation and attach by ALB. Anycast EIPs do not support retention, and EIPs that users manually attach are automatically retained.</p>
     */
    @NameInMap("RetainResourceType")
    public java.util.List<String> retainResourceType;

    /**
     * <p>The mappings between zones and vSwitches. You can specify up to 10 zones. If the current region supports two or more zones, you must specify at least two zones. If you specify this parameter, the previous zone configurations are replaced.</p>
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

    public UpdateLoadBalancerZonesRequest setRetainResourceType(java.util.List<String> retainResourceType) {
        this.retainResourceType = retainResourceType;
        return this;
    }
    public java.util.List<String> getRetainResourceType() {
        return this.retainResourceType;
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
         * <p>The type of the Internet-facing EIP. Valid values:</p>
         * <ul>
         * <li><strong>Common</strong>: EIP.</li>
         * <li><strong>Anycast</strong>: Anycast EIP.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the regions where ALB supports Anycast EIPs, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The IPv4 private endpoint of the private network. You must add at least two active zones and can add up to 10 active zones.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The vSwitch that corresponds to the zone. By default, each zone uses one vSwitch and one subnet. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1rmcrwg3srh1fh8****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the zone. You can obtain the zone name by calling the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateLoadBalancerZonesRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerZonesRequestZoneMappings self = new UpdateLoadBalancerZonesRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerZonesRequestZoneMappings setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
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
