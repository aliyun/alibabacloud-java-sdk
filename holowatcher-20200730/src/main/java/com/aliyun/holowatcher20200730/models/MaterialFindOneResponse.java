// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialFindOneResponseBody body;

    public static MaterialFindOneResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindOneResponse self = new MaterialFindOneResponse();
        return TeaModel.build(map, self);
    }

    public MaterialFindOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialFindOneResponse setBody(MaterialFindOneResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialFindOneResponseBody getBody() {
        return this.body;
    }

}
