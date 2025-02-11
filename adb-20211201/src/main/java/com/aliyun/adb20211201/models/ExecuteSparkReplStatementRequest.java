// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSparkReplStatementRequest extends TeaModel {
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
     * <p>The code that you want to execute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>print(1+1)</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The language type of the code. Valid values:</p>
     * <ul>
     * <li>SCALA</li>
     * <li>PYTHON</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON</p>
     */
    @NameInMap("CodeType")
    public String codeType;

    /**
     * <p>The ID of the session that you want to use to execute the code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SessionId")
    public Long sessionId;

    public static ExecuteSparkReplStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkReplStatementRequest self = new ExecuteSparkReplStatementRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkReplStatementRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecuteSparkReplStatementRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteSparkReplStatementRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public ExecuteSparkReplStatementRequest setSessionId(Long sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public Long getSessionId() {
        return this.sessionId;
    }

}
