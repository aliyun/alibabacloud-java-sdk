// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ActivatePerspectiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ActivatePerspectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivatePerspectiveResponseBody self = new ActivatePerspectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivatePerspectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
