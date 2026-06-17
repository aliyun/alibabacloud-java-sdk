// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPRequest extends TeaModel {
    /**
     * <p>The application type supported by the access control policy.</p>
     * <ul>
     * <li><p><strong>FTP</strong></p>
     * </li>
     * <li><p><strong>HTTP</strong></p>
     * </li>
     * <li><p><strong>HTTPS</strong></p>
     * </li>
     * <li><p><strong>Memcache</strong></p>
     * </li>
     * <li><p><strong>MongoDB</strong></p>
     * </li>
     * <li><p><strong>MQTT</strong></p>
     * </li>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>RDP</strong></p>
     * </li>
     * <li><p><strong>Redis</strong></p>
     * </li>
     * <li><p><strong>SMTP</strong></p>
     * </li>
     * <li><p><strong>SMTPS</strong></p>
     * </li>
     * <li><p><strong>SSH</strong></p>
     * </li>
     * <li><p><strong>SSL_No_Cert</strong></p>
     * </li>
     * <li><p><strong>SSL</strong></p>
     * </li>
     * <li><p><strong>VNC</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The supported application types depend on the protocol type specified in the Proto parameter. If Proto is set to TCP, all application types listed above are supported. If both ApplicationName and ApplicationNameList are specified, the value of ApplicationNameList takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FTP</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The ID of the service category. Valid values:</p>
     * <ul>
     * <li><p><strong>All</strong>: all categories</p>
     * </li>
     * <li><p><strong>RiskDomain</strong>: risk domains</p>
     * </li>
     * <li><p><strong>RiskIP</strong>: risk IPs</p>
     * </li>
     * <li><p><strong>AliYun</strong>: Alibaba Cloud services</p>
     * </li>
     * <li><p><strong>NotAliYun</strong>: services other than Alibaba Cloud services</p>
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
     * <p>The destination IP address of the outbound connection.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The end of the time range to query. The value is a timestamp in seconds.</p>
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
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
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
     * <li><p><strong>asc</strong>: ascending order.</p>
     * </li>
     * <li><p><strong>desc</strong> (default): descending order.</p>
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
     * <p>Default value: 6. Maximum value: 10.</p>
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
     * <li><p><strong>SessionCount</strong> (default): request count.</p>
     * </li>
     * <li><p><strong>TotalBytes</strong>: total traffic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start of the time range to query. The value is a timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the threat intelligence tag. Valid values:</p>
     * <ul>
     * <li><p><strong>AliYun</strong>: Alibaba Cloud service</p>
     * </li>
     * <li><p><strong>RiskDomain</strong>: risk domain</p>
     * </li>
     * <li><p><strong>RiskIP</strong>: risk IP</p>
     * </li>
     * <li><p><strong>TrustedDomain</strong>: trusted website</p>
     * </li>
     * <li><p><strong>AliPay</strong>: Alipay</p>
     * </li>
     * <li><p><strong>DingDing</strong>: DingTalk</p>
     * </li>
     * <li><p><strong>WeChat</strong>: WeChat</p>
     * </li>
     * <li><p><strong>QQ</strong>: Tencent QQ</p>
     * </li>
     * <li><p><strong>SecurityService</strong>: security service</p>
     * </li>
     * <li><p><strong>Microsoft</strong>: Microsoft</p>
     * </li>
     * <li><p><strong>Amazon</strong>: Amazon</p>
     * </li>
     * <li><p><strong>Pan</strong>: cloud drive</p>
     * </li>
     * <li><p><strong>Map</strong>: map</p>
     * </li>
     * <li><p><strong>Code</strong>: code hosting</p>
     * </li>
     * <li><p><strong>SystemService</strong>: system service</p>
     * </li>
     * <li><p><strong>Taobao</strong>: Taobao</p>
     * </li>
     * <li><p><strong>Google</strong>: Google</p>
     * </li>
     * <li><p><strong>ThirdPartyService</strong>: third-party service</p>
     * </li>
     * <li><p><strong>FirstFlow</strong>: first access</p>
     * </li>
     * <li><p><strong>Downloader</strong>: malicious downloader</p>
     * </li>
     * <li><p><strong>Alexa Top1M</strong>: popular website</p>
     * </li>
     * <li><p><strong>Miner</strong>: mining pool</p>
     * </li>
     * <li><p><strong>Intelligence</strong>: threat intelligence</p>
     * </li>
     * <li><p><strong>DDoS</strong>: DDoS trojan</p>
     * </li>
     * <li><p><strong>Ransomware</strong>: ransomware</p>
     * </li>
     * <li><p><strong>Spyware</strong>: spyware</p>
     * </li>
     * <li><p><strong>Rogue</strong>: rogue software</p>
     * </li>
     * <li><p><strong>Botnet</strong>: botnet</p>
     * </li>
     * <li><p><strong>Suspicious</strong>: suspicious website</p>
     * </li>
     * <li><p><strong>C\&amp;C</strong>: command and control (C\&amp;C)</p>
     * </li>
     * <li><p><strong>Gang</strong>: threat actor group</p>
     * </li>
     * <li><p><strong>CVE</strong>: CVE</p>
     * </li>
     * <li><p><strong>Backdoor</strong>: backdoor</p>
     * </li>
     * <li><p><strong>Phishing</strong>: phishing website</p>
     * </li>
     * <li><p><strong>APT</strong>: APT attack</p>
     * </li>
     * <li><p><strong>Supply Chain Attack</strong>: supply chain attack</p>
     * </li>
     * <li><p><strong>Malicious software</strong>: malware</p>
     * </li>
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
