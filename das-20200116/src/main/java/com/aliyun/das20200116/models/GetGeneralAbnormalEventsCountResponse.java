// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetGeneralAbnormalEventsCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGeneralAbnormalEventsCountResponseBody body;

    public static GetGeneralAbnormalEventsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralAbnormalEventsCountResponse self = new GetGeneralAbnormalEventsCountResponse();
        return TeaModel.build(map, self);
    }

    public GetGeneralAbnormalEventsCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGeneralAbnormalEventsCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGeneralAbnormalEventsCountResponse setBody(GetGeneralAbnormalEventsCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGeneralAbnormalEventsCountResponseBody getBody() {
        return this.body;
    }

}
