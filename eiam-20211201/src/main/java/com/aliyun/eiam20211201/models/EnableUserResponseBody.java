// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableUserResponseBody self = new EnableUserResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
