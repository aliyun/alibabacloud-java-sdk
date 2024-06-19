// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExecContainerCommandResponseBody extends TeaModel {
    /**
     * <p>The HTTP URL. You can use this URL to enter the container within 30 seconds after this operation is called. For more information, see <a href="https://help.aliyun.com/document_detail/202846.html">Use and integrate the Elastic Container Instance terminal</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://eci.console.aliyun.com/terminal?param=X32a">https://eci.console.aliyun.com/terminal?param=X32a</a>****</p>
     */
    @NameInMap("HttpUrl")
    public String httpUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28B583A8-313D-4383-7817-B5A9F7E0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The output of the command. This parameter is returned only if Sync is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
     */
    @NameInMap("SyncResponse")
    public String syncResponse;

    /**
     * <p>The WebSocket URL. You can use this URL to establish a WebSocket connection with the container.</p>
     * 
     * <strong>example:</strong>
     * <p>wss://eci-cn-shanghai.aliyun.com/exec/?s=ktHPx****</p>
     */
    @NameInMap("WebSocketUri")
    public String webSocketUri;

    public static ExecContainerCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecContainerCommandResponseBody self = new ExecContainerCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecContainerCommandResponseBody setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }
    public String getHttpUrl() {
        return this.httpUrl;
    }

    public ExecContainerCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecContainerCommandResponseBody setSyncResponse(String syncResponse) {
        this.syncResponse = syncResponse;
        return this;
    }
    public String getSyncResponse() {
        return this.syncResponse;
    }

    public ExecContainerCommandResponseBody setWebSocketUri(String webSocketUri) {
        this.webSocketUri = webSocketUri;
        return this;
    }
    public String getWebSocketUri() {
        return this.webSocketUri;
    }

}
