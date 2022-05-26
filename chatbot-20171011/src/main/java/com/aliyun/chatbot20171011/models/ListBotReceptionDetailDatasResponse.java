// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListBotReceptionDetailDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBotReceptionDetailDatasResponseBody body;

    public static ListBotReceptionDetailDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBotReceptionDetailDatasResponse self = new ListBotReceptionDetailDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListBotReceptionDetailDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBotReceptionDetailDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBotReceptionDetailDatasResponse setBody(ListBotReceptionDetailDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBotReceptionDetailDatasResponseBody getBody() {
        return this.body;
    }

}
