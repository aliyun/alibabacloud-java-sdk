// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeleteConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A5152937-1C8A-5260-90FA-520CEF028D2D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionResponseBody self = new DeleteConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
