// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteWafSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteWafSettingsResponseBody body;

    public static GetSiteWafSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteWafSettingsResponse self = new GetSiteWafSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteWafSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteWafSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteWafSettingsResponse setBody(GetSiteWafSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteWafSettingsResponseBody getBody() {
        return this.body;
    }

}
