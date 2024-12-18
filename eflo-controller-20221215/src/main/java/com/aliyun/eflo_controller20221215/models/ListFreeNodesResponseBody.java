// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeNodesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Nodes")
    public java.util.List<ListFreeNodesResponseBodyNodes> nodes;

    /**
     * <strong>example:</strong>
     * <p>AA14CB86-70C4-5CB7-9E7B-6CCA77F3512B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFreeNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFreeNodesResponseBody self = new ListFreeNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFreeNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFreeNodesResponseBody setNodes(java.util.List<ListFreeNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListFreeNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListFreeNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFreeNodesResponseBodyNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1652321554</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1673107200</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-7pp2x193801</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>sn_pozkHBgicd</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListFreeNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListFreeNodesResponseBodyNodes self = new ListFreeNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListFreeNodesResponseBodyNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFreeNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListFreeNodesResponseBodyNodes setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListFreeNodesResponseBodyNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListFreeNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListFreeNodesResponseBodyNodes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListFreeNodesResponseBodyNodes setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListFreeNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
