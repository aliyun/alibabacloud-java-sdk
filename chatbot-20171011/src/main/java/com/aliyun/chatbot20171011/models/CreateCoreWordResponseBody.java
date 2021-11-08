// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateCoreWordResponseBody extends TeaModel {
    @NameInMap("CoreWordCode")
    public String coreWordCode;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCoreWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCoreWordResponseBody self = new CreateCoreWordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCoreWordResponseBody setCoreWordCode(String coreWordCode) {
        this.coreWordCode = coreWordCode;
        return this;
    }
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

    public CreateCoreWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
