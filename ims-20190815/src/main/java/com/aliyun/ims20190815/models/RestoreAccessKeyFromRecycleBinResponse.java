// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RestoreAccessKeyFromRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreAccessKeyFromRecycleBinResponseBody body;

    public static RestoreAccessKeyFromRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreAccessKeyFromRecycleBinResponse self = new RestoreAccessKeyFromRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public RestoreAccessKeyFromRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreAccessKeyFromRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreAccessKeyFromRecycleBinResponse setBody(RestoreAccessKeyFromRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreAccessKeyFromRecycleBinResponseBody getBody() {
        return this.body;
    }

}
