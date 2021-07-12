// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateServiceEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceEntryResponseBody body;

    public static CreateServiceEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEntryResponse self = new CreateServiceEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceEntryResponse setBody(CreateServiceEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceEntryResponseBody getBody() {
        return this.body;
    }

}
