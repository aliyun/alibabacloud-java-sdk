// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SessionNetworkHeaderValueReplacement extends TeaModel {
    /**
     * <p>The fake value. A placeholder used by code in the sandbox. The gateway performs an exact substring match on this string within the header value.</p>
     * 
     * <strong>example:</strong>
     * <p>sbx-notion-key-0001</p>
     */
    @NameInMap("placeholder")
    public String placeholder;

    /**
     * <p>The real value. The actual value after the placeholder is replaced.</p>
     * 
     * <strong>example:</strong>
     * <p>ntn_real_secret_xxx</p>
     */
    @NameInMap("value")
    public String value;

    public static SessionNetworkHeaderValueReplacement build(java.util.Map<String, ?> map) throws Exception {
        SessionNetworkHeaderValueReplacement self = new SessionNetworkHeaderValueReplacement();
        return TeaModel.build(map, self);
    }

    public SessionNetworkHeaderValueReplacement setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    public String getPlaceholder() {
        return this.placeholder;
    }

    public SessionNetworkHeaderValueReplacement setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
