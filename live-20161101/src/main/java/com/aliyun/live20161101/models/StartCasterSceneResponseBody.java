// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterSceneResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The streaming URL of the scene. It is used for playback, but not for stream relay.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://live/caster/example.org">http://live/caster/example.org</a></p>
     */
    @NameInMap("StreamUrl")
    public String streamUrl;

    public static StartCasterSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCasterSceneResponseBody self = new StartCasterSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCasterSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCasterSceneResponseBody setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
        return this;
    }
    public String getStreamUrl() {
        return this.streamUrl;
    }

}
