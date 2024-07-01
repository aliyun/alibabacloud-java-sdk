// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryDSRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDSRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDSRecordRequest self = new QueryDSRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryDSRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDSRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDSRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
