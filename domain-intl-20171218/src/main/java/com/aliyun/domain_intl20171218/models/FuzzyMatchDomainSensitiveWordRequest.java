// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class FuzzyMatchDomainSensitiveWordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static FuzzyMatchDomainSensitiveWordRequest build(java.util.Map<String, ?> map) throws Exception {
        FuzzyMatchDomainSensitiveWordRequest self = new FuzzyMatchDomainSensitiveWordRequest();
        return TeaModel.build(map, self);
    }

    public FuzzyMatchDomainSensitiveWordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public FuzzyMatchDomainSensitiveWordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public FuzzyMatchDomainSensitiveWordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
