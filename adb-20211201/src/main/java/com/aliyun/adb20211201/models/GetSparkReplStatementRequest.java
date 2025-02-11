// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplStatementRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query Spark application IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s202411071444hzdvk486d9d200****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the session that executes the code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
