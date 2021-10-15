// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateIndexTemplateResponseBody extends TeaModel {
    @NameInMap("Result")
    public String result;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIndexTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexTemplateResponseBody self = new UpdateIndexTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIndexTemplateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public UpdateIndexTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
