// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterInstalledServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterInstalledServiceResponseBody body;

    public static ListClusterInstalledServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInstalledServiceResponse self = new ListClusterInstalledServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterInstalledServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterInstalledServiceResponse setBody(ListClusterInstalledServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterInstalledServiceResponseBody getBody() {
        return this.body;
    }

}
