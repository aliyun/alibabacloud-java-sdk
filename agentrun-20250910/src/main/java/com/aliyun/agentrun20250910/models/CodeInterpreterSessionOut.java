// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreterSessionOut extends TeaModel {
    /**
     * <p>The Unique Identifier of the associated code interpreter</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("codeInterpreterId")
    public String codeInterpreterId;

    /**
     * <p>The name of the code interpreter session</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <p>The creation time of the code interpreter session, in ISO 8601 format</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The last update time of the code interpreter session, in ISO 8601 format</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The Unique Identifier of the code interpreter session</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The idle timeout duration of the code interpreter session, in seconds. After the instance receives no session requests, it enters an idle state, which is billed under the idle billing model. If the idle duration exceeds this timeout, the session automatically expires and can no longer be used.</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    /**
     * <p>The current status of the code interpreter session</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public String status;

    public static CodeInterpreterSessionOut build(java.util.Map<String, ?> map) throws Exception {
        CodeInterpreterSessionOut self = new CodeInterpreterSessionOut();
        return TeaModel.build(map, self);
    }

    public CodeInterpreterSessionOut setCodeInterpreterId(String codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
        return this;
    }
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
    }

    public CodeInterpreterSessionOut setCodeInterpreterName(String codeInterpreterName) {
        this.codeInterpreterName = codeInterpreterName;
        return this;
    }
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    public CodeInterpreterSessionOut setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CodeInterpreterSessionOut setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public CodeInterpreterSessionOut setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CodeInterpreterSessionOut setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public CodeInterpreterSessionOut setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
