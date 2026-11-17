// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPRequest extends TeaModel {
    /**
     * <p>The Protocol Type supported by the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>FTP</strong></li>
     * <li><strong>HTTP</strong></li>
     * <li><strong>HTTPS</strong></li>
     * <li><strong>Memcache</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>MQTT</strong></li>
     * <li><strong>MySQL</strong></li>
     * <li><strong>RDP</strong></li>
     * <li><strong>Redis</strong></li>
     * <li><strong>SMTP</strong></li>
     * <li><strong>SMTPS</strong></li>
     * <li><strong>SSH</strong></li>
     * <li><strong>SSL_No_Cert</strong></li>
     * <li><strong>SSL</strong></li>
     * <li><strong>VNC</strong></li>
     * </ul>
     * <blockquote>
     * <p>The valid values of this parameter depend on the value of the Proto parameter. If Proto is set to TCP, ApplicationNameList supports all the preceding Protocol Types. If both ApplicationNameList and ApplicationName are specified, ApplicationNameList takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FTP</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The category ID. Default value: null. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: All categories.</li>
     * <li><strong>RiskDomain</strong>: Risky domain names.</li>
     * <li><strong>RiskIP</strong>: Risky IP addresses.</li>
     * <li><strong>AliYun</strong>: Alibaba Cloud services.</li>
     * <li><strong>NotAliYun</strong>: Non-Alibaba Cloud services.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>Sets the paging settings to specify the page number to return for a paged query.</p>
     * <p>Default value: 1, which means the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The destination IP address of the domain name for outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp accurate to seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656923760</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: Ascending order.</li>
     * <li><strong>desc</strong> (default): Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Sets the paging settings to specify the number of entries to return on each page for a paged query.</p>
     * <p>Default value: 6, which means 6 entries are returned on each page. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the ECS instance that initiates the outbound connection.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The public IP address of the ECS instance that initiates the outbound connection.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>SessionCount</strong> (default): The number of requests.</li>
     * <li><strong>TotalBytes</strong>: The total volume of traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp accurate to seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The intelligence tag ID. Valid values:</p>
     * <ul>
     * <li><strong>AliYun</strong>: Alibaba Cloud services.</li>
     * <li><strong>RiskDomain</strong>: Risky domain names.</li>
     * <li><strong>RiskIP</strong>: Risky IP addresses.</li>
     * <li><strong>TrustedDomain</strong>: Trusted websites.</li>
     * <li><strong>AliPay</strong>: Alipay.</li>
     * <li><strong>DingDing</strong>: DingTalk.</li>
     * <li><strong>WeChat</strong>: WeChat.</li>
     * <li><strong>QQ</strong>: Tencent QQ.</li>
     * <li><strong>SecurityService</strong>: Security services.</li>
     * <li><strong>Microsoft</strong>: Microsoft.</li>
     * <li><strong>Amazon</strong>: Amazon.</li>
     * <li><strong>Pan</strong>: Cloud disks.</li>
     * <li><strong>Map</strong>: Maps.</li>
     * <li><strong>Code</strong>: Code hosting.</li>
     * <li><strong>SystemService</strong>: System services.</li>
     * <li><strong>Taobao</strong>: Taobao.</li>
     * <li><strong>Google</strong>: Google.</li>
     * <li><strong>ThirdPartyService</strong>: Third-party platform services.</li>
     * <li><strong>FirstFlow</strong>: First visit.</li>
     * <li><strong>Downloader</strong>: Malicious download.</li>
     * <li><strong>Alexa Top1M</strong>: Popular website.</li>
     * <li><strong>Miner</strong>: Miner Pool.</li>
     * <li><strong>Intelligence</strong>: Threat intelligence.</li>
     * <li><strong>DDoS</strong>: DDoS Trojan.</li>
     * <li><strong>Ransomware</strong>: Ransomware.</li>
     * <li><strong>Spyware</strong>: Spyware.</li>
     * <li><strong>Rogue</strong>: Rogue software.</li>
     * <li><strong>Botnet</strong>: Botnets.</li>
     * <li><strong>Suspicious</strong>: Suspicious websites.</li>
     * <li><strong>C&amp;C</strong>: Remote control.</li>
     * <li><strong>Gang</strong>: Gangs.</li>
     * <li><strong>CVE</strong>: CVE vulnerabilities.</li>
     * <li><strong>Backdoor</strong>: Backdoor Trojans.</li>
     * <li><strong>Phishing</strong>: Phishing websites.</li>
     * <li><strong>APT</strong>: APT attacks.</li>
     * <li><strong>Supply Chain Attack</strong>: Supply chain attacks.</li>
     * <li><strong>Malicious software</strong>: Malware.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliYun</p>
     */
    @NameInMap("TagIdNew")
    public String tagIdNew;

    public static DescribeOutgoingDestinationIPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPRequest self = new DescribeOutgoingDestinationIPRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DescribeOutgoingDestinationIPRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDestinationIPRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDestinationIPRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeOutgoingDestinationIPRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDestinationIPRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDestinationIPRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDestinationIPRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDestinationIPRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeOutgoingDestinationIPRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeOutgoingDestinationIPRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDestinationIPRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDestinationIPRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingDestinationIPRequest setTagIdNew(String tagIdNew) {
        this.tagIdNew = tagIdNew;
        return this;
    }
    public String getTagIdNew() {
        return this.tagIdNew;
    }

}
