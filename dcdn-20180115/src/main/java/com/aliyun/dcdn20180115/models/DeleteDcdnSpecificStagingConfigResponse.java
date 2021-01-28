// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSpecificStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDcdnSpecificStagingConfigResponseBody body;

    public static DeleteDcdnSpecificStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSpecificStagingConfigResponse self = new DeleteDcdnSpecificStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSpecificStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnSpecificStagingConfigResponse setBody(DeleteDcdnSpecificStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnSpecificStagingConfigResponseBody getBody() {
        return this.body;
    }

}
