// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckJDBCSourceNetConnectionResponseBody extends TeaModel {
    /**
     * <p>The returned message. If the connection failed, an error message is returned. Otherwise, a pair of double quotation marks (&quot;&quot;) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ConnectionMessage")
    public String connectionMessage;

    /**
     * <p>The connection status. Valid values:</p>
     * <ul>
     * <li>Success</li>
     * <li>Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <p>The request ID.</p>
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
