// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsCommonShrinkRequest extends TeaModel {
    @NameInMap("TtsRequest")
    public String ttsRequestShrink;

    public static TtsCommonShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TtsCommonShrinkRequest self = new TtsCommonShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TtsCommonShrinkRequest setTtsRequestShrink(String ttsRequestShrink) {
        this.ttsRequestShrink = ttsRequestShrink;
        return this;
    }
    public String getTtsRequestShrink() {
        return this.ttsRequestShrink;
    }

}
