// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRepoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: reference warehouse deleted successfully</p>
     * <p>*   false: reference warehouse deleted successfully failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteSnapshotRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRepoResponseBody self = new DeleteSnapshotRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSnapshotRepoResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
