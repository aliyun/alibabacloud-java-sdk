// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckJDBCSourceNetConnectionResponseBody extends TeaModel {
    /**
     * <p>Return message: Error message returned when the connection fails, otherwise returns an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>connection timeout</p>
     */
    @NameInMap("ConnectionMessage")
    public String connectionMessage;

    /**
     * <p>Service status:</p>
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
