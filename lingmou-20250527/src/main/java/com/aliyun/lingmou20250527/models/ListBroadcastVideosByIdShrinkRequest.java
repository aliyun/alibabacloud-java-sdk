// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastVideosByIdShrinkRequest extends TeaModel {
    @NameInMap("videoIds")
    public String videoIdsShrink;

    public static ListBroadcastVideosByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastVideosByIdShrinkRequest self = new ListBroadcastVideosByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListBroadcastVideosByIdShrinkRequest setVideoIdsShrink(String videoIdsShrink) {
        this.videoIdsShrink = videoIdsShrink;
        return this;
    }
    public String getVideoIdsShrink() {
        return this.videoIdsShrink;
    }

}
