// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfResponseBody extends TeaModel {
    // LGF ID
    @NameInMap("LgfId")
    public Long lgfId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLgfResponseBody self = new CreateLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLgfResponseBody setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public CreateLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
