// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserStreams extends TeaModel {
    @NameInMap("automationStream")
    public BrowserAutomationStream automationStream;

    @NameInMap("liveViewStream")
    public BrowserLiveViewStream liveViewStream;

    public static BrowserStreams build(java.util.Map<String, ?> map) throws Exception {
        BrowserStreams self = new BrowserStreams();
        return TeaModel.build(map, self);
    }

    public BrowserStreams setAutomationStream(BrowserAutomationStream automationStream) {
        this.automationStream = automationStream;
        return this;
    }
    public BrowserAutomationStream getAutomationStream() {
        return this.automationStream;
    }

    public BrowserStreams setLiveViewStream(BrowserLiveViewStream liveViewStream) {
        this.liveViewStream = liveViewStream;
        return this;
    }
    public BrowserLiveViewStream getLiveViewStream() {
        return this.liveViewStream;
    }

}
