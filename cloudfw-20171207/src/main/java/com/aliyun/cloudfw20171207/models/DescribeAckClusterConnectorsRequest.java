// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorsRequest extends TeaModel {
    /**
     * <p>The ID of the ACK cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>0E0C30C977463****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the ACK cluster connector.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <p>The language type for displaying the error reason for the ACK cluster connector\&quot;s health status.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The Alibaba Cloud UID to which the ACK cluster resource belongs.</p>
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
     * <p>The region ID of the ACK cluster connector. Source of values:</p>
     * <ul>
     * <li><a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a>: Query the list of synchronization node regions.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the regions supported by Cloud Firewall for ACK cluster connectors, see <a href="https://help.aliyun.com/document_detail/2865120.html">ACK Cluster Synchronization Nodes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The VPC instance ID to which the ACK cluster belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0x******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeAckClusterConnectorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterConnectorsRequest self = new DescribeAckClusterConnectorsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterConnectorsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeAckClusterConnectorsRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public DescribeAckClusterConnectorsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAckClusterConnectorsRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeAckClusterConnectorsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeAckClusterConnectorsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAckClusterConnectorsRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeAckClusterConnectorsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
