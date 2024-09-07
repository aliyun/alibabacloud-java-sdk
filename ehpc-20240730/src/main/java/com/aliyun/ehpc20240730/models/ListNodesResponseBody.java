// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<ListNodesResponseBodyNodes> nodes;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setNodes(java.util.List<ListNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListNodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodesResponseBodyNodesTotalResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static ListNodesResponseBodyNodesTotalResources build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesTotalResources self = new ListNodesResponseBodyNodesTotalResources();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesTotalResources setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListNodesResponseBodyNodesTotalResources setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ListNodesResponseBodyNodesTotalResources setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class ListNodesResponseBodyNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-06-09T06:22:02.000Z</p>
         */
        @NameInMap("AddTime")
        public String addTime;

        /**
         * <strong>example:</strong>
         * <p>2020-06-09T06:22:02.000Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>edas.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HtEnabled")
        public Boolean htEnabled;

        /**
         * <strong>example:</strong>
         * <p>i-bp15707mys2rsy0j****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_20190711.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>ecs.c5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>172.16.**.**</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepAlive")
        public Boolean keepAlive;

        /**
         * <strong>example:</strong>
         * <p>172.16.**.**</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <strong>example:</strong>
         * <p>autoque3</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("StateInSched")
        public String stateInSched;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalResources")
        public ListNodesResponseBodyNodesTotalResources totalResources;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1e47optm9g58zcu****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1gnu8br4ay7beb2w****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodes self = new ListNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodes setAddTime(String addTime) {
            this.addTime = addTime;
            return this;
        }
        public String getAddTime() {
            return this.addTime;
        }

        public ListNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListNodesResponseBodyNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListNodesResponseBodyNodes setHtEnabled(Boolean htEnabled) {
            this.htEnabled = htEnabled;
            return this;
        }
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        public ListNodesResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodesResponseBodyNodes setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodesResponseBodyNodes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListNodesResponseBodyNodes setKeepAlive(Boolean keepAlive) {
            this.keepAlive = keepAlive;
            return this;
        }
        public Boolean getKeepAlive() {
            return this.keepAlive;
        }

        public ListNodesResponseBodyNodes setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListNodesResponseBodyNodes setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListNodesResponseBodyNodes setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ListNodesResponseBodyNodes setStateInSched(String stateInSched) {
            this.stateInSched = stateInSched;
            return this;
        }
        public String getStateInSched() {
            return this.stateInSched;
        }

        public ListNodesResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNodesResponseBodyNodes setTotalResources(ListNodesResponseBodyNodesTotalResources totalResources) {
            this.totalResources = totalResources;
            return this;
        }
        public ListNodesResponseBodyNodesTotalResources getTotalResources() {
            return this.totalResources;
        }

        public ListNodesResponseBodyNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListNodesResponseBodyNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
