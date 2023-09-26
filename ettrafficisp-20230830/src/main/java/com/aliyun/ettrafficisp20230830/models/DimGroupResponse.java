// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class DimGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DimGroupResponseBody body;

    public static DimGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DimGroupResponse self = new DimGroupResponse();
        return TeaModel.build(map, self);
    }

    public DimGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DimGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DimGroupResponse setBody(DimGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DimGroupResponseBody getBody() {
        return this.body;
    }

}
