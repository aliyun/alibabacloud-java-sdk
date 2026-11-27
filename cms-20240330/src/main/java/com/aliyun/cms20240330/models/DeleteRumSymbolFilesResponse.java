// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteRumSymbolFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRumSymbolFilesResponseBody body;

    public static DeleteRumSymbolFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRumSymbolFilesResponse self = new DeleteRumSymbolFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRumSymbolFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRumSymbolFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRumSymbolFilesResponse setBody(DeleteRumSymbolFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRumSymbolFilesResponseBody getBody() {
        return this.body;
    }

}
