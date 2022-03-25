// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunMainJwtCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AliyunMainJwtCreateResponseBody body;

    public static AliyunMainJwtCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        AliyunMainJwtCreateResponse self = new AliyunMainJwtCreateResponse();
        return TeaModel.build(map, self);
    }

    public AliyunMainJwtCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AliyunMainJwtCreateResponse setBody(AliyunMainJwtCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public AliyunMainJwtCreateResponseBody getBody() {
        return this.body;
    }

}
