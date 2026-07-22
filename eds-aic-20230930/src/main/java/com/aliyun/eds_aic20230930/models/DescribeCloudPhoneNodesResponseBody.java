// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates whether a next pagination token exists. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
     * <li>If <strong>NextToken</strong> has a value, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The details of the cloud phone matrix.</p>
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
     * <p>The total number of entries.</p>
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

    public static class DescribeCloudPhoneNodesResponseBodyNodeModelBizTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>keyname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>valuename</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCloudPhoneNodesResponseBodyNodeModelBizTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodesResponseBodyNodeModelBizTags self = new DescribeCloudPhoneNodesResponseBodyNodeModelBizTags();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelBizTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelBizTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos extends TeaModel {
        /**
         * <p>The instance ID of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-hn3tj409amvamz8mf****</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The bandwidth type.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp_ecd</p>
         */
        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        /**
         * <p>The network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-avcuocx9805oq****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>network_pro_ecd</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The vSwitch ID in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-j6cjgev6fv3ftw4f0****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos self = new DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos setBandwidthPackageType(String bandwidthPackageType) {
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo extends TeaModel {
        /**
         * <p>The ID of the independent device storage.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-dhusabisshj****</p>
         */
        @NameInMap("PhoneDataId")
        public String phoneDataId;

        /**
         * <p>The storage capacity of the independent device storage. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PhoneDataVolume")
        public Integer phoneDataVolume;

        public static DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo self = new DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo setPhoneDataId(String phoneDataId) {
            this.phoneDataId = phoneDataId;
            return this;
        }
        public String getPhoneDataId() {
            return this.phoneDataId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo setPhoneDataVolume(Integer phoneDataVolume) {
            this.phoneDataVolume = phoneDataVolume;
            return this;
        }
        public Integer getPhoneDataVolume() {
            return this.phoneDataVolume;
        }

    }

    public static class DescribeCloudPhoneNodesResponseBodyNodeModelTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCloudPhoneNodesResponseBodyNodeModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudPhoneNodesResponseBodyNodeModelTags self = new DescribeCloudPhoneNodesResponseBodyNodeModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModelTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCloudPhoneNodesResponseBodyNodeModel extends TeaModel {
        /**
         * <p>The bandwidth plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-7xvrl7axet2qg6yia******</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The status of the bandwidth plan. Valid values:</p>
         * <ul>
         * <li>0: initializing</li>
         * <li>1: normal</li>
         * <li>2: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BandwidthPackageStatus")
        public String bandwidthPackageStatus;

        /**
         * <p>The bandwidth type.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp_ecd</p>
         */
        @NameInMap("BandwidthPackageType")
        public String bandwidthPackageType;

        /**
         * <p>The array of tag information.</p>
         */
        @NameInMap("BizTags")
        public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelBizTags> bizTags;

        /**
         * <p>The billing type.</p>
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
         * <p>The time when the matrix was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-13 02:03:14</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ac.max</p>
         */
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
         * <p>The network-related information.</p>
         */
        @NameInMap("NetworkInfos")
        public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos> networkInfos;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>network_pro_ecd</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The cloud phone matrix ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-ehs0yoedq8ntm****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>node_name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The number of instances provisioned under the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("PhoneCount")
        public Integer phoneCount;

        /**
         * <p>The independent device storage information.</p>
         */
        @NameInMap("PhoneDataInfo")
        public DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo phoneDataInfo;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The height of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The width of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>The specifications of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gx7.10xlarge</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The size of the shared device storage. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ShareDataVolume")
        public Integer shareDataVolume;

        /**
         * <p>The status of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SwapSize")
        public Integer swapSize;

        @NameInMap("Tags")
        public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelTags> tags;

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

        public DescribeCloudPhoneNodesResponseBodyNodeModel setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setBandwidthPackageStatus(String bandwidthPackageStatus) {
            this.bandwidthPackageStatus = bandwidthPackageStatus;
            return this;
        }
        public String getBandwidthPackageStatus() {
            return this.bandwidthPackageStatus;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setBandwidthPackageType(String bandwidthPackageType) {
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setBizTags(java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelBizTags> bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelBizTags> getBizTags() {
            return this.bizTags;
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

        public DescribeCloudPhoneNodesResponseBodyNodeModel setNetworkInfos(java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos> networkInfos) {
            this.networkInfos = networkInfos;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelNetworkInfos> getNetworkInfos() {
            return this.networkInfos;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
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

        public DescribeCloudPhoneNodesResponseBodyNodeModel setPhoneDataInfo(DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo phoneDataInfo) {
            this.phoneDataInfo = phoneDataInfo;
            return this;
        }
        public DescribeCloudPhoneNodesResponseBodyNodeModelPhoneDataInfo getPhoneDataInfo() {
            return this.phoneDataInfo;
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

        public DescribeCloudPhoneNodesResponseBodyNodeModel setSwapSize(Integer swapSize) {
            this.swapSize = swapSize;
            return this;
        }
        public Integer getSwapSize() {
            return this.swapSize;
        }

        public DescribeCloudPhoneNodesResponseBodyNodeModel setTags(java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCloudPhoneNodesResponseBodyNodeModelTags> getTags() {
            return this.tags;
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
