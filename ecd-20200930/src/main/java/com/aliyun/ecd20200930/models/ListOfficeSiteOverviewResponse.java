// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOfficeSiteOverviewResponseBody body;

    public static ListOfficeSiteOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteOverviewResponse self = new ListOfficeSiteOverviewResponse();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfficeSiteOverviewResponse setBody(ListOfficeSiteOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfficeSiteOverviewResponseBody getBody() {
        return this.body;
    }

}
