// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteConferenceResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConferenceResponseBody self = new DeleteConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
