// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppsByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAppsByGroupIdResponseBody body;

    public static GetDataServiceAppsByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppsByGroupIdResponse self = new GetDataServiceAppsByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppsByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAppsByGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAppsByGroupIdResponse setBody(GetDataServiceAppsByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAppsByGroupIdResponseBody getBody() {
        return this.body;
    }

}
