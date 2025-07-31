// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAppGroupsResponseBody body;

    public static GetDataServiceAppGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppGroupsResponse self = new GetDataServiceAppGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAppGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAppGroupsResponse setBody(GetDataServiceAppGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAppGroupsResponseBody getBody() {
        return this.body;
    }

}
