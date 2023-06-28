// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InnerRewriteConfig extends TeaModel {
    @NameInMap("regexRules")
    public java.util.List<RewriteRegexRule> regexRules;

    public static InnerRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
        InnerRewriteConfig self = new InnerRewriteConfig();
        return TeaModel.build(map, self);
    }

    public InnerRewriteConfig setRegexRules(java.util.List<RewriteRegexRule> regexRules) {
        this.regexRules = regexRules;
        return this;
    }
    public java.util.List<RewriteRegexRule> getRegexRules() {
        return this.regexRules;
    }

}
