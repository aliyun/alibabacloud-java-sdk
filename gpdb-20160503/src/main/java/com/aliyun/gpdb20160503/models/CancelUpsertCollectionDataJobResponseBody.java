// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CancelUpsertCollectionDataJobResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CancelUpsertCollectionDataJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelUpsertCollectionDataJobResponseBody self = new CancelUpsertCollectionDataJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelUpsertCollectionDataJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelUpsertCollectionDataJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelUpsertCollectionDataJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
