// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessPathsResponseBody extends TeaModel {
    @NameInMap("NetworkAccessPaths")
    public java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> networkAccessPaths;

    @NameInMap("RequestId")
    public String requestId;

    public static ListNetworkAccessPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessPathsResponseBody self = new ListNetworkAccessPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessPathsResponseBody setNetworkAccessPaths(java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> networkAccessPaths) {
        this.networkAccessPaths = networkAccessPaths;
        return this;
    }
    public java.util.List<ListNetworkAccessPathsResponseBodyNetworkAccessPaths> getNetworkAccessPaths() {
        return this.networkAccessPaths;
    }

    public ListNetworkAccessPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNetworkAccessPathsResponseBodyNetworkAccessPaths extends TeaModel {
        /**
         * <p>专属网络端点访问路径创建时间，Unix时间戳格式，单位为毫秒。</p>
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
         * <p>专属网络端点访问路径ID。</p>
         */
        @NameInMap("NetworkAccessPathId")
        public String networkAccessPathId;

        /**
         * <p>专属网络端点访问路径使用的ENI ID。</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>专属网络端点访问路径使用的ENI私网地址。</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>专属网络端点访问路径状态。</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>专属网络端点访问路径最近更新时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>专属网络端点访问路径的ENI归属的交换机ID。</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ListNetworkAccessPathsResponseBodyNetworkAccessPaths build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkAccessPathsResponseBodyNetworkAccessPaths self = new ListNetworkAccessPathsResponseBodyNetworkAccessPaths();
            return TeaModel.build(map, self);
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkAccessPathId(String networkAccessPathId) {
            this.networkAccessPathId = networkAccessPathId;
            return this;
        }
        public String getNetworkAccessPathId() {
            return this.networkAccessPathId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNetworkAccessPathsResponseBodyNetworkAccessPaths setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
