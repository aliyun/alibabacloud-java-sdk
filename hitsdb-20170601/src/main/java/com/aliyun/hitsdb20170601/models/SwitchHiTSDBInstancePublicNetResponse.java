// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class SwitchHiTSDBInstancePublicNetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchHiTSDBInstancePublicNetResponseBody body;

    public static SwitchHiTSDBInstancePublicNetResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchHiTSDBInstancePublicNetResponse self = new SwitchHiTSDBInstancePublicNetResponse();
        return TeaModel.build(map, self);
    }

    public SwitchHiTSDBInstancePublicNetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchHiTSDBInstancePublicNetResponse setBody(SwitchHiTSDBInstancePublicNetResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchHiTSDBInstancePublicNetResponseBody getBody() {
        return this.body;
    }

}
