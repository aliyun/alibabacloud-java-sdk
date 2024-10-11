// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteAdHocFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAdHocFileResponseBody body;

    public static DeleteAdHocFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdHocFileResponse self = new DeleteAdHocFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdHocFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdHocFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdHocFileResponse setBody(DeleteAdHocFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdHocFileResponseBody getBody() {
        return this.body;
    }

}
