// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line. Default value: <strong>default</strong>.</p>
     * <p>For more information, see</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">DNS resolution lines</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the mail exchanger (MX) record. Valid values: <code>1 to 50</code>.</p>
     * <p>This parameter is required if the type of the DNS record is MX.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The hostname.</p>
     * <p>For example, if you want to resolve @.example.com, you must set RR to an at sign (@) instead of leaving it empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The ID of the Domain Name System (DNS) record.</p>
     * <p>You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9999985</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The time to live (TTL) period of the Alibaba Cloud DNS (DNS) record. Default value: 600. Unit: seconds.</p>
     * <p>For more information, see</p>
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

    public static UpdateDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRequest self = new UpdateDomainRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDomainRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public UpdateDomainRecordRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UpdateDomainRecordRequest setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public UpdateDomainRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDomainRecordRequest setTTL(Long TTL) {
        this.TTL = TTL;
        return this;
    }
    public Long getTTL() {
        return this.TTL;
    }

    public UpdateDomainRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateDomainRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateDomainRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
