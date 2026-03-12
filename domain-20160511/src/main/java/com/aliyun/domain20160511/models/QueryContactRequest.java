// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryContactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryContactRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContactRequest self = new QueryContactRequest();
        return TeaModel.build(map, self);
    }

    public QueryContactRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public QueryContactRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryContactRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryContactRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
