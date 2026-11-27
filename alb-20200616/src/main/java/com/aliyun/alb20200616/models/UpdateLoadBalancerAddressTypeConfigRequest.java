// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigRequest extends TeaModel {
    /**
     * <p>The target network type. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong>: The load balancing instance has a public IP address, and its DNS domain name is resolved to the public IP address. The load balancing instance can be accessed over the Internet.</p>
     * </li>
     * <li><p><strong>Intranet</strong>: The load balancing instance has only a private IP address, and its DNS domain name is resolved to the private IP address. The load balancing instance can be accessed only within the internal network environment of the VPC where it resides.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a unique value from your client for this parameter. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a dry run request. The network type of the instance is not changed. The system checks whether the required parameters are specified, the request format is valid, and the business limits are met. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): Sends a regular request. If the check passes, the system returns an HTTP 2xx status code and performs the operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The instance ID of the load balancing instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-bp1o94dp5i6ea****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The types of resources that are automatically created by ALB and need to be retained. Settings can currently be configured as eip, which indicates EIPs. Automatic creation and attach operations apply to these resource types.</p>
     */
    @NameInMap("RetainResourceType")
    public java.util.List<String> retainResourceType;

    /**
     * <p>The list of zone and vSwitch mappings. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings;

    public static UpdateLoadBalancerAddressTypeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAddressTypeConfigRequest self = new UpdateLoadBalancerAddressTypeConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setRetainResourceType(java.util.List<String> retainResourceType) {
        this.retainResourceType = retainResourceType;
        return this;
    }
    public java.util.List<String> getRetainResourceType() {
        return this.retainResourceType;
    }

    public UpdateLoadBalancerAddressTypeConfigRequest setZoneMappings(java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class UpdateLoadBalancerAddressTypeConfigRequestZoneMappings extends TeaModel {
        /**
         * <p>The instance ID of the EIP. You can add up to 10 active zones.</p>
         * <blockquote>
         * <p>This parameter is required when you invoke this operation to transform the network type from private network to public network.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the EIP. Valid values:</p>
         * <ul>
         * <li><p>Common (default): a standard EIP.</p>
         * </li>
         * <li><p>Anycast: an Anycast EIP.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For the regions that support binding Anycast EIPs to ALB instances, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The vSwitch that corresponds to the zone. Each zone can use only one vSwitch and one subnet. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10ttov87felojcn****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the load balancing instance. You can add up to 10 zones. If the current region supports two or more zones, you must add at least two zones.</p>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> to query the active zone information that corresponds to a zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateLoadBalancerAddressTypeConfigRequestZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAddressTypeConfigRequestZoneMappings self = new UpdateLoadBalancerAddressTypeConfigRequestZoneMappings();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateLoadBalancerAddressTypeConfigRequestZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
