// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserLiveViewStream extends TeaModel {
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
