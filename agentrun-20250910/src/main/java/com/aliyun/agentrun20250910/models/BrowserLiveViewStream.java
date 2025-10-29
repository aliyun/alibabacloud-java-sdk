// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserLiveViewStream extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wss://browser-liveview.cn-hangzhou.agentrun.aliyuncs.com/stream/bs-1234567890abcdef</p>
     */
    @NameInMap("streamEndpoint")
    public String streamEndpoint;

    public static BrowserLiveViewStream build(java.util.Map<String, ?> map) throws Exception {
        BrowserLiveViewStream self = new BrowserLiveViewStream();
        return TeaModel.build(map, self);
    }

    public BrowserLiveViewStream setStreamEndpoint(String streamEndpoint) {
        this.streamEndpoint = streamEndpoint;
        return this;
    }
    public String getStreamEndpoint() {
        return this.streamEndpoint;
    }

}
