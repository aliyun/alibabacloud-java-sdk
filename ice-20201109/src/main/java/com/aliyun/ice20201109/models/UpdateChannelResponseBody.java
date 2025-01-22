// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateChannelResponseBody extends TeaModel {
    @NameInMap("Channel")
    public ChannelAssemblyChannel channel;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelResponseBody self = new UpdateChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChannelResponseBody setChannel(ChannelAssemblyChannel channel) {
        this.channel = channel;
        return this;
    }
    public ChannelAssemblyChannel getChannel() {
        return this.channel;
    }

    public UpdateChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
