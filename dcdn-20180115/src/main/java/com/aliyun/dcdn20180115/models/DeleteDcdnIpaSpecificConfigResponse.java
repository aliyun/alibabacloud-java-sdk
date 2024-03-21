// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnIpaSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteDcdnIpaSpecificConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnIpaSpecificConfigResponse setBody(DeleteDcdnIpaSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnIpaSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
