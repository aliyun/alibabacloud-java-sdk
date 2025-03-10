// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DumpMetaListResponseBody body;

    public static DumpMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaListResponse self = new DumpMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DumpMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DumpMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DumpMetaListResponse setBody(DumpMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DumpMetaListResponseBody getBody() {
        return this.body;
    }

}
