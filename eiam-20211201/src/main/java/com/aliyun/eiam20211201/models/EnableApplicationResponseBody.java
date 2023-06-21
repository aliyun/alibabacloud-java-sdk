// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationResponseBody self = new EnableApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
