// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListWillDistributeAdaptorAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListWillDistributeAdaptorAppsResponseBody body;

    public static ListWillDistributeAdaptorAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWillDistributeAdaptorAppsResponse self = new ListWillDistributeAdaptorAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListWillDistributeAdaptorAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWillDistributeAdaptorAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWillDistributeAdaptorAppsResponse setBody(ListWillDistributeAdaptorAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWillDistributeAdaptorAppsResponseBody getBody() {
        return this.body;
    }

}
