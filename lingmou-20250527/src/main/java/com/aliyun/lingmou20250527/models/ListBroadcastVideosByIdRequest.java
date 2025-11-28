// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListBroadcastVideosByIdRequest extends TeaModel {
    @NameInMap("videoIds")
    public java.util.List<String> videoIds;

    public static ListBroadcastVideosByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBroadcastVideosByIdRequest self = new ListBroadcastVideosByIdRequest();
        return TeaModel.build(map, self);
    }

    public ListBroadcastVideosByIdRequest setVideoIds(java.util.List<String> videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public java.util.List<String> getVideoIds() {
        return this.videoIds;
    }

}
