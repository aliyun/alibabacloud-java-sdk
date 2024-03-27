// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataTrackJobTableMetaResponseBody body;

    public static GetDataTrackJobTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackJobTableMetaResponse self = new GetDataTrackJobTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetDataTrackJobTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataTrackJobTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataTrackJobTableMetaResponse setBody(GetDataTrackJobTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataTrackJobTableMetaResponseBody getBody() {
        return this.body;
    }

}
