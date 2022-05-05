// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteCmsExporterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCmsExporterResponseBody body;

    public static DeleteCmsExporterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCmsExporterResponse self = new DeleteCmsExporterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCmsExporterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCmsExporterResponse setBody(DeleteCmsExporterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCmsExporterResponseBody getBody() {
        return this.body;
    }

}
