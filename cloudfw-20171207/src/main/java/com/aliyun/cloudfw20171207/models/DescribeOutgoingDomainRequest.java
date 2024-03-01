// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainRequest extends TeaModel {
    /**
     * <p>The type of the service. This parameter is empty by default. Valid values:</p>
     * <br>
     * <p>*   **All**: all services</p>
     * <p>*   **RiskDomain**: risky domain names</p>
     * <p>*   **RiskIP**: risky IP addresses</p>
     * <p>*   **AliYun**: Alibaba Cloud services</p>
     * <p>*   **NotAliYun**: third-party services</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The domain name in outbound connections.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content within the request. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The method that is used to sort the results. Valid values:</p>
     * <br>
     * <p>*   **asc**: the ascending order.</p>
     * <p>*   **desc** (default): the descending order.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 6. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The public IP address of the Elastic Compute Service (ECS) instance that initiates outbound connections.</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The field based on which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   **SessionCount** (default): the number of requests.</p>
     * <p>*   **TotalBytes**: the total volume of traffic.</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the tag. Valid values:</p>
     * <br>
     * <p>*   **AliYun**: Alibaba Cloud service</p>
     * <p>*   **RiskDomain**: risky domain name</p>
     * <p>*   **RiskIP**: risky IP address</p>
     * <p>*   **TrustedDomain**: trusted website</p>
     * <p>*   **AliPay**: Alipay</p>
     * <p>*   **DingDing**: DingTalk</p>
     * <p>*   **WeChat**: WeChat</p>
     * <p>*   **QQ**: Tencent QQ</p>
     * <p>*   **SecurityService**: security service</p>
     * <p>*   **Microsoft**: Microsoft</p>
     * <p>*   **Amazon**: Amazon Web Services (AWS)</p>
     * <p>*   **Pan**: cloud disk</p>
     * <p>*   **Map**: map</p>
     * <p>*   **Code**: code hosting</p>
     * <p>*   **SystemService**: system service</p>
     * <p>*   **Taobao**: Taobao</p>
     * <p>*   **Google**: Google</p>
     * <p>*   **ThirdPartyService**: third-party service</p>
     * <p>*   **FirstFlow**: the first time when an outbound connection is initiated</p>
     * <p>*   **Downloader**: malicious download</p>
     * <p>*   **Alexa Top1M**: popular website</p>
     * <p>*   **Miner**: mining pool</p>
     * <p>*   **Intelligence**: threat intelligence</p>
     * <p>*   **DDoS**: DDoS trojan</p>
     * <p>*   **Ransomware**: ransomware</p>
     * <p>*   **Spyware**: spyware</p>
     * <p>*   **Rogue**: rogue software</p>
     * <p>*   **Botnet**: botnet</p>
     * <p>*   **Suspicious**: suspicious website</p>
     * <p>*   **C\&C**: command and control (C\&C)</p>
     * <p>*   **Gang**: gang</p>
     * <p>*   **CVE**: Common Vulnerabilities and Exposures (CVE)</p>
     * <p>*   **Backdoor**: webshell</p>
     * <p>*   **Phishing**: phishing website</p>
     * <p>*   **APT**: advanced persistent threat (APT) attack</p>
     * <p>*   **Supply Chain Attack**: supply chain attack</p>
     * <p>*   **Malicious software**: malware</p>
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
