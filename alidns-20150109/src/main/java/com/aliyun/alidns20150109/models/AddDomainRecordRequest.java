// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordRequest extends TeaModel {
    /**
     * <p>The domain name. Call the <a href="https://www.alibabacloud.com/help/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to query the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English
     * The default value is <strong>zh</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The DNS resolution line. The default value is <strong>default</strong>. For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/29807.htm">DNS resolution lines</a>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29807.html">Resolution line enumeration</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">Resolution Line Enumeration</a></p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the MX record. Valid values: <code>[1,50]</code>.</p>
     * <p>This parameter is required if the record type is MX. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The host record.</p>
     * <p>To resolve example.com, set the host record to &quot;@&quot; instead of leaving it empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The time to live (TTL) value of the Domain Name System (DNS) record. Default value: 600. Unit: seconds. For more information, see the following topic:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29806.html">TTL overview</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The time to live (TTL) of the DNS record. The default value is 600 seconds. For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/29806.htm">TTL</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("TTL")
    public Long TTL;

    /**
     * <p>The type of the DNS record. For more information, see</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29805.html">DNS record type format</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The type of the DNS record. For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/29805.htm">DNS record types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The record value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("Value")
    public String value;

    public static AddDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRecordRequest self = new AddDomainRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDomainRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public AddDomainRecordRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public AddDomainRecordRequest setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public AddDomainRecordRequest setTTL(Long TTL) {
        this.TTL = TTL;
        return this;
    }
    public Long getTTL() {
        return this.TTL;
    }

    public AddDomainRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddDomainRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public AddDomainRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
