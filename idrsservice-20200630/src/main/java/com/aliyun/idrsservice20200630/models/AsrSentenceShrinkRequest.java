// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrSentenceShrinkRequest extends TeaModel {
    @NameInMap("AsrRequest")
    public String asrRequestShrink;

    public static AsrSentenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AsrSentenceShrinkRequest self = new AsrSentenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AsrSentenceShrinkRequest setAsrRequestShrink(String asrRequestShrink) {
        this.asrRequestShrink = asrRequestShrink;
        return this;
    }
    public String getAsrRequestShrink() {
        return this.asrRequestShrink;
    }

}
