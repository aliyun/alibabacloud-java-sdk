// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetNetworkAccessEndpointResponseBody extends TeaModel {
    /**
     * <p>The network access endpoint information.</p>
     */
    @NameInMap("NetworkAccessEndpoint")
    public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint networkAccessEndpoint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkAccessEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkAccessEndpointResponseBody self = new GetNetworkAccessEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkAccessEndpointResponseBody setNetworkAccessEndpoint(GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint networkAccessEndpoint) {
        this.networkAccessEndpoint = networkAccessEndpoint;
        return this;
    }
    public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint getNetworkAccessEndpoint() {
        return this.networkAccessEndpoint;
    }

    public GetNetworkAccessEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint extends TeaModel {
        /**
         * <p>The time when the network access endpoint was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The private egress IP addresses of the dedicated network access endpoint. This parameter is returned only when NetworkEndpointType is set to private.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.x.x</p>
         */
        @NameInMap("EgressPrivateIpAddresses")
        public java.util.List<String> egressPrivateIpAddresses;

        /**
         * <p>The public egress IP addresses of the shared network access endpoint. This parameter is returned only when NetworkEndpointType is set to shared.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.XX.XX/27</p>
         */
        @NameInMap("EgressPublicIpAddresses")
        public java.util.List<String> egressPublicIpAddresses;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The dedicated network access endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The name of the dedicated network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Xx-business VPC access endpoint</p>
         */
        @NameInMap("NetworkAccessEndpointName")
        public String networkAccessEndpointName;

        /**
         * <p>The type of the network access endpoint. Valid values:</p>
         * <ul>
         * <li>shared: shared network access endpoint.</li>
         * <li>private: dedicated network access endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("NetworkAccessEndpointType")
        public String networkAccessEndpointType;

        /**
         * <p>The ID of the security group used by the dedicated network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-examplexxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the network access endpoint. Valid values:</p>
         * <ul>
         * <li>pending: pending initialization.</li>
         * <li>creating: being created.</li>
         * <li>running: running.</li>
         * <li>deleting: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the dedicated network access endpoint was last updated. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The list of vSwitches to which the dedicated network access endpoint is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-examplexxx</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC to which the dedicated network access endpoint is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-examplexxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The region of the VPC to which the dedicated network access endpoint is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        public static GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint self = new GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint();
            return TeaModel.build(map, self);
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setEgressPrivateIpAddresses(java.util.List<String> egressPrivateIpAddresses) {
            this.egressPrivateIpAddresses = egressPrivateIpAddresses;
            return this;
        }
        public java.util.List<String> getEgressPrivateIpAddresses() {
            return this.egressPrivateIpAddresses;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setEgressPublicIpAddresses(java.util.List<String> egressPublicIpAddresses) {
            this.egressPublicIpAddresses = egressPublicIpAddresses;
            return this;
        }
        public java.util.List<String> getEgressPublicIpAddresses() {
            return this.egressPublicIpAddresses;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setNetworkAccessEndpointName(String networkAccessEndpointName) {
            this.networkAccessEndpointName = networkAccessEndpointName;
            return this;
        }
        public String getNetworkAccessEndpointName() {
            return this.networkAccessEndpointName;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setNetworkAccessEndpointType(String networkAccessEndpointType) {
            this.networkAccessEndpointType = networkAccessEndpointType;
            return this;
        }
        public String getNetworkAccessEndpointType() {
            return this.networkAccessEndpointType;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

    }

}
