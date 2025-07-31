// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceProjectAddableUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceProjectAddableUsersResponseBody body;

    public static GetDataServiceProjectAddableUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceProjectAddableUsersResponse self = new GetDataServiceProjectAddableUsersResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceProjectAddableUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceProjectAddableUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceProjectAddableUsersResponse setBody(GetDataServiceProjectAddableUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceProjectAddableUsersResponseBody getBody() {
        return this.body;
    }

}
