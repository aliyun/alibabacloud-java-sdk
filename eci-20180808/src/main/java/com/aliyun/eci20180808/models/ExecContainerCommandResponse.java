// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExecContainerCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WebSocketUri")
    @Validation(required = true)
    public String webSocketUri;

    public static ExecContainerCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecContainerCommandResponse self = new ExecContainerCommandResponse();
        return TeaModel.build(map, self);
    }

}
