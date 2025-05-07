// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class RecordClickLinkActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecordClickLinkActionResponseBody body;

    public static RecordClickLinkActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordClickLinkActionResponse self = new RecordClickLinkActionResponse();
        return TeaModel.build(map, self);
    }

    public RecordClickLinkActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordClickLinkActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordClickLinkActionResponse setBody(RecordClickLinkActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordClickLinkActionResponseBody getBody() {
        return this.body;
    }

}
