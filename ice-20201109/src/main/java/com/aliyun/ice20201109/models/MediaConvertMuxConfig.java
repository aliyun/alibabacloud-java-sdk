// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertMuxConfig extends TeaModel {
    /**
     * <p>Shard configuration field. For more information, see Segment details.</p>
     * <p>This field takes effect only when Container is set to m3u8, hls-fmp4, mpd, or cmaf.</p>
     */
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
