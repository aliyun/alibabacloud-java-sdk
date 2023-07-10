// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("NetworkAccessEndpoint")
    public GetNetworkAccessEndpointResponseBodyNetworkAccessEndpoint networkAccessEndpoint;

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
         * <p>专属网络端点创建时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>网络访问端私网出口IP地址列表。</p>
         */
        @NameInMap("EgressPrivateIpAddresses")
        public java.util.List<String> egressPrivateIpAddresses;

        /**
         * <p>网络访问端点公网出口IP地址段</p>
         */
        @NameInMap("EgressPublicIpAddresses")
        public java.util.List<String> egressPublicIpAddresses;

        /**
         * <p>实例ID。</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>专属网络端点ID。</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>专属网络端点名称。</p>
         */
        @NameInMap("NetworkAccessEndpointName")
        public String networkAccessEndpointName;

        /**
         * <p>专属网络端点连接的类型。</p>
         */
        @NameInMap("NetworkAccessEndpointType")
        public String networkAccessEndpointType;

        /**
         * <p>专属网络端点使用的安全组ID。</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>专属网络端点状态。</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>专属网络端点最近更新时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>专属网络端点连接的指定vSwitch列表。</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>专属网络端点连接的VpcID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>专属网络端点连接的Vpc所属地域。</p>
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
