// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateConferenceResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConferenceResponseBody self = new UpdateConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
