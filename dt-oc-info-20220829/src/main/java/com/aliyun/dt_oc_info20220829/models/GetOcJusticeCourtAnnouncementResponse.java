// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeCourtAnnouncementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeCourtAnnouncementResponseBody body;

    public static GetOcJusticeCourtAnnouncementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeCourtAnnouncementResponse self = new GetOcJusticeCourtAnnouncementResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeCourtAnnouncementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeCourtAnnouncementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeCourtAnnouncementResponse setBody(GetOcJusticeCourtAnnouncementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeCourtAnnouncementResponseBody getBody() {
        return this.body;
    }

}
