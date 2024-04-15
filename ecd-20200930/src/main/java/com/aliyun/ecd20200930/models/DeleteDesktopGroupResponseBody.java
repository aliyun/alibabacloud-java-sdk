// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDesktopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopGroupResponseBody self = new DeleteDesktopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
