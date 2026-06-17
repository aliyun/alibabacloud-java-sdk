// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkTrafficTopRatioRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
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
     * <p>The region where the asset resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("AssetRegion")
    public String assetRegion;

    /**
     * <p>The data type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in_src_ip</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The traffic direction.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>39.144.124.XXX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The destination port.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1757433863</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IP address property.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy</p>
     */
    @NameInMap("IpProperty")
    public String ipProperty;

    /**
     * <p>The Internet Service Provider (ISP).</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The area.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou City</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The action triggered by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <p>The sorting method.</p>
     * 
     * <strong>example:</strong>
     * <p>in_bytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>60.12.220.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.169.XXX</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1749176793</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeNetworkTrafficTopRatioRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkTrafficTopRatioRequest self = new DescribeNetworkTrafficTopRatioRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkTrafficTopRatioRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeNetworkTrafficTopRatioRequest setAssetIP(String assetIP) {
        this.assetIP = assetIP;
        return this;
    }
    public String getAssetIP() {
        return this.assetIP;
    }

    public DescribeNetworkTrafficTopRatioRequest setAssetRegion(String assetRegion) {
        this.assetRegion = assetRegion;
        return this;
    }
    public String getAssetRegion() {
        return this.assetRegion;
    }

    public DescribeNetworkTrafficTopRatioRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeNetworkTrafficTopRatioRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeNetworkTrafficTopRatioRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeNetworkTrafficTopRatioRequest setDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public String getDstPort() {
        return this.dstPort;
    }

    public DescribeNetworkTrafficTopRatioRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeNetworkTrafficTopRatioRequest setIpProperty(String ipProperty) {
        this.ipProperty = ipProperty;
        return this;
    }
    public String getIpProperty() {
        return this.ipProperty;
    }

    public DescribeNetworkTrafficTopRatioRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeNetworkTrafficTopRatioRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNetworkTrafficTopRatioRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeNetworkTrafficTopRatioRequest setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
        return this;
    }
    public String getRuleResult() {
        return this.ruleResult;
    }

    public DescribeNetworkTrafficTopRatioRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeNetworkTrafficTopRatioRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeNetworkTrafficTopRatioRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNetworkTrafficTopRatioRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeNetworkTrafficTopRatioRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
