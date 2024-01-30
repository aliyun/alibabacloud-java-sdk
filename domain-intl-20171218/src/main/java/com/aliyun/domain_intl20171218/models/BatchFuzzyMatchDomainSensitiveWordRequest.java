// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class BatchFuzzyMatchDomainSensitiveWordRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static BatchFuzzyMatchDomainSensitiveWordRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchFuzzyMatchDomainSensitiveWordRequest self = new BatchFuzzyMatchDomainSensitiveWordRequest();
        return TeaModel.build(map, self);
    }

    public BatchFuzzyMatchDomainSensitiveWordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public BatchFuzzyMatchDomainSensitiveWordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BatchFuzzyMatchDomainSensitiveWordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
