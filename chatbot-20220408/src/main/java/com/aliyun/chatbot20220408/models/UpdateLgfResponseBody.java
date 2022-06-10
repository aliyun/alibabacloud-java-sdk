// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateLgfResponseBody extends TeaModel {
    @NameInMap("LgfId")
    public Long lgfId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLgfResponseBody self = new UpdateLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLgfResponseBody setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public UpdateLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
