// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExecContainerCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebSocketUri")
    public String webSocketUri;

    public static ExecContainerCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecContainerCommandResponseBody self = new ExecContainerCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecContainerCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecContainerCommandResponseBody setWebSocketUri(String webSocketUri) {
        this.webSocketUri = webSocketUri;
        return this;
    }
    public String getWebSocketUri() {
        return this.webSocketUri;
    }

}
