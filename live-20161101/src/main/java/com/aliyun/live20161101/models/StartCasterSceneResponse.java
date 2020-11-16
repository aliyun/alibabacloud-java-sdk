// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterSceneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StreamUrl")
    @Validation(required = true)
    public String streamUrl;

    public static StartCasterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCasterSceneResponse self = new StartCasterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartCasterSceneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCasterSceneResponse setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
        return this;
    }
    public String getStreamUrl() {
        return this.streamUrl;
    }

}
