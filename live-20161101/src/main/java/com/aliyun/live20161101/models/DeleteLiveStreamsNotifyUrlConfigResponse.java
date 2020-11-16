// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamsNotifyUrlConfigResponse self = new DeleteLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
