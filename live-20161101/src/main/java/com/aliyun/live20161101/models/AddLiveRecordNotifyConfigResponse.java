// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordNotifyConfigResponse self = new AddLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
