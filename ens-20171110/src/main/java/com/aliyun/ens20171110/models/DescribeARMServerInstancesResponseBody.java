// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Servers")
    public java.util.List<DescribeARMServerInstancesResponseBodyServers> servers;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeARMServerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeARMServerInstancesResponseBody self = new DescribeARMServerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeARMServerInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeARMServerInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeARMServerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeARMServerInstancesResponseBody setServers(java.util.List<DescribeARMServerInstancesResponseBodyServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<DescribeARMServerInstancesResponseBodyServers> getServers() {
        return this.servers;
    }

    public DescribeARMServerInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes self = new DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeARMServerInstancesResponseBodyServersAICInstances extends TeaModel {
        @NameInMap("Frequency")
        public Long frequency;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LatestAction")
        public String latestAction;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkAttributes")
        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes networkAttributes;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        public static DescribeARMServerInstancesResponseBodyServersAICInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServersAICInstances self = new DescribeARMServerInstancesResponseBodyServersAICInstances();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setFrequency(Long frequency) {
            this.frequency = frequency;
            return this;
        }
        public Long getFrequency() {
            return this.frequency;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setLatestAction(String latestAction) {
            this.latestAction = latestAction;
            return this;
        }
        public String getLatestAction() {
            return this.latestAction;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setNetworkAttributes(DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeARMServerInstancesResponseBodyServersAICInstancesNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeARMServerInstancesResponseBodyServersAICInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeARMServerInstancesResponseBodyServers extends TeaModel {
        @NameInMap("AICInstances")
        public java.util.List<DescribeARMServerInstancesResponseBodyServersAICInstances> AICInstances;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("LatestAction")
        public String latestAction;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        public static DescribeARMServerInstancesResponseBodyServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeARMServerInstancesResponseBodyServers self = new DescribeARMServerInstancesResponseBodyServers();
            return TeaModel.build(map, self);
        }

        public DescribeARMServerInstancesResponseBodyServers setAICInstances(java.util.List<DescribeARMServerInstancesResponseBodyServersAICInstances> AICInstances) {
            this.AICInstances = AICInstances;
            return this;
        }
        public java.util.List<DescribeARMServerInstancesResponseBodyServersAICInstances> getAICInstances() {
            return this.AICInstances;
        }

        public DescribeARMServerInstancesResponseBodyServers setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeARMServerInstancesResponseBodyServers setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeARMServerInstancesResponseBodyServers setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeARMServerInstancesResponseBodyServers setLatestAction(String latestAction) {
            this.latestAction = latestAction;
            return this;
        }
        public String getLatestAction() {
            return this.latestAction;
        }

        public DescribeARMServerInstancesResponseBodyServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeARMServerInstancesResponseBodyServers setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeARMServerInstancesResponseBodyServers setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeARMServerInstancesResponseBodyServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeARMServerInstancesResponseBodyServers setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeARMServerInstancesResponseBodyServers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeARMServerInstancesResponseBodyServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
