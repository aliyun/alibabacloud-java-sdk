// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoRequest extends TeaModel {
    @NameInMap("FetchImage")
    public Boolean fetchImage;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryRegistrantProfileRealNameVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfileRealNameVerificationInfoRequest self = new QueryRegistrantProfileRealNameVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setFetchImage(Boolean fetchImage) {
        this.fetchImage = fetchImage;
        return this;
    }
    public Boolean getFetchImage() {
        return this.fetchImage;
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
