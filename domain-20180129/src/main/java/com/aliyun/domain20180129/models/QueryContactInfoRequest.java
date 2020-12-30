// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryContactInfoRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ContactType")
    public String contactType;

    public static QueryContactInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContactInfoRequest self = new QueryContactInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryContactInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryContactInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryContactInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryContactInfoRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

}
