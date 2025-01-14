// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EndTerminalSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EndTerminalSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndTerminalSessionResponseBody self = new EndTerminalSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public EndTerminalSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
