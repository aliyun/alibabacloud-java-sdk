// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryDomainRealNameVerificationInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FetchImage")
    public Boolean fetchImage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainRealNameVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealNameVerificationInfoRequest self = new QueryDomainRealNameVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealNameVerificationInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainRealNameVerificationInfoRequest setFetchImage(Boolean fetchImage) {
        this.fetchImage = fetchImage;
        return this;
    }
    public Boolean getFetchImage() {
        return this.fetchImage;
    }

    public QueryDomainRealNameVerificationInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDomainRealNameVerificationInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
