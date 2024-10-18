// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRecordResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateRoutineRelatedRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRecordResponseBody self = new CreateRoutineRelatedRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoutineRelatedRecordResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
