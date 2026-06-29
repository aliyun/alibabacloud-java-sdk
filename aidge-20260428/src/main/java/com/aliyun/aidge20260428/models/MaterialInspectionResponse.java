// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MaterialInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MaterialInspectionResponseBody body;

    public static MaterialInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialInspectionResponse self = new MaterialInspectionResponse();
        return TeaModel.build(map, self);
    }

    public MaterialInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MaterialInspectionResponse setBody(MaterialInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialInspectionResponseBody getBody() {
        return this.body;
    }

}
