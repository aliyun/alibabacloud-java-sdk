// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteApiForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApiForInnerResponseBody body;

    public static DeleteApiForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiForInnerResponse self = new DeleteApiForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiForInnerResponse setBody(DeleteApiForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiForInnerResponseBody getBody() {
        return this.body;
    }

}
