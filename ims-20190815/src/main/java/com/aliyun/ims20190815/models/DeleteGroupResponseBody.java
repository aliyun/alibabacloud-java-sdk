// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponseBody self = new DeleteGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
