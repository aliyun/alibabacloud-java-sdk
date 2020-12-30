// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SaveStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveStatsResponseBody body;

    public static SaveStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveStatsResponse self = new SaveStatsResponse();
        return TeaModel.build(map, self);
    }

    public SaveStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveStatsResponse setBody(SaveStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveStatsResponseBody getBody() {
        return this.body;
    }

}
