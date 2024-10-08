// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteScheduledPreloadJobResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScheduledPreloadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledPreloadJobResponseBody self = new DeleteScheduledPreloadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledPreloadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
