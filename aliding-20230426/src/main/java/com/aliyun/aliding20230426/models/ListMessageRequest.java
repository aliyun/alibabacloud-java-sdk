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

    @NameInMap("extLoginUser")
    public ListMessageRequestExtLoginUser extLoginUser;

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
     * <p>assistantId2</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>runId123</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>agentKey1</p>
     */
    @NameInMap("sourceIdOfOriginalAssistantId")
    public String sourceIdOfOriginalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sourceTypeOfOriginalAssistantId")
    public String sourceTypeOfOriginalAssistantId;

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

    public ListMessageRequest setExtLoginUser(ListMessageRequestExtLoginUser extLoginUser) {
        this.extLoginUser = extLoginUser;
        return this;
    }
    public ListMessageRequestExtLoginUser getExtLoginUser() {
        return this.extLoginUser;
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

    public ListMessageRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public ListMessageRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public ListMessageRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public ListMessageRequest setSourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public ListMessageRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class ListMessageRequestExtLoginUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mozi</p>
         */
        @NameInMap("extLoginUserDomain")
        public String extLoginUserDomain;

        /**
         * <strong>example:</strong>
         * <p>outeruserId123</p>
         */
        @NameInMap("extLoginUserId")
        public String extLoginUserId;

        /**
         * <strong>example:</strong>
         * <p>外部游客1</p>
         */
        @NameInMap("extLoginUserName")
        public String extLoginUserName;

        public static ListMessageRequestExtLoginUser build(java.util.Map<String, ?> map) throws Exception {
            ListMessageRequestExtLoginUser self = new ListMessageRequestExtLoginUser();
            return TeaModel.build(map, self);
        }

        public ListMessageRequestExtLoginUser setExtLoginUserDomain(String extLoginUserDomain) {
            this.extLoginUserDomain = extLoginUserDomain;
            return this;
        }
        public String getExtLoginUserDomain() {
            return this.extLoginUserDomain;
        }

        public ListMessageRequestExtLoginUser setExtLoginUserId(String extLoginUserId) {
            this.extLoginUserId = extLoginUserId;
            return this;
        }
        public String getExtLoginUserId() {
            return this.extLoginUserId;
        }

        public ListMessageRequestExtLoginUser setExtLoginUserName(String extLoginUserName) {
            this.extLoginUserName = extLoginUserName;
            return this;
        }
        public String getExtLoginUserName() {
            return this.extLoginUserName;
        }

    }

}
