// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRecordRequest extends TeaModel {
    /**
     * <p>The domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtain the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English Default: <strong>zh</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line. Default value: <strong>default</strong>. For more information, see</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">DNS resolution lines</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the mail exchanger (MX) record. Valid values: <code>1 to 50</code>.</p>
     * <p>This parameter is required if the type of the DNS record is MX. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The hostname.</p>
     * <p>For example, to resolve @.example.com, you must set this parameter to an at sign (@). You cannot leave this parameter empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The time to live (TTL) period of the Alibaba Cloud DNS (DNS) record. Default value: 600. Unit: seconds. For more information, see</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29806.htm">TTL definition</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("TTL")
    public Long TTL;

    /**
     * <p>The type of the DNS record. For more information, see</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29805.htm">DNS record types</a>.</p>
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
     * <p>192.0.2.0</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The value of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.254</p>
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
