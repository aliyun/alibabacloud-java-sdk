// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionsForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetAccessPermissionsForInnerResponseBody body;

    public static SetAccessPermissionsForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionsForInnerResponse self = new SetAccessPermissionsForInnerResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionsForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessPermissionsForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessPermissionsForInnerResponse setBody(SetAccessPermissionsForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessPermissionsForInnerResponseBody getBody() {
        return this.body;
    }

}
