// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAssetListRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("AssetIP")
    public String assetIP;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The traffic direction.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The instance ID of the ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-hp3ez3rs9bxwt034****</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The name of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ecs</p>
     */
    @NameInMap("EcsInstanceName")
    public String ecsInstanceName;

    /**
     * <p>The end time. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1756952150</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("IPProtocol")
    public String IPProtocol;

    /**
     * <p>Specifies whether to collect statistics only on traffic that accesses AI services.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAITraffic")
    public String isAITraffic;

    /**
     * <p>The language type of the request and response messages.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The instance ID of the peer VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-90rq0anm6t8vbwbo****</p>
     */
    @NameInMap("PeerVpcId")
    public String peerVpcId;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>5234</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The risk level.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The sort method.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start time. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408189</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The instance ID of the VPC-connected instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9ulqcvly23w31zkh8sm****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallAssetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAssetListRequest self = new DescribeVpcFirewallAssetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAssetListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeVpcFirewallAssetListRequest setAssetIP(String assetIP) {
        this.assetIP = assetIP;
        return this;
    }
    public String getAssetIP() {
        return this.assetIP;
    }

    public DescribeVpcFirewallAssetListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallAssetListRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeVpcFirewallAssetListRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public DescribeVpcFirewallAssetListRequest setEcsInstanceName(String ecsInstanceName) {
        this.ecsInstanceName = ecsInstanceName;
        return this;
    }
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    public DescribeVpcFirewallAssetListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVpcFirewallAssetListRequest setIPProtocol(String IPProtocol) {
        this.IPProtocol = IPProtocol;
        return this;
    }
    public String getIPProtocol() {
        return this.IPProtocol;
    }

    public DescribeVpcFirewallAssetListRequest setIsAITraffic(String isAITraffic) {
        this.isAITraffic = isAITraffic;
        return this;
    }
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    public DescribeVpcFirewallAssetListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallAssetListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeVpcFirewallAssetListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallAssetListRequest setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public DescribeVpcFirewallAssetListRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeVpcFirewallAssetListRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeVpcFirewallAssetListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeVpcFirewallAssetListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVpcFirewallAssetListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
