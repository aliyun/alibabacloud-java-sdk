// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveIndexResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopLiveIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveIndexResponse self = new StopLiveIndexResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveIndexResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
