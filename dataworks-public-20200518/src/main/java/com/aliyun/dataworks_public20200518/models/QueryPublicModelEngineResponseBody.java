// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CFB2DED-7D9B-4C42-B4AA-CFF4991DFFF4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned information about objects.</p>
     */
    @NameInMap("ReturnValue")
    public java.util.List<java.util.Map<String, ?>> returnValue;

    public static QueryPublicModelEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPublicModelEngineResponseBody self = new QueryPublicModelEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPublicModelEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPublicModelEngineResponseBody setReturnValue(java.util.List<java.util.Map<String, ?>> returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getReturnValue() {
        return this.returnValue;
    }

}
