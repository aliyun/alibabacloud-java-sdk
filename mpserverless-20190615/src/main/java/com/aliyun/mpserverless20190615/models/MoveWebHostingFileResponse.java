// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class MoveWebHostingFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveWebHostingFileResponseBody body;

    public static MoveWebHostingFileResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveWebHostingFileResponse self = new MoveWebHostingFileResponse();
        return TeaModel.build(map, self);
    }

    public MoveWebHostingFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveWebHostingFileResponse setBody(MoveWebHostingFileResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveWebHostingFileResponseBody getBody() {
        return this.body;
    }

}
