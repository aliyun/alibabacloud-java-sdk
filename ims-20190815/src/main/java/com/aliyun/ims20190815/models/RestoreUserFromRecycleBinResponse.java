// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RestoreUserFromRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreUserFromRecycleBinResponseBody body;

    public static RestoreUserFromRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreUserFromRecycleBinResponse self = new RestoreUserFromRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public RestoreUserFromRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreUserFromRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreUserFromRecycleBinResponse setBody(RestoreUserFromRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreUserFromRecycleBinResponseBody getBody() {
        return this.body;
    }

}
