// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddSnapshotRepoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: Reference warehouse created successfully</p>
     * <p>*   false: Reference warehouse created failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static AddSnapshotRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSnapshotRepoResponseBody self = new AddSnapshotRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSnapshotRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSnapshotRepoResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
