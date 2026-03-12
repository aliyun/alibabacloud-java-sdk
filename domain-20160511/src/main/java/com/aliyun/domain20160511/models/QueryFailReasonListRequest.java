// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryFailReasonListRequest extends TeaModel {
    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryFailReasonListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonListRequest self = new QueryFailReasonListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonListRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public QueryFailReasonListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryFailReasonListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryFailReasonListRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public QueryFailReasonListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
