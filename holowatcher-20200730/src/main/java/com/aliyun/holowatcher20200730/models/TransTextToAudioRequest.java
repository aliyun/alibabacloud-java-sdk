// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class TransTextToAudioRequest extends TeaModel {
    // text
    @NameInMap("Text")
    public String text;

    public static TransTextToAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        TransTextToAudioRequest self = new TransTextToAudioRequest();
        return TeaModel.build(map, self);
    }

    public TransTextToAudioRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
