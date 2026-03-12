// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryDomainBySaleIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainBySaleIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainBySaleIdRequest self = new QueryDomainBySaleIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainBySaleIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDomainBySaleIdRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public QueryDomainBySaleIdRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
