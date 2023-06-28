// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class WildcardRule extends TeaModel {
    @NameInMap("match")
    public String match;

    @NameInMap("replacement")
    public String replacement;

    public static WildcardRule build(java.util.Map<String, ?> map) throws Exception {
        WildcardRule self = new WildcardRule();
        return TeaModel.build(map, self);
    }

    public WildcardRule setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public WildcardRule setReplacement(String replacement) {
        this.replacement = replacement;
        return this;
    }
    public String getReplacement() {
        return this.replacement;
    }

}
