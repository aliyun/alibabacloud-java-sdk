// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesRequest extends TeaModel {
    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>Generate a unique token from your client for each request. The <code>ClientToken</code> parameter can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the request\&quot;s <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> differs for each API request.</p>
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
     * <li><p><strong>true</strong>: performs a dry run to check for potential issues, including missing parameters, incorrect formatting, and service limits. If the request fails the dry run, the system returns an error message. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the check, the system returns an HTTP <code>2xx</code> status code and performs the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the ALB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hfn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("RetainResourceType")
    public java.util.List<String> retainResourceType;

    /**
     * <p>The mappings between availability zones and VSwitches. You can specify up to 10 availability zones. If the current region supports two or more availability zones, you must specify at least two. Specifying this parameter overwrites the existing availability zone configuration.</p>
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
         * <p>The type of the EIP. Valid values:</p>
         * <ul>
         * <li><p><strong>Common</strong>: an EIP.</p>
         * </li>
         * <li><p><strong>Anycast</strong>: an Anycast EIP.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For a list of regions that support binding an Anycast EIP to an ALB instance, see <a href="https://help.aliyun.com/document_detail/460727.html">Usage limits</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The private IPv4 address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The ID of the VSwitch in the availability zone. Each availability zone uses one VSwitch and one subnet by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1rmcrwg3srh1fh8****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the availability zone. You can call the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query the IDs of available zones.</p>
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
