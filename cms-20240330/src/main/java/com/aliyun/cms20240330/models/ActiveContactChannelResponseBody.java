// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ActiveContactChannelResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ActiveContactChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveContactChannelResponseBody self = new ActiveContactChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveContactChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
