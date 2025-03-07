// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartMediaLiveChannelRequest extends TeaModel {
    /**
     * <p>The ID of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    public static StartMediaLiveChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMediaLiveChannelRequest self = new StartMediaLiveChannelRequest();
        return TeaModel.build(map, self);
    }

    public StartMediaLiveChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
