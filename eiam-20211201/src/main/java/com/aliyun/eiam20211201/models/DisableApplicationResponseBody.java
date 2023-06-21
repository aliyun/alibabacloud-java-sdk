// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationResponseBody self = new DisableApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
