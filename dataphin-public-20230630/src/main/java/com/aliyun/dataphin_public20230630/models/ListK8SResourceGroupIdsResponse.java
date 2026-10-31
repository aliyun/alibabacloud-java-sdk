// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListK8SResourceGroupIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8SResourceGroupIdsResponseBody body;

    public static ListK8SResourceGroupIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8SResourceGroupIdsResponse self = new ListK8SResourceGroupIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListK8SResourceGroupIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8SResourceGroupIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8SResourceGroupIdsResponse setBody(ListK8SResourceGroupIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8SResourceGroupIdsResponseBody getBody() {
        return this.body;
    }

}
