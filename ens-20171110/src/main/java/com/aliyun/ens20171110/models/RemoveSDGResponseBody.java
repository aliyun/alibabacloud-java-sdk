// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGResponseBody self = new RemoveSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
