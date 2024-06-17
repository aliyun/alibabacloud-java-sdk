// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("text")
    public Text text;

    public static TextResult build(java.util.Map<String, ?> map) throws Exception {
        TextResult self = new TextResult();
        return TeaModel.build(map, self);
    }

    public TextResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextResult setText(Text text) {
        this.text = text;
        return this;
    }
    public Text getText() {
        return this.text;
    }

}
