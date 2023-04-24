// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataTrackOrderDetailResponseBody body;

    public static GetDataTrackOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackOrderDetailResponse self = new GetDataTrackOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataTrackOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataTrackOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataTrackOrderDetailResponse setBody(GetDataTrackOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataTrackOrderDetailResponseBody getBody() {
        return this.body;
    }

}
