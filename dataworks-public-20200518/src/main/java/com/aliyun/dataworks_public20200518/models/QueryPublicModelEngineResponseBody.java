// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
