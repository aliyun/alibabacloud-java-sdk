// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_user_001</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>test_user_001</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1751595283143</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>1751595283143</p>
     */
    @NameInMap("expirationDate")
    public String expirationDate;

    /**
     * <strong>example:</strong>
     * <p>019ca1e5-7307-7d50-b943-5e628326a8ed</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("immutable")
    public String immutable;

    /**
     * <strong>example:</strong>
     * <p>My name is Zhang San and I live in Hangzhou.</p>
     */
    @NameInMap("memory")
    public String memory;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
     */
    @NameInMap("metadata")
    public String metadata;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("organization")
    public String organization;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>test_user_001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>1744428159434</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <strong>example:</strong>
     * <p>test_user_001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryResponseBody self = new GetMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public GetMemoryResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMemoryResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetMemoryResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public GetMemoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetMemoryResponseBody setImmutable(String immutable) {
        this.immutable = immutable;
        return this;
    }
    public String getImmutable() {
        return this.immutable;
    }

    public GetMemoryResponseBody setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public GetMemoryResponseBody setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public GetMemoryResponseBody setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    public String getOrganization() {
        return this.organization;
    }

    public GetMemoryResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetMemoryResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public GetMemoryResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
