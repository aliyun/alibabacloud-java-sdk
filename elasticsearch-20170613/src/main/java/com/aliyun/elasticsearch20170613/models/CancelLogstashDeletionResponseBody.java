// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelLogstashDeletionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the cluster is restored. Valid values:</p>
     * <br>
     * <p>*   true: The cluster is restored.</p>
     * <p>*   false: The cluster is not restored.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CancelLogstashDeletionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelLogstashDeletionResponseBody self = new CancelLogstashDeletionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelLogstashDeletionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelLogstashDeletionResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
