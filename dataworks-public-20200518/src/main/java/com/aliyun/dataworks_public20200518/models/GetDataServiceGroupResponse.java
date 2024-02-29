// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceGroupResponseBody body;

    public static GetDataServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceGroupResponse self = new GetDataServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceGroupResponse setBody(GetDataServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceGroupResponseBody getBody() {
        return this.body;
    }

}
