// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteRegistrantProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRegistrantProfileResponseBody body;

    public static DeleteRegistrantProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrantProfileResponse self = new DeleteRegistrantProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrantProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistrantProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRegistrantProfileResponse setBody(DeleteRegistrantProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistrantProfileResponseBody getBody() {
        return this.body;
    }

}
