// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StartAvatarSessionResponseBody extends TeaModel {
    @NameInMap("channelToken")
    public String channelToken;

    /**
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>121dlsga4o7golrl1hoja</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static StartAvatarSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAvatarSessionResponseBody self = new StartAvatarSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAvatarSessionResponseBody setChannelToken(String channelToken) {
        this.channelToken = channelToken;
        return this;
    }
    public String getChannelToken() {
        return this.channelToken;
    }

    public StartAvatarSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartAvatarSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
