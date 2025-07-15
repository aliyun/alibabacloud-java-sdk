// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4C747C97-7ECD-4C61-8A92-67AD806331FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLiveStreamDelayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamDelayConfigResponseBody self = new SetLiveStreamDelayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamDelayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
