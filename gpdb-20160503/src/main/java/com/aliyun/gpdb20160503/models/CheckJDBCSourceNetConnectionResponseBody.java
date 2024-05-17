// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckJDBCSourceNetConnectionResponseBody extends TeaModel {
    @NameInMap("ConnectionMessage")
    public String connectionMessage;

    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckJDBCSourceNetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckJDBCSourceNetConnectionResponseBody self = new CheckJDBCSourceNetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckJDBCSourceNetConnectionResponseBody setConnectionMessage(String connectionMessage) {
        this.connectionMessage = connectionMessage;
        return this;
    }
    public String getConnectionMessage() {
        return this.connectionMessage;
    }

    public CheckJDBCSourceNetConnectionResponseBody setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public CheckJDBCSourceNetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
