// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ScheduleKeyDeletionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3da5b8cc-8107-40ac-a170-793cd181d7b7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScheduleKeyDeletionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScheduleKeyDeletionResponseBody self = new ScheduleKeyDeletionResponseBody();
        return TeaModel.build(map, self);
    }

    public ScheduleKeyDeletionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
