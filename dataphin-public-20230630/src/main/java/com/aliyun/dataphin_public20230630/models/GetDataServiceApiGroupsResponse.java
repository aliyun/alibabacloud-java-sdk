// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApiGroupsResponseBody body;

    public static GetDataServiceApiGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiGroupsResponse self = new GetDataServiceApiGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiGroupsResponse setBody(GetDataServiceApiGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiGroupsResponseBody getBody() {
        return this.body;
    }

}
