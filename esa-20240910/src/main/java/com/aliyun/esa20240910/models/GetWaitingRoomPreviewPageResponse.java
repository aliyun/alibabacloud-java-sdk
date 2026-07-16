// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWaitingRoomPreviewPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWaitingRoomPreviewPageResponseBody body;

    public static GetWaitingRoomPreviewPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWaitingRoomPreviewPageResponse self = new GetWaitingRoomPreviewPageResponse();
        return TeaModel.build(map, self);
    }

    public GetWaitingRoomPreviewPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWaitingRoomPreviewPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWaitingRoomPreviewPageResponse setBody(GetWaitingRoomPreviewPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWaitingRoomPreviewPageResponseBody getBody() {
        return this.body;
    }

}
