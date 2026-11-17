// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeChannelQrCodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuntimeChannelQrCodeDetailResponseBody body;

    public static GetRuntimeChannelQrCodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeChannelQrCodeDetailResponse self = new GetRuntimeChannelQrCodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetRuntimeChannelQrCodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuntimeChannelQrCodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuntimeChannelQrCodeDetailResponse setBody(GetRuntimeChannelQrCodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuntimeChannelQrCodeDetailResponseBody getBody() {
        return this.body;
    }

}
