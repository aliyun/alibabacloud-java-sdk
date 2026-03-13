// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RewriteConfig extends TeaModel {
    /**
     * <p>The exact match rules.</p>
     */
    @NameInMap("equalRules")
    public java.util.List<EqualRule> equalRules;

    /**
     * <p>The regex matching rules.</p>
     */
    @NameInMap("regexRules")
    public java.util.List<RegexRule> regexRules;

    /**
     * <p>The wildcard matching rules.</p>
     */
    @NameInMap("wildcardRules")
    public java.util.List<WildcardRule> wildcardRules;

    public static RewriteConfig build(java.util.Map<String, ?> map) throws Exception {
        RewriteConfig self = new RewriteConfig();
        return TeaModel.build(map, self);
    }

    public RewriteConfig setEqualRules(java.util.List<EqualRule> equalRules) {
        this.equalRules = equalRules;
        return this;
    }
    public java.util.List<EqualRule> getEqualRules() {
        return this.equalRules;
    }

    public RewriteConfig setRegexRules(java.util.List<RegexRule> regexRules) {
        this.regexRules = regexRules;
        return this;
    }
    public java.util.List<RegexRule> getRegexRules() {
        return this.regexRules;
    }

    public RewriteConfig setWildcardRules(java.util.List<WildcardRule> wildcardRules) {
        this.wildcardRules = wildcardRules;
        return this;
    }
    public java.util.List<WildcardRule> getWildcardRules() {
        return this.wildcardRules;
    }

}
