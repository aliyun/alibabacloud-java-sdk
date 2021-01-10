// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
