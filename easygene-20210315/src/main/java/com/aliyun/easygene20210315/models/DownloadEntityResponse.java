// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DownloadEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadEntityResponseBody body;

    public static DownloadEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadEntityResponse self = new DownloadEntityResponse();
        return TeaModel.build(map, self);
    }

    public DownloadEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadEntityResponse setBody(DownloadEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadEntityResponseBody getBody() {
        return this.body;
    }

}
