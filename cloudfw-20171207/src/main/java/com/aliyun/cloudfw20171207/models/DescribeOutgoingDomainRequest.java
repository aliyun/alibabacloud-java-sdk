// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainRequest extends TeaModel {
    /**
     * <p>The type of the service. This parameter is empty by default. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all services</li>
     * <li><strong>RiskDomain</strong>: risky domain names</li>
     * <li><strong>RiskIP</strong>: risky IP addresses</li>
     * <li><strong>AliYun</strong>: Alibaba Cloud services</li>
     * <li><strong>NotAliYun</strong>: third-party services</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The number of the page to return.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The domain name in outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IsAITraffic")
    public String isAITraffic;

    /**
     * <p>The language of the content within the request. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The method that is used to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: the ascending order.</li>
     * <li><strong>desc</strong> (default): the descending order.</li>
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
     * <p>The public IP address of the Elastic Compute Service (ECS) instance that initiates outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The field based on which you want to sort the query results. Valid values:</p>
     * <ul>
     * <li><strong>SessionCount</strong> (default): the number of requests.</li>
     * <li><strong>TotalBytes</strong>: the total volume of traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tag. Valid values:</p>
     * <ul>
     * <li><strong>AliYun</strong>: Alibaba Cloud service</li>
     * <li><strong>RiskDomain</strong>: risky domain name</li>
     * <li><strong>RiskIP</strong>: risky IP address</li>
     * <li><strong>TrustedDomain</strong>: trusted website</li>
     * <li><strong>AliPay</strong>: Alipay</li>
     * <li><strong>DingDing</strong>: DingTalk</li>
     * <li><strong>WeChat</strong>: WeChat</li>
     * <li><strong>QQ</strong>: Tencent QQ</li>
     * <li><strong>SecurityService</strong>: security service</li>
     * <li><strong>Microsoft</strong>: Microsoft</li>
     * <li><strong>Amazon</strong>: Amazon Web Services (AWS)</li>
     * <li><strong>Pan</strong>: cloud disk</li>
     * <li><strong>Map</strong>: map</li>
     * <li><strong>Code</strong>: code hosting</li>
     * <li><strong>SystemService</strong>: system service</li>
     * <li><strong>Taobao</strong>: Taobao</li>
     * <li><strong>Google</strong>: Google</li>
     * <li><strong>ThirdPartyService</strong>: third-party service</li>
     * <li><strong>FirstFlow</strong>: the first time when an outbound connection is initiated</li>
     * <li><strong>Downloader</strong>: malicious download</li>
     * <li><strong>Alexa Top1M</strong>: popular website</li>
     * <li><strong>Miner</strong>: mining pool</li>
     * <li><strong>Intelligence</strong>: threat intelligence</li>
     * <li><strong>DDoS</strong>: DDoS trojan</li>
     * <li><strong>Ransomware</strong>: ransomware</li>
     * <li><strong>Spyware</strong>: spyware</li>
     * <li><strong>Rogue</strong>: rogue software</li>
     * <li><strong>Botnet</strong>: botnet</li>
     * <li><strong>Suspicious</strong>: suspicious website</li>
     * <li><strong>C\&amp;C</strong>: command and control (C\&amp;C)</li>
     * <li><strong>Gang</strong>: gang</li>
     * <li><strong>CVE</strong>: Common Vulnerabilities and Exposures (CVE)</li>
     * <li><strong>Backdoor</strong>: webshell</li>
     * <li><strong>Phishing</strong>: phishing website</li>
     * <li><strong>APT</strong>: advanced persistent threat (APT) attack</li>
     * <li><strong>Supply Chain Attack</strong>: supply chain attack</li>
     * <li><strong>Malicious software</strong>: malware</li>
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
