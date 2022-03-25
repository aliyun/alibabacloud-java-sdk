// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialGetOssCreadentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialGetOssCreadentialsResponseBody body;

    public static MaterialGetOssCreadentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialGetOssCreadentialsResponse self = new MaterialGetOssCreadentialsResponse();
        return TeaModel.build(map, self);
    }

    public MaterialGetOssCreadentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialGetOssCreadentialsResponse setBody(MaterialGetOssCreadentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialGetOssCreadentialsResponseBody getBody() {
        return this.body;
    }

}
