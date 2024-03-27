// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserUploadFileJobResponseBody body;

    public static GetUserUploadFileJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadFileJobResponse self = new GetUserUploadFileJobResponse();
        return TeaModel.build(map, self);
    }

    public GetUserUploadFileJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserUploadFileJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserUploadFileJobResponse setBody(GetUserUploadFileJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserUploadFileJobResponseBody getBody() {
        return this.body;
    }

}
