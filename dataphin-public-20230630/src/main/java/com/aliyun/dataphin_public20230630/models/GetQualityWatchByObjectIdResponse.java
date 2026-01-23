// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityWatchByObjectIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityWatchByObjectIdResponseBody body;

    public static GetQualityWatchByObjectIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityWatchByObjectIdResponse self = new GetQualityWatchByObjectIdResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityWatchByObjectIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityWatchByObjectIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityWatchByObjectIdResponse setBody(GetQualityWatchByObjectIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityWatchByObjectIdResponseBody getBody() {
        return this.body;
    }

}
