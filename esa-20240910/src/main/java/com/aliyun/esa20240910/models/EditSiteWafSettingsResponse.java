// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EditSiteWafSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditSiteWafSettingsResponseBody body;

    public static EditSiteWafSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        EditSiteWafSettingsResponse self = new EditSiteWafSettingsResponse();
        return TeaModel.build(map, self);
    }

    public EditSiteWafSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditSiteWafSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditSiteWafSettingsResponse setBody(EditSiteWafSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public EditSiteWafSettingsResponseBody getBody() {
        return this.body;
    }

}
