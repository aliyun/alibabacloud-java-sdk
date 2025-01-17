// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertMuxConfig extends TeaModel {
    @NameInMap("Segment")
    public MediaConvertSegment segment;

    public static MediaConvertMuxConfig build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertMuxConfig self = new MediaConvertMuxConfig();
        return TeaModel.build(map, self);
    }

    public MediaConvertMuxConfig setSegment(MediaConvertSegment segment) {
        this.segment = segment;
        return this;
    }
    public MediaConvertSegment getSegment() {
        return this.segment;
    }

}
