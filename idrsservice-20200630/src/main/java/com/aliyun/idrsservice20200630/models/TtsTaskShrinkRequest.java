// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsTaskShrinkRequest extends TeaModel {
    @NameInMap("Request")
    public String requestShrink;

    public static TtsTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TtsTaskShrinkRequest self = new TtsTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TtsTaskShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

}
