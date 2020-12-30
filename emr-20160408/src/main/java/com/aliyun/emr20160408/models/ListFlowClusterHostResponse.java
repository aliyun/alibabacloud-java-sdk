// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowClusterHostResponseBody body;

    public static ListFlowClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterHostResponse self = new ListFlowClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowClusterHostResponse setBody(ListFlowClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowClusterHostResponseBody getBody() {
        return this.body;
    }

}
