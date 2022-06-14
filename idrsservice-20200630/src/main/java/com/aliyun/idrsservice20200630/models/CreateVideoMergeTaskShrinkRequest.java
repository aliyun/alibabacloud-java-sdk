// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskShrinkRequest extends TeaModel {
    @NameInMap("VideoMergeRequest")
    public String videoMergeRequestShrink;

    public static CreateVideoMergeTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoMergeTaskShrinkRequest self = new CreateVideoMergeTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoMergeTaskShrinkRequest setVideoMergeRequestShrink(String videoMergeRequestShrink) {
        this.videoMergeRequestShrink = videoMergeRequestShrink;
        return this;
    }
    public String getVideoMergeRequestShrink() {
        return this.videoMergeRequestShrink;
    }

}
