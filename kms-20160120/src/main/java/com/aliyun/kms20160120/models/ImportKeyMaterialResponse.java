// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportKeyMaterialResponseBody body;

    public static ImportKeyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyMaterialResponse self = new ImportKeyMaterialResponse();
        return TeaModel.build(map, self);
    }

    public ImportKeyMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportKeyMaterialResponse setBody(ImportKeyMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportKeyMaterialResponseBody getBody() {
        return this.body;
    }

}
