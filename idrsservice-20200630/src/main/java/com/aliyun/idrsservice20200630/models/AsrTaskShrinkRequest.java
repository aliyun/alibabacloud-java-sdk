// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrTaskShrinkRequest extends TeaModel {
    @NameInMap("Request")
    public String requestShrink;

    public static AsrTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AsrTaskShrinkRequest self = new AsrTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AsrTaskShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

}
