// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceExceptionsResponseBody extends TeaModel {
    @NameInMap("Exceptions")
    public String exceptions;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceExceptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceExceptionsResponseBody self = new GetInstanceExceptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceExceptionsResponseBody setExceptions(String exceptions) {
        this.exceptions = exceptions;
        return this;
    }
    public String getExceptions() {
        return this.exceptions;
    }

    public GetInstanceExceptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
