// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EqualRule extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/old</p>
     */
    @NameInMap("match")
    public String match;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/new</p>
     */
    @NameInMap("replacement")
    public String replacement;

    public static EqualRule build(java.util.Map<String, ?> map) throws Exception {
        EqualRule self = new EqualRule();
        return TeaModel.build(map, self);
    }

    public EqualRule setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public EqualRule setReplacement(String replacement) {
        this.replacement = replacement;
        return this;
    }
    public String getReplacement() {
        return this.replacement;
    }

}
