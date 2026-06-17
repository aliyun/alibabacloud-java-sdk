// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClustersRequest extends TeaModel {
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
     * <p>The status of the ACK cluster connector.</p>
     * 
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("ConnectorStatus")
    public String connectorStatus;

    /**
     * <p>The Alibaba Cloud UID of the account to which the ACK cluster resources belong.</p>
     * 
     * <strong>example:</strong>
     * <p>135809047715****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the ACK cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    public static DescribeAckClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClustersRequest self = new DescribeAckClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAckClustersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeAckClustersRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeAckClustersRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeAckClustersRequest setConnectorStatus(String connectorStatus) {
        this.connectorStatus = connectorStatus;
        return this;
    }
    public String getConnectorStatus() {
        return this.connectorStatus;
    }

    public DescribeAckClustersRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeAckClustersRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeAckClustersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAckClustersRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
