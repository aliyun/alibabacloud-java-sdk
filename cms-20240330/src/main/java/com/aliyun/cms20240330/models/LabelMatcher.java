// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class LabelMatcher extends TeaModel {
    /**
     * <p>The key name of the label matcher. This parameter specifies the label dimension identity to match.</p>
     * 
     * <strong>example:</strong>
     * <p>_cms_workspace</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The match value of the label matcher. This parameter is used together with key to specify the value that the label key must match.</p>
     * 
     * <strong>example:</strong>
     * <p>test-123</p>
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
