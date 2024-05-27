// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDomainDnssecStatusRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to set the DNSSEC status.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The DNSSEC status. Valid values:</p>
     * <br>
     * <p>*   ON: enables DNSSEC for the domain name.</p>
     * <p>*   OFF: disables DNSSEC for the domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetDomainDnssecStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainDnssecStatusRequest self = new SetDomainDnssecStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainDnssecStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainDnssecStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDomainDnssecStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
