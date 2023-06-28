// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RegexRule extends TeaModel {
    @NameInMap("match")
    public String match;

    @NameInMap("replacement")
    public String replacement;

    public static RegexRule build(java.util.Map<String, ?> map) throws Exception {
        RegexRule self = new RegexRule();
        return TeaModel.build(map, self);
    }

    public RegexRule setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public RegexRule setReplacement(String replacement) {
        this.replacement = replacement;
        return this;
    }
    public String getReplacement() {
        return this.replacement;
    }

}
