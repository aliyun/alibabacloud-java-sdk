// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSiteMonitorsResponseBody body;

    public static DeleteSiteMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsResponse self = new DeleteSiteMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSiteMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSiteMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSiteMonitorsResponse setBody(DeleteSiteMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSiteMonitorsResponseBody getBody() {
        return this.body;
    }

}
