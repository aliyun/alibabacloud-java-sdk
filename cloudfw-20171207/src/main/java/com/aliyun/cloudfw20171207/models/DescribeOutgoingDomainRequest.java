// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainRequest extends TeaModel {
    // The ID of the product category. Default value: empty. Valid values:
    // 
    // -  **All**: All categories.
    // - **RiskDomain**: Risk domain name category.
    // - **RiskIP**: Risk IP category.
    // - **AliYun**: Cloud product category.
    // - **NotAliYun**: Non-Cloud products.
    @NameInMap("CategoryId")
    public String categoryId;

    // The number of the page to return.
    // 
    // Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The domain name in outbound connections.
    @NameInMap("Domain")
    public String domain;

    // The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("EndTime")
    public String endTime;

    // The language of the content within the request. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The order in which you want to sort the queried information. Valid values:
    // 
    // *   **asc**: the ascending order
    // *   **desc**: the descending order. This is the default value.
    @NameInMap("Order")
    public String order;

    // The number of entries to return on each page.
    // 
    // Default value: 6. Maximum value: 100.
    @NameInMap("PageSize")
    public String pageSize;

    // The public IP address of the Elastic Compute Service (ECS) instance that initiates the outbound connection.
    @NameInMap("PublicIP")
    public String publicIP;

    // The field based on which you want to sort the queried information. Valid values:
    // 
    // *   **SessionCount**: the number of requests. This is the default value.
    // *   **TotalBytes**: the total volume of traffic.
    @NameInMap("Sort")
    public String sort;

    // The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("StartTime")
    public String startTime;

    // 情报标签ID。取值：
    // 
    // - **AliYun**：Alibaba cloud products.
    // - **RiskDomain**：The risk domain.
    // - **RiskIP**: The risk IP.
    // - **TrustedDomain**：The trusted domain.
    // - **AliPay**：Alipay
    // - **DingDing**：Ding talk.
    // - **WeChat**：Wechat.
    // - **QQ**：Tencent QQ.
    // - **SecurityService**：The security service.
    // - **Microsoft**：The Microsoft.
    // - **Amazon**：Amazon.
    // - **Pan**：Pan.
    // - **Map**：Map.
    // - **Code**：Code hosting
    // - **SystemService**：System service.
    // - **Taobao**：Taobao.
    // - **Google**：Google.
    // - **ThirdPartyService**：The third party service.
    // - **FirstFlow**：首次
    // - **Downloader**：恶意下载
    // - **Alexa Top1M**：热门网站
    // - **Miner**：矿池
    // - **Intelligence**：威胁情报
    // - **DDoS**：DDoS木马
    // - **Ransomware**：勒索软件
    // - **Spyware**：间谍软件
    // - **Rogue**：流氓软件
    // - **Botnet**：僵尸网络
    // - **Suspicious**：可疑网站
    // - **C&C**：远控
    // - **Gang**：团伙
    // - **CVE**：漏洞CVE
    // - **Backdoor**：木马后门
    // - **Phishing**：钓鱼网站
    // - **APT**：APT攻击
    // - **Supply Chain Attack**：供应链攻击
    // - **Malicious software**：恶意软件
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
