// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RealNameVerificationAction")
    public String realNameVerificationAction;

    public static QueryFailReasonForDomainRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForDomainRealNameVerificationRequest self = new QueryFailReasonForDomainRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setRealNameVerificationAction(String realNameVerificationAction) {
        this.realNameVerificationAction = realNameVerificationAction;
        return this;
    }
    public String getRealNameVerificationAction() {
        return this.realNameVerificationAction;
    }

}
