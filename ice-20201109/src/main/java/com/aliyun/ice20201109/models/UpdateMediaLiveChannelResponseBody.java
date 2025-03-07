// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveChannelResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaLiveChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveChannelResponseBody self = new UpdateMediaLiveChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
