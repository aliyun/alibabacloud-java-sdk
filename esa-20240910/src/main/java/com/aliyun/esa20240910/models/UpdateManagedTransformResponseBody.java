// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateManagedTransformResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateManagedTransformResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedTransformResponseBody self = new UpdateManagedTransformResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateManagedTransformResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
