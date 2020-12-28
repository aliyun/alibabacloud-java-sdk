// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ImportExperimentFromMkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportExperimentFromMkResponseBody body;

    public static ImportExperimentFromMkResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportExperimentFromMkResponse self = new ImportExperimentFromMkResponse();
        return TeaModel.build(map, self);
    }

    public ImportExperimentFromMkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportExperimentFromMkResponse setBody(ImportExperimentFromMkResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportExperimentFromMkResponseBody getBody() {
        return this.body;
    }

}
