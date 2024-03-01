// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRequest extends TeaModel {
    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The DNS resolution line. Default value: **default**.</p>
     * <br>
     * <p>For more information, see</p>
     * <br>
     * <p>[DNS lines](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm).</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the mail exchanger (MX) record. Valid values: `1 to 50`.</p>
     * <br>
     * <p>This parameter must be specified if the type of the DNS record is MX.</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The hostname.</p>
     * <br>
     * <p>For example, if you want to resolve @.example.com, you must set RR to an at sign (@) instead of leaving it empty.</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The ID of the DNS record.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The time-to-live (TTL) of the DNS record. Default value: 600. Unit: seconds.</p>
     * <br>
     * <p>For more information, see</p>
     * <br>
     * <p>[TTL definition](https://www.alibabacloud.com/help/zh/doc-detail/29806.htm).</p>
     */
    @NameInMap("TTL")
    public Long TTL;

    /**
     * <p>The type of the DNS record. For more information, see</p>
     * <br>
     * <p>[DNS record types](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm).</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The record value.</p>
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
