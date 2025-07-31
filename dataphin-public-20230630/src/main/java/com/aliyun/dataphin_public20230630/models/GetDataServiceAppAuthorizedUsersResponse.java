// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppAuthorizedUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAppAuthorizedUsersResponseBody body;

    public static GetDataServiceAppAuthorizedUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppAuthorizedUsersResponse self = new GetDataServiceAppAuthorizedUsersResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppAuthorizedUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAppAuthorizedUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAppAuthorizedUsersResponse setBody(GetDataServiceAppAuthorizedUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAppAuthorizedUsersResponseBody getBody() {
        return this.body;
    }

}
