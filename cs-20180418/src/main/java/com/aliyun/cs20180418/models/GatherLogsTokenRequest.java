// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class GatherLogsTokenRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static GatherLogsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GatherLogsTokenRequest self = new GatherLogsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GatherLogsTokenRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
