// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainRequest extends TeaModel {
    /**
     * <p>The asset category. If you leave this parameter empty, assets in all categories are queried. Valid values:</p>
     * <ul>
     * <li><p><strong>All</strong>: all categories</p>
     * </li>
     * <li><p><strong>RiskDomain</strong>: risky domain names</p>
     * </li>
     * <li><p><strong>RiskIP</strong>: risky IP addresses</p>
     * </li>
     * <li><p><strong>AliYun</strong>: Alibaba Cloud services</p>
     * </li>
     * <li><p><strong>NotAliYun</strong>: third-party services</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The page number to return.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The source of traffic statistics. The default value is \<code>internet\\</code>, which indicates Internet Firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>internet</strong>: Internet Firewall</p>
     * </li>
     * <li><p><strong>nat</strong>: NAT Firewall</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nat</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The outbound domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. This is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to count only traffic from accessing AI services. The default value is \<code>false\\</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes</p>
     * </li>
     * <li><p><strong>false</strong>: no</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAITraffic")
    public String isAITraffic;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: ascending</p>
     * </li>
     * <li><p><strong>desc</strong> (default): descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 6. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The public IP address of the Elastic Compute Service (ECS) instance that initiates the outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The field to sort by. Valid values:</p>
     * <ul>
     * <li><p><strong>SessionCount</strong> (default): the number of requests</p>
     * </li>
     * <li><p><strong>TotalBytes</strong>: the total traffic</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The beginning of the time range to query. This is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the intelligence tag. Valid values:</p>
     * <ul>
     * <li><p><strong>AliYun</strong>: Alibaba Cloud service</p>
     * </li>
     * <li><p><strong>RiskDomain</strong>: Risky domain name</p>
     * </li>
     * <li><p><strong>RiskIP</strong>: Risky IP address</p>
     * </li>
     * <li><p><strong>TrustedDomain</strong>: Trusted website</p>
     * </li>
     * <li><p><strong>AliPay</strong>: Alipay</p>
     * </li>
     * <li><p><strong>DingDing</strong>: DingTalk</p>
     * </li>
     * <li><p><strong>WeChat</strong>: WeChat</p>
     * </li>
     * <li><p><strong>QQ</strong>: Tencent QQ</p>
     * </li>
     * <li><p><strong>SecurityService</strong>: Security service</p>
     * </li>
     * <li><p><strong>Microsoft</strong>: Microsoft</p>
     * </li>
     * <li><p><strong>Amazon</strong>: Amazon</p>
     * </li>
     * <li><p><strong>Pan</strong>: Cloud storage service</p>
     * </li>
     * <li><p><strong>Map</strong>: Map service</p>
     * </li>
     * <li><p><strong>Code</strong>: Code hosting service</p>
     * </li>
     * <li><p><strong>SystemService</strong>: System service</p>
     * </li>
     * <li><p><strong>Taobao</strong>: Taobao</p>
     * </li>
     * <li><p><strong>Google</strong>: Google</p>
     * </li>
     * <li><p><strong>ThirdPartyService</strong>: Third-party service</p>
     * </li>
     * <li><p><strong>FirstFlow</strong>: First-time access</p>
     * </li>
     * <li><p><strong>Downloader</strong>: Malicious downloader</p>
     * </li>
     * <li><p><strong>Alexa Top 1M</strong>: Popular website</p>
     * </li>
     * <li><p><strong>Miner</strong>: Mining pool</p>
     * </li>
     * <li><p><strong>Intelligence</strong>: Threat intelligence</p>
     * </li>
     * <li><p><strong>DDoS</strong>: DDoS trojan</p>
     * </li>
     * <li><p><strong>Ransomware</strong>: Ransomware</p>
     * </li>
     * <li><p><strong>Spyware</strong>: Spyware</p>
     * </li>
     * <li><p><strong>Rogue</strong>: Rogue software</p>
     * </li>
     * <li><p><strong>Botnet</strong>: Botnet</p>
     * </li>
     * <li><p><strong>Suspicious</strong>: Suspicious website</p>
     * </li>
     * <li><p><strong>C\&amp;C</strong>: Command and control (C\&amp;C)</p>
     * </li>
     * <li><p><strong>Gang</strong>: Gang-related activity</p>
     * </li>
     * <li><p><strong>CVE</strong>: CVE vulnerability</p>
     * </li>
     * <li><p><strong>Backdoor</strong>: Backdoor</p>
     * </li>
     * <li><p><strong>Phishing</strong>: Phishing website</p>
     * </li>
     * <li><p><strong>APT</strong>: Advanced Persistent Threat (APT) attack</p>
     * </li>
     * <li><p><strong>Supply Chain Attack</strong>: Supply chain attack</p>
     * </li>
     * <li><p><strong>Malware</strong>: Malicious software</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliYun</p>
     */
    @NameInMap("TagIdNew")
    public String tagIdNew;

    public static DescribeOutgoingDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainRequest self = new DescribeOutgoingDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDomainRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDomainRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeOutgoingDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeOutgoingDomainRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDomainRequest setIsAITraffic(String isAITraffic) {
        this.isAITraffic = isAITraffic;
        return this;
    }
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    public DescribeOutgoingDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDomainRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDomainRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDomainRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDomainRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDomainRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingDomainRequest setTagIdNew(String tagIdNew) {
        this.tagIdNew = tagIdNew;
        return this;
    }
    public String getTagIdNew() {
        return this.tagIdNew;
    }

}
