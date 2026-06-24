// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelLogstashDeletionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23EBF56B-2DC0-4507-8BE5-B87395DB0FEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the instance is successfully resumed. Valid values:</p>
     * <ul>
     * <li>true: The instance is successfully resumed.</li>
     * <li>false: The instance failed to be resumed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
