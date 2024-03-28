// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWebHostingFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebHostingFileResponseBody body;

    public static DeleteWebHostingFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebHostingFileResponse self = new DeleteWebHostingFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebHostingFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebHostingFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebHostingFileResponse setBody(DeleteWebHostingFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebHostingFileResponseBody getBody() {
        return this.body;
    }

}
