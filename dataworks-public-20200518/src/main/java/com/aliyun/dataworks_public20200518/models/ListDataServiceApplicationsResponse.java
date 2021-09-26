// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataServiceApplicationsResponseBody body;

    public static ListDataServiceApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsResponse self = new ListDataServiceApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApplicationsResponse setBody(ListDataServiceApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApplicationsResponseBody getBody() {
        return this.body;
    }

}
