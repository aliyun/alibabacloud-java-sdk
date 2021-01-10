// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveRecordNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordNotifyConfigResponseBody self = new AddLiveRecordNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
