// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeletePluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePluginResponseBody body;

    public static DeletePluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginResponse self = new DeletePluginResponse();
        return TeaModel.build(map, self);
    }

    public DeletePluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePluginResponse setBody(DeletePluginResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePluginResponseBody getBody() {
        return this.body;
    }

}
