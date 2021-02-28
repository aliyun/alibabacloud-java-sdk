// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AddSynonymResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddSynonymResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSynonymResponseBody self = new AddSynonymResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSynonymResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
