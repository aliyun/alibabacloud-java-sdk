// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClustersResponseBody extends TeaModel {
    /**
     * <p>A list of ACK clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeAckClustersResponseBodyClusters> clusters;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAckClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClustersResponseBody self = new DescribeAckClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAckClustersResponseBody setClusters(java.util.List<DescribeAckClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeAckClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeAckClustersResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAckClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAckClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAckClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAckClustersResponseBodyClusters extends TeaModel {
        /**
         * <p>The ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cb0f5640b1b2d404cad6ba21509d7847b</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-name</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The specification of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The type of the ACK cluster. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
         * <ul>
         * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Returns a list of ACK clusters in your account that meet specific criteria, such as the cluster type and specifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The Alibaba Cloud UID of the account to which the ACK cluster resources belong.</p>
         * 
         * <strong>example:</strong>
         * <p>135809047715****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The network plugin of the ACK cluster. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
         * <ul>
         * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Lists the ACK clusters in your account that meet specified conditions, such as cluster type and specifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>terway-eniip</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The subtype of the cluster. This parameter is available only when <code>ClusterType</code> is set to <code>ManagedKubernetes</code>. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
         * <ul>
         * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Lists ACK clusters in your account that meet specified conditions, such as cluster type and specifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The region ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The running status of the ACK cluster. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
         * <ul>
         * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Retrieves a list of ACK clusters in your account that meet specified conditions, such as cluster type and specifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the VPC where the ACK cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vcg932hsxsxuqbgl****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeAckClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeAckClustersResponseBodyClusters self = new DescribeAckClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeAckClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeAckClustersResponseBodyClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAckClustersResponseBodyClusters setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribeAckClustersResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeAckClustersResponseBodyClusters setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeAckClustersResponseBodyClusters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeAckClustersResponseBodyClusters setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeAckClustersResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAckClustersResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAckClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
