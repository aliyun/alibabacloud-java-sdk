// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopChannelRequest extends TeaModel {
    /**
     * <p>The name of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    public static StopChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        StopChannelRequest self = new StopChannelRequest();
        return TeaModel.build(map, self);
    }

    public StopChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
