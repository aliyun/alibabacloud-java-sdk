// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdatePerspectiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePerspectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePerspectiveResponseBody self = new UpdatePerspectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePerspectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
