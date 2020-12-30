// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChartReleaseResponseBody body;

    public static DeleteChartReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartReleaseResponse self = new DeleteChartReleaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChartReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChartReleaseResponse setBody(DeleteChartReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChartReleaseResponseBody getBody() {
        return this.body;
    }

}
