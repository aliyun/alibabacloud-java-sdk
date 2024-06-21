// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumUploadFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumUploadFilesResponseBody body;

    public static GetRumUploadFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumUploadFilesResponse self = new GetRumUploadFilesResponse();
        return TeaModel.build(map, self);
    }

    public GetRumUploadFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumUploadFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumUploadFilesResponse setBody(GetRumUploadFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumUploadFilesResponseBody getBody() {
        return this.body;
    }

}
