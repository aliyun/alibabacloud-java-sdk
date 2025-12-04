// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteDataEventSelectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataEventSelectorResponseBody body;

    public static DeleteDataEventSelectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataEventSelectorResponse self = new DeleteDataEventSelectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataEventSelectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataEventSelectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataEventSelectorResponse setBody(DeleteDataEventSelectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataEventSelectorResponseBody getBody() {
        return this.body;
    }

}
