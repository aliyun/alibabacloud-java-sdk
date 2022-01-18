// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportServicesResponseBody body;

    public static ImportServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesResponse self = new ImportServicesResponse();
        return TeaModel.build(map, self);
    }

    public ImportServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportServicesResponse setBody(ImportServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportServicesResponseBody getBody() {
        return this.body;
    }

}
