// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentUsageForResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListCurrentUsageForResourceGroupResponse setBody(ListCurrentUsageForResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCurrentUsageForResourceGroupResponseBody getBody() {
        return this.body;
    }

}
