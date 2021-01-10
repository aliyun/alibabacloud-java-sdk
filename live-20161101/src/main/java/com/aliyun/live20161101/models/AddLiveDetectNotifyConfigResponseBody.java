// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDetectNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveDetectNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDetectNotifyConfigResponseBody self = new AddLiveDetectNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveDetectNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
