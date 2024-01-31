// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateK8sClusterUserConfigExpireResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static UpdateK8sClusterUserConfigExpireResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sClusterUserConfigExpireResponse self = new UpdateK8sClusterUserConfigExpireResponse();
        return TeaModel.build(map, self);
    }

    public UpdateK8sClusterUserConfigExpireResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateK8sClusterUserConfigExpireResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
