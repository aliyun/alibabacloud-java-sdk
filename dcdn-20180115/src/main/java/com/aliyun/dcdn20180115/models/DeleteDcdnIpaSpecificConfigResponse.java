// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnIpaSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDcdnIpaSpecificConfigResponseBody body;

    public static DeleteDcdnIpaSpecificConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnIpaSpecificConfigResponse self = new DeleteDcdnIpaSpecificConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnIpaSpecificConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnIpaSpecificConfigResponse setBody(DeleteDcdnIpaSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnIpaSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
