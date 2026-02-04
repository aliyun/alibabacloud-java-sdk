// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastAudiosByIdShrinkRequest extends TeaModel {
    @NameInMap("audioIds")
    public String audioIdsShrink;

    public static ListBroadcastAudiosByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastAudiosByIdShrinkRequest self = new ListBroadcastAudiosByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListBroadcastAudiosByIdShrinkRequest setAudioIdsShrink(String audioIdsShrink) {
        this.audioIdsShrink = audioIdsShrink;
        return this;
    }
    public String getAudioIdsShrink() {
        return this.audioIdsShrink;
    }

}
