// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class FuzzyMatchDomainSensitiveWordRequest extends TeaModel {
    /**
     * <p>The domain name keyword (a term contained in the domain name excluding its suffix). Separate multiple keywords with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx**</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the error message returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese  </li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The User IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
