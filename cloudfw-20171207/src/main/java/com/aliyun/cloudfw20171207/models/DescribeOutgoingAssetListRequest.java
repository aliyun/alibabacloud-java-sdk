// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingAssetListRequest extends TeaModel {
    /**
     * <p>The region ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("AssetsRegion")
    public String assetsRegion;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1736438400</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The follow status.</p>
     * 
     * <strong>example:</strong>
     * <p>subscribe</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Queries outbound connections routed from a private network through a NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>NatPrivate</p>
     */
    @NameInMap("IPType")
    public String IPType;

    /**
     * <p>The language of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-bp123456g******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The name of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-test</p>
     */
    @NameInMap("NatGatewayName")
    public String natGatewayName;

    /**
     * <p>The sorting order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.200.33.XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.116.70.XXX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The type of the public IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>NatEIP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The security risk.</p>
     * 
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("SecurityRisk")
    public String securityRisk;

    /**
     * <p>The sorting basis.</p>
     * 
     * <strong>example:</strong>
     * <p>InBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1743647114</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOutgoingAssetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingAssetListRequest self = new DescribeOutgoingAssetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingAssetListRequest setAssetsRegion(String assetsRegion) {
        this.assetsRegion = assetsRegion;
        return this;
    }
    public String getAssetsRegion() {
        return this.assetsRegion;
    }

    public DescribeOutgoingAssetListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingAssetListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingAssetListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeOutgoingAssetListRequest setIPType(String IPType) {
        this.IPType = IPType;
        return this;
    }
    public String getIPType() {
        return this.IPType;
    }

    public DescribeOutgoingAssetListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingAssetListRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeOutgoingAssetListRequest setNatGatewayName(String natGatewayName) {
        this.natGatewayName = natGatewayName;
        return this;
    }
    public String getNatGatewayName() {
        return this.natGatewayName;
    }

    public DescribeOutgoingAssetListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingAssetListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingAssetListRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeOutgoingAssetListRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingAssetListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeOutgoingAssetListRequest setSecurityRisk(String securityRisk) {
        this.securityRisk = securityRisk;
        return this;
    }
    public String getSecurityRisk() {
        return this.securityRisk;
    }

    public DescribeOutgoingAssetListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingAssetListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
