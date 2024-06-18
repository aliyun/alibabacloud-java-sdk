// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigRequest extends TeaModel {
    /**
     * <p>The new network type. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
     * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the virtual private cloud (VPC) where the ALB instance is deployed.</li>
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
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The ALB instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1o94dp5i6ea****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The zones and the vSwitches. You must specify at least two zones.</p>
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

    public UpdateLoadBalancerAddressTypeConfigRequest setZoneMappings(java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<UpdateLoadBalancerAddressTypeConfigRequestZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class UpdateLoadBalancerAddressTypeConfigRequestZoneMappings extends TeaModel {
        /**
         * <p>The ID of an EIP instance. You can specify up to 10 zone IDs.</p>
         * <blockquote>
         * <p>This parameter is required if you want to change the network type from internal-facing to Internet-facing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1aedxso6u80u0qf****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The ID of the vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an ALB instance. You can specify up to 10 vSwitch IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10ttov87felojcn****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone where the ALB instance is deployed. You can specify up to 10 zone IDs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query the most recent zone list.</p>
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
