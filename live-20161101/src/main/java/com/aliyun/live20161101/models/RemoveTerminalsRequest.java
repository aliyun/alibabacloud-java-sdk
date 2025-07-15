// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveTerminalsRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can specify only one application ID in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aec****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel. You can specify only one channel ID in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The IDs of the users that you want to remove.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TerminalIds")
    public java.util.List<String> terminalIds;

    public static RemoveTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTerminalsRequest self = new RemoveTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTerminalsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveTerminalsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RemoveTerminalsRequest setTerminalIds(java.util.List<String> terminalIds) {
        this.terminalIds = terminalIds;
        return this;
    }
    public java.util.List<String> getTerminalIds() {
        return this.terminalIds;
    }

}
