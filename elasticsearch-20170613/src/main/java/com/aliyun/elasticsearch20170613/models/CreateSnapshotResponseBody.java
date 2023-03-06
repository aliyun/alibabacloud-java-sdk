// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: manual snapshot backup successfully</p>
     * <p>*   false: manual snapshot backup failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CreateSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponseBody self = new CreateSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnapshotResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
