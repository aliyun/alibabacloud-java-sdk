// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveASRConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveASRConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveASRConfigResponse self = new DeleteLiveASRConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveASRConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
