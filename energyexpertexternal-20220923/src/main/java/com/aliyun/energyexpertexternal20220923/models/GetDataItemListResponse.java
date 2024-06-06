// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDataItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataItemListResponseBody body;

    public static GetDataItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataItemListResponse self = new GetDataItemListResponse();
        return TeaModel.build(map, self);
    }

    public GetDataItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataItemListResponse setBody(GetDataItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataItemListResponseBody getBody() {
        return this.body;
    }

}
