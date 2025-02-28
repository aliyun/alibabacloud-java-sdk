// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RetrieveRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("cancelledAt")
    public Long cancelledAt;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("createAt")
    public Long createAt;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("expiresAt")
    public Long expiresAt;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("failedAt")
    public Long failedAt;

    /**
     * <strong>example:</strong>
     * <p>runId123</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>errorMsg</p>
     */
    @NameInMap("lastErrorMsg")
    public String lastErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>thread.run</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("startedAt")
    public Long startedAt;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static RetrieveRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRunResponseBody self = new RetrieveRunResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveRunResponseBody setCancelledAt(Long cancelledAt) {
        this.cancelledAt = cancelledAt;
        return this;
    }
    public Long getCancelledAt() {
        return this.cancelledAt;
    }

    public RetrieveRunResponseBody setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public RetrieveRunResponseBody setCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }
    public Long getCreateAt() {
        return this.createAt;
    }

    public RetrieveRunResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public RetrieveRunResponseBody setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
        return this;
    }
    public Long getFailedAt() {
        return this.failedAt;
    }

    public RetrieveRunResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RetrieveRunResponseBody setLastErrorMsg(String lastErrorMsg) {
        this.lastErrorMsg = lastErrorMsg;
        return this;
    }
    public String getLastErrorMsg() {
        return this.lastErrorMsg;
    }

    public RetrieveRunResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public RetrieveRunResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public RetrieveRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveRunResponseBody setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public Long getStartedAt() {
        return this.startedAt;
    }

    public RetrieveRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RetrieveRunResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

}
