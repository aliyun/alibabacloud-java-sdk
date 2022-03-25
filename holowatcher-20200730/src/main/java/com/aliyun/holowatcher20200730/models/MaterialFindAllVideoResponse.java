// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialFindAllVideoResponseBody body;

    public static MaterialFindAllVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllVideoResponse self = new MaterialFindAllVideoResponse();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialFindAllVideoResponse setBody(MaterialFindAllVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialFindAllVideoResponseBody getBody() {
        return this.body;
    }

}
