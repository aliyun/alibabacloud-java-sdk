// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RewriteRegexRule extends TeaModel {
    @NameInMap("regexStr")
    public String regexStr;

    @NameInMap("replacement")
    public String replacement;

    public static RewriteRegexRule build(java.util.Map<String, ?> map) throws Exception {
        RewriteRegexRule self = new RewriteRegexRule();
        return TeaModel.build(map, self);
    }

    public RewriteRegexRule setRegexStr(String regexStr) {
        this.regexStr = regexStr;
        return this;
    }
    public String getRegexStr() {
        return this.regexStr;
    }

    public RewriteRegexRule setReplacement(String replacement) {
        this.replacement = replacement;
        return this;
    }
    public String getReplacement() {
        return this.replacement;
    }

}
