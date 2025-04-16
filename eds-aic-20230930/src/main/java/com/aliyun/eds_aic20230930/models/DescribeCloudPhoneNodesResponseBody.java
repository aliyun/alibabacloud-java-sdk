// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * </ul>
     * <hr>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The matrixes.</p>
     */
    @NameInMap("NodeModel")
    public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModel> nodeModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud phone instances.</p>
     * 
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCloudPhoneNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodesResponseBody self = new DescribeCloudPhoneNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudPhoneNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudPhoneNodesResponseBody setNodeModel(java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModel> nodeModel) {
        this.nodeModel = nodeModel;
        return this;
    }
    public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModel> getNodeModel() {
        return this.nodeModel;
    }

    public DescribeCloudPhoneNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudPhoneNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudPhoneNodesResponseBodyNodeModel extends TeaModel {
        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-13 02:03:14</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The expiration time of the subscription matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-09 02:00:34</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-13 02:03:14</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-5mwr9azebliva****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The matrix ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-ehs0yoedq8ntm****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The matrix name.</p>
         * 
         * <strong>example:</strong>
         * <p>node_name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The number of cloud phone instances per matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("PhoneCount")
        public Integer phoneCount;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The height of the resolution. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The width of the resolution. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>The matrix specification.</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gn6.gx1</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The size of the shared storage. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ShareDataVolume")
        public Integer shareDataVolume;

        /**
         * <p>The matrix status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeekryyc1q3sm72l****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeCloudPhoneNodesResponseBodyNodeModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodesResponseBodyNodeModel self = new DescribeCloudPhoneNodesResponseBodyNodeModel();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setGmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setPhoneCount(Integer phoneCount) {
            this.phoneCount = phoneCount;
            return this;
        }
        public Integer getPhoneCount() {
            return this.phoneCount;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setShareDataVolume(Integer shareDataVolume) {
            this.shareDataVolume = shareDataVolume;
            return this;
        }
        public Integer getShareDataVolume() {
            return this.shareDataVolume;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
