// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopNetConnectionResponseBody extends TeaModel {
    @NameInMap("ConnectionMessage")
    public String connectionMessage;

    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckHadoopNetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckHadoopNetConnectionResponseBody self = new CheckHadoopNetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckHadoopNetConnectionResponseBody setConnectionMessage(String connectionMessage) {
        this.connectionMessage = connectionMessage;
        return this;
    }
    public String getConnectionMessage() {
        return this.connectionMessage;
    }

    public CheckHadoopNetConnectionResponseBody setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public CheckHadoopNetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
