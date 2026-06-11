// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class LabelMatcher extends TeaModel {
    /**
     * <p>The label key to match.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The label value to match.</p>
     */
    @NameInMap("value")
    public String value;

    public static LabelMatcher build(java.util.Map<String, ?> map) throws Exception {
        LabelMatcher self = new LabelMatcher();
        return TeaModel.build(map, self);
    }

    public LabelMatcher setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public LabelMatcher setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
