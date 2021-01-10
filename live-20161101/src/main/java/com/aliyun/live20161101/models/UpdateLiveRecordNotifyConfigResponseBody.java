// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveRecordNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordNotifyConfigResponseBody self = new UpdateLiveRecordNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
