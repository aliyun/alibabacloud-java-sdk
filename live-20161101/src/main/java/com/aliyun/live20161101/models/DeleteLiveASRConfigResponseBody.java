// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveASRConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveASRConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveASRConfigResponseBody self = new DeleteLiveASRConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveASRConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
