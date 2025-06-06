// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateConnectionResponseBody extends TeaModel {
    /**
     * <p>The connection ID.</p>
     * 
     * <strong>example:</strong>
     * <p>conn-pai9m***mi47</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionResponseBody self = new CreateConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConnectionResponseBody setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public CreateConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
