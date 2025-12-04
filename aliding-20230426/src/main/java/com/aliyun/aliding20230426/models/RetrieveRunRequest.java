// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RetrieveRunRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    @NameInMap("extLoginUser")
    public RetrieveRunRequestExtLoginUser extLoginUser;

    /**
     * <strong>example:</strong>
     * <p>assistantId</p>
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

    public static RetrieveRunRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRunRequest self = new RetrieveRunRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveRunRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public RetrieveRunRequest setExtLoginUser(RetrieveRunRequestExtLoginUser extLoginUser) {
        this.extLoginUser = extLoginUser;
        return this;
    }
    public RetrieveRunRequestExtLoginUser getExtLoginUser() {
        return this.extLoginUser;
    }

    public RetrieveRunRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public RetrieveRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public RetrieveRunRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public RetrieveRunRequest setSourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public static class RetrieveRunRequestExtLoginUser extends TeaModel {
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

        public static RetrieveRunRequestExtLoginUser build(java.util.Map<String, ?> map) throws Exception {
            RetrieveRunRequestExtLoginUser self = new RetrieveRunRequestExtLoginUser();
            return TeaModel.build(map, self);
        }

        public RetrieveRunRequestExtLoginUser setExtLoginUserDomain(String extLoginUserDomain) {
            this.extLoginUserDomain = extLoginUserDomain;
            return this;
        }
        public String getExtLoginUserDomain() {
            return this.extLoginUserDomain;
        }

        public RetrieveRunRequestExtLoginUser setExtLoginUserId(String extLoginUserId) {
            this.extLoginUserId = extLoginUserId;
            return this;
        }
        public String getExtLoginUserId() {
            return this.extLoginUserId;
        }

        public RetrieveRunRequestExtLoginUser setExtLoginUserName(String extLoginUserName) {
            this.extLoginUserName = extLoginUserName;
            return this;
        }
        public String getExtLoginUserName() {
            return this.extLoginUserName;
        }

    }

}
