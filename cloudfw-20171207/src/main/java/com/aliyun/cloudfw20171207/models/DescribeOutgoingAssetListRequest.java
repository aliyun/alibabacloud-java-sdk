// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingAssetListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("AssetsRegion")
    public String assetsRegion;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1736438400</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>subscribe</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>NatPrivate</p>
     */
    @NameInMap("IPType")
    public String IPType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>ngw-bp123456g******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <strong>example:</strong>
     * <p>ngw-test</p>
     */
    @NameInMap("NatGatewayName")
    public String natGatewayName;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>10.200.33.XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <strong>example:</strong>
     * <p>47.116.70.XXX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <strong>example:</strong>
     * <p>NatEIP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("SecurityRisk")
    public String securityRisk;

    /**
     * <strong>example:</strong>
     * <p>InBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
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
