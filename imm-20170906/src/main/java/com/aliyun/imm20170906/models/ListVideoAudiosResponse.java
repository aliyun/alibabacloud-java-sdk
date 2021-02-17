// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoAudiosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVideoAudiosResponseBody body;

    public static ListVideoAudiosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVideoAudiosResponse self = new ListVideoAudiosResponse();
        return TeaModel.build(map, self);
    }

    public ListVideoAudiosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVideoAudiosResponse setBody(ListVideoAudiosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVideoAudiosResponseBody getBody() {
        return this.body;
    }

}
