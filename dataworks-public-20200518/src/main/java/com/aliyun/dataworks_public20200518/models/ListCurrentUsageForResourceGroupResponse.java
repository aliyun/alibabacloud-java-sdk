// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentUsageForResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCurrentUsageForResourceGroupResponseBody body;

    public static ListCurrentUsageForResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentUsageForResourceGroupResponse self = new ListCurrentUsageForResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListCurrentUsageForResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCurrentUsageForResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCurrentUsageForResourceGroupResponse setBody(ListCurrentUsageForResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCurrentUsageForResourceGroupResponseBody getBody() {
        return this.body;
    }

}
