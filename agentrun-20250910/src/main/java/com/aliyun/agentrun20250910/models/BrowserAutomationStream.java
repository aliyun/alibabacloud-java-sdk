// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserAutomationStream extends TeaModel {
    @NameInMap("streamEndpoint")
    public String streamEndpoint;

    @NameInMap("streamStatus")
    public String streamStatus;

    public static BrowserAutomationStream build(java.util.Map<String, ?> map) throws Exception {
        BrowserAutomationStream self = new BrowserAutomationStream();
        return TeaModel.build(map, self);
    }

    public BrowserAutomationStream setStreamEndpoint(String streamEndpoint) {
        this.streamEndpoint = streamEndpoint;
        return this;
    }
    public String getStreamEndpoint() {
        return this.streamEndpoint;
    }

    public BrowserAutomationStream setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
        return this;
    }
    public String getStreamStatus() {
        return this.streamStatus;
    }

}
