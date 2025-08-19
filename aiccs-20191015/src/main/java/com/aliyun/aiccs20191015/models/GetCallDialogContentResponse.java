// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCallDialogContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCallDialogContentResponseBody body;

    public static GetCallDialogContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallDialogContentResponse self = new GetCallDialogContentResponse();
        return TeaModel.build(map, self);
    }

    public GetCallDialogContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallDialogContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallDialogContentResponse setBody(GetCallDialogContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallDialogContentResponseBody getBody() {
        return this.body;
    }

}
