// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadUnreachableContactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadUnreachableContactsResponseBody body;

    public static DownloadUnreachableContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadUnreachableContactsResponse self = new DownloadUnreachableContactsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadUnreachableContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadUnreachableContactsResponse setBody(DownloadUnreachableContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadUnreachableContactsResponseBody getBody() {
        return this.body;
    }

}
