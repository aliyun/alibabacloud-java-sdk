// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadCcWhiteBlackListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadCcWhiteBlackListResponseBody body;

    public static UploadCcWhiteBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCcWhiteBlackListResponse self = new UploadCcWhiteBlackListResponse();
        return TeaModel.build(map, self);
    }

    public UploadCcWhiteBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCcWhiteBlackListResponse setBody(UploadCcWhiteBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCcWhiteBlackListResponseBody getBody() {
        return this.body;
    }

}
