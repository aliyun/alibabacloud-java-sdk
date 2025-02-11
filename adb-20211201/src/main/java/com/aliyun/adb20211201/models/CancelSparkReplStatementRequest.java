// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSparkReplStatementRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query Spark application IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s202411071444hzdvk486d9d2001****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("SessionId")
    public Long sessionId;

    /**
     * <p>The unique ID of the code block in the Spark job.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("StatementId")
    public Long statementId;

    public static CancelSparkReplStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkReplStatementRequest self = new CancelSparkReplStatementRequest();
        return TeaModel.build(map, self);
    }

    public CancelSparkReplStatementRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CancelSparkReplStatementRequest setSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Long getSessionId() {
        return this.sessionId;
    }

    public CancelSparkReplStatementRequest setStatementId(Long statementId) {
        this.statementId = statementId;
        return this;
    }
    public Long getStatementId() {
        return this.statementId;
    }

}
