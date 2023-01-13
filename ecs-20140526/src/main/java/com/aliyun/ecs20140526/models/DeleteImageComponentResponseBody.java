// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImageComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImageComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageComponentResponseBody self = new DeleteImageComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
