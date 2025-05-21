// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRecordResponseBody extends TeaModel {
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateRoutineRelatedRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRecordResponseBody self = new CreateRoutineRelatedRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRecordResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
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
