// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RecordCallCenterEventForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecordCallCenterEventForPartnerResponseBody body;

    public static RecordCallCenterEventForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        RecordCallCenterEventForPartnerResponse self = new RecordCallCenterEventForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public RecordCallCenterEventForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecordCallCenterEventForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecordCallCenterEventForPartnerResponse setBody(RecordCallCenterEventForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public RecordCallCenterEventForPartnerResponseBody getBody() {
        return this.body;
    }

}
