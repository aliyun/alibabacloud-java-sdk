// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetNeedUploadFileListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNeedUploadFileListResponseBody body;

    public static GetNeedUploadFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNeedUploadFileListResponse self = new GetNeedUploadFileListResponse();
        return TeaModel.build(map, self);
    }

    public GetNeedUploadFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNeedUploadFileListResponse setBody(GetNeedUploadFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNeedUploadFileListResponseBody getBody() {
        return this.body;
    }

}
