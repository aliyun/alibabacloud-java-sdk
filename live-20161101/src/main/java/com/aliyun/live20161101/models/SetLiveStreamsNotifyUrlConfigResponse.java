// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamsNotifyUrlConfigResponse self = new SetLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamsNotifyUrlConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
