// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPRequest extends TeaModel {
    /**
     * <p>The application type in the access control policy. Valid values:</p>
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
     * <p> The value of this parameter depends on the value of Proto. If you set Proto to TCP, you can set ApplicationNameList to any valid value. If you specify both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FTP</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The ID of the service to which the destination IP address belongs. This parameter is left empty by default. Valid values:</p>
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

    /**
     * <p>The destination IP address in the outbound connection that is initiated to access a domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656923760</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The method that you want to use to sort the query results. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong></li>
     * <li><strong>desc</strong> (default)</li>
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
     * <p>The public IP address of the Elastic Compute Service (ECS) instance that initiates the outbound connection.</p>
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
     * <p>1656837360</p>
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
     * <li><strong>FirstFlow</strong>: the first time</li>
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
