// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetRiskListRequest extends TeaModel {
    /**
     * <p>The IP addresses to query. Separate the IP addresses with commas (,). You can specify up to 20 IP addresses at a time.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Example of an IPv4 address: 47.97.XX.XX</p>
     * </li>
     * <li><p>Example of an IPv6 address: 2001:db8:ffff:ffff:ffff:XXXX:ffff</p>
     * </li>
     * </ul>
     */
    @NameInMap("IpAddrList")
    public java.util.List<String> ipAddrList;

    /**
     * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>4</strong> (default): IPv4</li>
     * <li><strong>6</strong>: IPv6</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public Integer ipVersion;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAssetRiskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetRiskListRequest self = new DescribeAssetRiskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetRiskListRequest setIpAddrList(java.util.List<String> ipAddrList) {
        this.ipAddrList = ipAddrList;
        return this;
    }
    public java.util.List<String> getIpAddrList() {
        return this.ipAddrList;
    }

    public DescribeAssetRiskListRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public DescribeAssetRiskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAssetRiskListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
