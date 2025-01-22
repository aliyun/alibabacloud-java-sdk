// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetChannelResponseBody extends TeaModel {
    @NameInMap("Channel")
    public ChannelAssemblyChannel channel;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChannelResponseBody self = new GetChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChannelResponseBody setChannel(ChannelAssemblyChannel channel) {
        this.channel = channel;
        return this;
    }
    public ChannelAssemblyChannel getChannel() {
        return this.channel;
    }

    public GetChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
