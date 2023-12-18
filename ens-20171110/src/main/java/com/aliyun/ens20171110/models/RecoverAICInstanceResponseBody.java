// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RecoverAICInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecoverAICInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverAICInstanceResponseBody self = new RecoverAICInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverAICInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
