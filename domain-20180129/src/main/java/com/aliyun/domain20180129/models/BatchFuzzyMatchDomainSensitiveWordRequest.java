// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class BatchFuzzyMatchDomainSensitiveWordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,aliyundoc.com</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
