// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EmptySlsLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EmptySlsLogstoreResponseBody self = new EmptySlsLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public EmptySlsLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
