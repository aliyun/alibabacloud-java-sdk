// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRemarkRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Remark")
    public String remark;

    public static UpdateDnsCacheDomainRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainRemarkRequest self = new UpdateDnsCacheDomainRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsCacheDomainRemarkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateDnsCacheDomainRemarkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDnsCacheDomainRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
