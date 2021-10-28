// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ImportAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportAppResponseBody body;

    public static ImportAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAppResponse self = new ImportAppResponse();
        return TeaModel.build(map, self);
    }

    public ImportAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportAppResponse setBody(ImportAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportAppResponseBody getBody() {
        return this.body;
    }

}
