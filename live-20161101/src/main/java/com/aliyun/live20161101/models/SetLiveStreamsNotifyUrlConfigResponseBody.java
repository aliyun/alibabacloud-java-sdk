// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetLiveStreamsNotifyUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamsNotifyUrlConfigResponseBody self = new SetLiveStreamsNotifyUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamsNotifyUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
