// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointsResponseBody extends TeaModel {
    @NameInMap("NetworkAccessEndpoints")
    public java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> networkAccessEndpoints;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListNetworkAccessEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointsResponseBody self = new ListNetworkAccessEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointsResponseBody setNetworkAccessEndpoints(java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> networkAccessEndpoints) {
        this.networkAccessEndpoints = networkAccessEndpoints;
        return this;
    }
    public java.util.List<ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints> getNetworkAccessEndpoints() {
        return this.networkAccessEndpoints;
    }

    public ListNetworkAccessEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetworkAccessEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetworkAccessEndpointsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints extends TeaModel {
        /**
         * <p>专属网络端点创建时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

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

        public static ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints self = new ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setNetworkAccessEndpointName(String networkAccessEndpointName) {
            this.networkAccessEndpointName = networkAccessEndpointName;
            return this;
        }
        public String getNetworkAccessEndpointName() {
            return this.networkAccessEndpointName;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setNetworkAccessEndpointType(String networkAccessEndpointType) {
            this.networkAccessEndpointType = networkAccessEndpointType;
            return this;
        }
        public String getNetworkAccessEndpointType() {
            return this.networkAccessEndpointType;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNetworkAccessEndpointsResponseBodyNetworkAccessEndpoints setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

    }

}
