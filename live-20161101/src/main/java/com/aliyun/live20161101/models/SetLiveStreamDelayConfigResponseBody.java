// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigResponseBody extends TeaModel {
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
