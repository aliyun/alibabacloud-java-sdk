// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line. The default value is <strong>default</strong>.
     * For more information, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/29807.html">Enumeration of resolution lines</a>.
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/doc-detail/29807.htm">Enumeration of resolution lines</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the MX record. Valid values: <code>[1, 50]</code>.</p>
     * <p>This parameter is required if the record type is MX.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The host record.
     * To resolve the root domain, such as example.com, set the host record to the at sign (@).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>@</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The ID of the DNS record. To obtain the ID, call the <a href="https://help.aliyun.com/document_detail/2357159.html">DescribeDomainRecords</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>99*******</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The time to live (TTL). The default value is 600 seconds (10 minutes).
     * For more information, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/29806.html">TTL definition</a>.
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/doc-detail/29806.htm">TTL definition</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("TTL")
    public Long TTL;

    /**
     * <p>The type of the DNS record. For more information, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/29805.html">DNS record types</a>.
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/doc-detail/29805.htm">DNS record types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The client IP address.</p>
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
     * <p>192.0.2.1</p>
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
