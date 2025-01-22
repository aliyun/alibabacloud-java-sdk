// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateChannelResponseBody extends TeaModel {
    @NameInMap("Channel")
    public ChannelAssemblyChannel channel;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelResponseBody self = new CreateChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChannelResponseBody setChannel(ChannelAssemblyChannel channel) {
        this.channel = channel;
        return this;
    }
    public ChannelAssemblyChannel getChannel() {
        return this.channel;
    }

    public CreateChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
