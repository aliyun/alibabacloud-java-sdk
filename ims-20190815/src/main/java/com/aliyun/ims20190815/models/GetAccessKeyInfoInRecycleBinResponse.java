// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyInfoInRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyInfoInRecycleBinResponseBody body;

    public static GetAccessKeyInfoInRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyInfoInRecycleBinResponse self = new GetAccessKeyInfoInRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyInfoInRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyInfoInRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyInfoInRecycleBinResponse setBody(GetAccessKeyInfoInRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyInfoInRecycleBinResponseBody getBody() {
        return this.body;
    }

}
