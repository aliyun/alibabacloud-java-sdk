// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class AgraphSearchServiceSgVpcPreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AgraphSearchServiceSgVpcPreResponseBody body;

    public static AgraphSearchServiceSgVpcPreResponse build(java.util.Map<String, ?> map) throws Exception {
        AgraphSearchServiceSgVpcPreResponse self = new AgraphSearchServiceSgVpcPreResponse();
        return TeaModel.build(map, self);
    }

    public AgraphSearchServiceSgVpcPreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgraphSearchServiceSgVpcPreResponse setBody(AgraphSearchServiceSgVpcPreResponseBody body) {
        this.body = body;
        return this;
    }
    public AgraphSearchServiceSgVpcPreResponseBody getBody() {
        return this.body;
    }

}
