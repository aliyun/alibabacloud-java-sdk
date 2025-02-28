// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>assistantId</p>
     */
    @NameInMap("originalAssistantid")
    public String originalAssistantid;

    /**
     * <strong>example:</strong>
     * <p>runId123</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static ListMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageRequest self = new ListMessageRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public ListMessageRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListMessageRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMessageRequest setOriginalAssistantid(String originalAssistantid) {
        this.originalAssistantid = originalAssistantid;
        return this;
    }
    public String getOriginalAssistantid() {
        return this.originalAssistantid;
    }

    public ListMessageRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public ListMessageRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

}
