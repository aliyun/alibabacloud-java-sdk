// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamDelayConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetLiveStreamDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamDelayConfigResponse self = new SetLiveStreamDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamDelayConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
