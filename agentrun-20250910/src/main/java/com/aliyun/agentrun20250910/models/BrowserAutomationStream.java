// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserAutomationStream extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wss://browser-automation.cn-hangzhou.agentrun.aliyuncs.com/stream/bs-1234567890abcdef</p>
     */
    @NameInMap("streamEndpoint")
    public String streamEndpoint;

    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
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
