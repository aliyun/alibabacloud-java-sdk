// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopNetConnectionResponseBody extends TeaModel {
    /**
     * <p>Return message: Returns error information if the connection fails, otherwise returns an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>connection timeout</p>
     */
    @NameInMap("ConnectionMessage")
    public String connectionMessage;

    /**
     * <p>Connection status:</p>
     * <ul>
     * <li><p>Network connected: Success</p>
     * </li>
     * <li><p>Network not connected: Failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
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
