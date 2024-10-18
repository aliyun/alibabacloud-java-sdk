// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRouteResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateRoutineRelatedRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRouteResponseBody self = new CreateRoutineRelatedRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoutineRelatedRouteResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
