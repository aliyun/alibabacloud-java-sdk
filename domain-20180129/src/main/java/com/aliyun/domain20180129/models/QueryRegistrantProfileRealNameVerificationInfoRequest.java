// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("FetchImage")
    public Boolean fetchImage;

    public static QueryRegistrantProfileRealNameVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfileRealNameVerificationInfoRequest self = new QueryRegistrantProfileRealNameVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
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

    public QueryRegistrantProfileRealNameVerificationInfoRequest setFetchImage(Boolean fetchImage) {
        this.fetchImage = fetchImage;
        return this;
    }
    public Boolean getFetchImage() {
        return this.fetchImage;
    }

}
