// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    public static DescribeDomainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoRequest self = new DescribeDomainInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeDomainInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainInfoRequest setNeedDetailAttributes(Boolean needDetailAttributes) {
        this.needDetailAttributes = needDetailAttributes;
        return this;
    }
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

}
