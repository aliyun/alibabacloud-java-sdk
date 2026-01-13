// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ManageSearchAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperationResult body;

    public static ManageSearchAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageSearchAccountInfoResponse self = new ManageSearchAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public ManageSearchAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageSearchAccountInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageSearchAccountInfoResponse setBody(OperationResult body) {
        this.body = body;
        return this;
    }
    public OperationResult getBody() {
        return this.body;
    }

}
