// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSceneItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelSceneItemDetailResponseBody body;

    public static GetHotelSceneItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSceneItemDetailResponse self = new GetHotelSceneItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelSceneItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelSceneItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelSceneItemDetailResponse setBody(GetHotelSceneItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelSceneItemDetailResponseBody getBody() {
        return this.body;
    }

}
