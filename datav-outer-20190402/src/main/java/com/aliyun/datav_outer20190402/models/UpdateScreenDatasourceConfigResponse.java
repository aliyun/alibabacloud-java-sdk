// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class UpdateScreenDatasourceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScreenDatasourceConfigResponseBody body;

    public static UpdateScreenDatasourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScreenDatasourceConfigResponse self = new UpdateScreenDatasourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScreenDatasourceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScreenDatasourceConfigResponse setBody(UpdateScreenDatasourceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScreenDatasourceConfigResponseBody getBody() {
        return this.body;
    }

}
