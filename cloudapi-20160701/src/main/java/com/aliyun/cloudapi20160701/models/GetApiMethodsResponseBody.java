// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class GetApiMethodsResponseBody extends TeaModel {
    @NameInMap("Methods")
    public java.util.List<String> methods;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApiMethodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiMethodsResponseBody self = new GetApiMethodsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiMethodsResponseBody setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    public GetApiMethodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
