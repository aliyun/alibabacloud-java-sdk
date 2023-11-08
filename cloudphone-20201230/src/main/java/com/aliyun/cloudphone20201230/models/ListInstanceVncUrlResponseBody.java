// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstanceVncUrlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Virtual Network Computing (VNC) connection URL.</p>
     */
    @NameInMap("VncUrl")
    public String vncUrl;

    /**
     * <p>The token that is used for WebRTC logon.</p>
     */
    @NameInMap("WebRtcToken")
    public String webRtcToken;

    public static ListInstanceVncUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceVncUrlResponseBody self = new ListInstanceVncUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceVncUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceVncUrlResponseBody setVncUrl(String vncUrl) {
        this.vncUrl = vncUrl;
        return this;
    }
    public String getVncUrl() {
        return this.vncUrl;
    }

    public ListInstanceVncUrlResponseBody setWebRtcToken(String webRtcToken) {
        this.webRtcToken = webRtcToken;
        return this;
    }
    public String getWebRtcToken() {
        return this.webRtcToken;
    }

}
