// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveSynonymResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSynonymResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSynonymResponseBody self = new RemoveSynonymResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSynonymResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
