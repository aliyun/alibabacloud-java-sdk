// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelDeletionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D682B6B3-B425-46DA-A5FC-5F5C60553622</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the cluster is restored. Valid values:</p>
     * <ul>
     * <li>true: The cluster is restored.</li>
     * <li>false: The cluster fails to be restored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CancelDeletionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDeletionResponseBody self = new CancelDeletionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDeletionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelDeletionResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
