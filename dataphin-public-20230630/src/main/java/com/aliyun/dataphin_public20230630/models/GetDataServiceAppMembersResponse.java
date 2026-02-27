// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAppMembersResponseBody body;

    public static GetDataServiceAppMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppMembersResponse self = new GetDataServiceAppMembersResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAppMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAppMembersResponse setBody(GetDataServiceAppMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAppMembersResponseBody getBody() {
        return this.body;
    }

}
