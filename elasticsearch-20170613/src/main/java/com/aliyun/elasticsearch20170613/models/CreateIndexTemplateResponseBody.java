// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateIndexTemplateResponseBody extends TeaModel {
    @NameInMap("Result")
    public String result;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIndexTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexTemplateResponseBody self = new CreateIndexTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIndexTemplateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateIndexTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
