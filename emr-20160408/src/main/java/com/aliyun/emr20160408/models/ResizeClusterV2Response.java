// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ResizeClusterV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeClusterV2ResponseBody body;

    public static ResizeClusterV2Response build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterV2Response self = new ResizeClusterV2Response();
        return TeaModel.build(map, self);
    }

    public ResizeClusterV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeClusterV2Response setBody(ResizeClusterV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeClusterV2ResponseBody getBody() {
        return this.body;
    }

}
