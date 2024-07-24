// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class DeleteSnapshotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16484F36-A2A3-5A05-B242-0BF2BF6AA326</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static DeleteSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotResponseBody self = new DeleteSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSnapshotResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
