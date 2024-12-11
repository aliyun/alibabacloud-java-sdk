// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplStatementRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>s202411071444hzdvk486d9d200****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SessionId")
    public Long sessionId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("StatementId")
    public Long statementId;

    public static GetSparkReplStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkReplStatementRequest self = new GetSparkReplStatementRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkReplStatementRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkReplStatementRequest setSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Long getSessionId() {
        return this.sessionId;
    }

    public GetSparkReplStatementRequest setStatementId(Long statementId) {
        this.statementId = statementId;
        return this;
    }
    public Long getStatementId() {
        return this.statementId;
    }

}
