// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteSubDomainRecordsRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The host record.</p>
     * <p>For example, to resolve @.example.com, you must set RR to an at sign (@) instead of leaving it blank.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The type of the DNS record. If you do not specify this parameter, all DNS record types corresponding to the subdomain name are returned.</p>
     * <p>DNS record types include <strong>A, MX, CNAME, TXT, REDIRECT_URL, FORWORD_URL, NS, AAAA, and SRV</strong>. The value is not case-sensitive.</p>
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

    public static DeleteSubDomainRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubDomainRecordsRequest self = new DeleteSubDomainRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubDomainRecordsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteSubDomainRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSubDomainRecordsRequest setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public DeleteSubDomainRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteSubDomainRecordsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
