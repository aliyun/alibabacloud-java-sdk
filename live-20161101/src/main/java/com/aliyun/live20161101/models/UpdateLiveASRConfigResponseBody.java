// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveASRConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveASRConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveASRConfigResponseBody self = new UpdateLiveASRConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveASRConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
