// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplSessionRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query all application IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s202411071444hzdvk486d9d200****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the session that executes the code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SessionId")
    public Long sessionId;

    public static GetSparkReplSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkReplSessionRequest self = new GetSparkReplSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkReplSessionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkReplSessionRequest setSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Long getSessionId() {
        return this.sessionId;
    }

}
