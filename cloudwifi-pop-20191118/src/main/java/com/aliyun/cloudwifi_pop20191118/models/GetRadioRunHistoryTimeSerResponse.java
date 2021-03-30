// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetRadioRunHistoryTimeSerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRadioRunHistoryTimeSerResponseBody body;

    public static GetRadioRunHistoryTimeSerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRadioRunHistoryTimeSerResponse self = new GetRadioRunHistoryTimeSerResponse();
        return TeaModel.build(map, self);
    }

    public GetRadioRunHistoryTimeSerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRadioRunHistoryTimeSerResponse setBody(GetRadioRunHistoryTimeSerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRadioRunHistoryTimeSerResponseBody getBody() {
        return this.body;
    }

}
