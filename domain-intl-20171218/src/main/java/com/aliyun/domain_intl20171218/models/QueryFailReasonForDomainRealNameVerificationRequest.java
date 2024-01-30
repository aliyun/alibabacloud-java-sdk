// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RealNameVerificationAction")
    public String realNameVerificationAction;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryFailReasonForDomainRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForDomainRealNameVerificationRequest self = new QueryFailReasonForDomainRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setRealNameVerificationAction(String realNameVerificationAction) {
        this.realNameVerificationAction = realNameVerificationAction;
        return this;
    }
    public String getRealNameVerificationAction() {
        return this.realNameVerificationAction;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
