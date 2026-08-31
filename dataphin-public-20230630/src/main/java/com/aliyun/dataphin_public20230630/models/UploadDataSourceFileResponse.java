// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UploadDataSourceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadDataSourceFileResponseBody body;

    public static UploadDataSourceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSourceFileResponse self = new UploadDataSourceFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadDataSourceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDataSourceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDataSourceFileResponse setBody(UploadDataSourceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataSourceFileResponseBody getBody() {
        return this.body;
    }

}
