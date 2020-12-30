// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListScalingActivityV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScalingActivityV2ResponseBody body;

    public static ListScalingActivityV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListScalingActivityV2Response self = new ListScalingActivityV2Response();
        return TeaModel.build(map, self);
    }

    public ListScalingActivityV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScalingActivityV2Response setBody(ListScalingActivityV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScalingActivityV2ResponseBody getBody() {
        return this.body;
    }

}
