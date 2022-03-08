// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteEventDefinitionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEventDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventDefinitionResponseBody self = new DeleteEventDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
