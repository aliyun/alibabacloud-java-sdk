// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreterSessionOut extends TeaModel {
    /**
     * <p>关联的代码解释器的唯一标识符</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("codeInterpreterId")
    public String codeInterpreterId;

    /**
     * <p>代码解释器会话的名称</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <p>代码解释器会话的创建时间，采用ISO 8601格式</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>代码解释器会话的最后更新时间，采用ISO 8601格式</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>代码解释器会话的唯一标识符</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>代码解释器会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    /**
     * <p>代码解释器会话的当前状态</p>
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
