// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AllocateHostInstanceCrossVpcVipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocateHostInstanceCrossVpcVipResponseBody body;

    public static AllocateHostInstanceCrossVpcVipResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateHostInstanceCrossVpcVipResponse self = new AllocateHostInstanceCrossVpcVipResponse();
        return TeaModel.build(map, self);
    }

    public AllocateHostInstanceCrossVpcVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateHostInstanceCrossVpcVipResponse setBody(AllocateHostInstanceCrossVpcVipResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateHostInstanceCrossVpcVipResponseBody getBody() {
        return this.body;
    }

}
