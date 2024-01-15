// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopsResponseBody self = new DeleteDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
