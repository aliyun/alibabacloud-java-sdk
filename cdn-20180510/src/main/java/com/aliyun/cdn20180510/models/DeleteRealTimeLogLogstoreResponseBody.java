// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteRealTimeLogLogstoreResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRealTimeLogLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealTimeLogLogstoreResponseBody self = new DeleteRealTimeLogLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRealTimeLogLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
