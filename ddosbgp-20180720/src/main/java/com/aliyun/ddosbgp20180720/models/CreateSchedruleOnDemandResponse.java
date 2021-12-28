// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CreateSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSchedruleOnDemandResponseBody body;

    public static CreateSchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedruleOnDemandResponse self = new CreateSchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchedruleOnDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchedruleOnDemandResponse setBody(CreateSchedruleOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

}
