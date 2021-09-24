// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ReturnValue")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> returnValue;

    public static QueryPublicModelEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPublicModelEngineResponse self = new QueryPublicModelEngineResponse();
        return TeaModel.build(map, self);
    }

    public QueryPublicModelEngineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPublicModelEngineResponse setReturnValue(java.util.List<java.util.Map<String, ?>> returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getReturnValue() {
        return this.returnValue;
    }

}
