// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeCourtNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeCourtNoticeResponseBody body;

    public static GetOcJusticeCourtNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeCourtNoticeResponse self = new GetOcJusticeCourtNoticeResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeCourtNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeCourtNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeCourtNoticeResponse setBody(GetOcJusticeCourtNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeCourtNoticeResponseBody getBody() {
        return this.body;
    }

}
