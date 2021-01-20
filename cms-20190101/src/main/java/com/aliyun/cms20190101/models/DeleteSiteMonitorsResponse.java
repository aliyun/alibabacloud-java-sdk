// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteSiteMonitorsResponse setBody(DeleteSiteMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSiteMonitorsResponseBody getBody() {
        return this.body;
    }

}
