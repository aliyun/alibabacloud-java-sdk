// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRelatedRouteResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DeleteRoutineRelatedRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRelatedRouteResponseBody self = new DeleteRoutineRelatedRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRelatedRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRoutineRelatedRouteResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
