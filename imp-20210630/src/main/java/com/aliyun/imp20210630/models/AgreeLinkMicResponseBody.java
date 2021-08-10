// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AgreeLinkMicResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static AgreeLinkMicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgreeLinkMicResponseBody self = new AgreeLinkMicResponseBody();
        return TeaModel.build(map, self);
    }

    public AgreeLinkMicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
