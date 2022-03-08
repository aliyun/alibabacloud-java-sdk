// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateEventDefinitionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEventDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventDefinitionResponseBody self = new UpdateEventDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEventDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
