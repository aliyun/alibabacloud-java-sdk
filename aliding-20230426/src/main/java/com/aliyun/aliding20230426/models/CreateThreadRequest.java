// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateThreadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    @NameInMap("clientEnum")
    public String clientEnum;

    @NameInMap("extLoginUser")
    public CreateThreadRequestExtLoginUser extLoginUser;

    /**
     * <strong>example:</strong>
     * <p>assistantId</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>agentKey1</p>
     */
    @NameInMap("sourceIdOfOriginalAssistantId")
    public String sourceIdOfOriginalAssistantId;

    @NameInMap("sourceTypeOfOriginalAssistantId")
    public Integer sourceTypeOfOriginalAssistantId;

    public static CreateThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThreadRequest self = new CreateThreadRequest();
        return TeaModel.build(map, self);
    }

    public CreateThreadRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public CreateThreadRequest setClientEnum(String clientEnum) {
        this.clientEnum = clientEnum;
        return this;
    }
    public String getClientEnum() {
        return this.clientEnum;
    }

    public CreateThreadRequest setExtLoginUser(CreateThreadRequestExtLoginUser extLoginUser) {
        this.extLoginUser = extLoginUser;
        return this;
    }
    public CreateThreadRequestExtLoginUser getExtLoginUser() {
        return this.extLoginUser;
    }

    public CreateThreadRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public CreateThreadRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public CreateThreadRequest setSourceTypeOfOriginalAssistantId(Integer sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public Integer getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public static class CreateThreadRequestExtLoginUser extends TeaModel {
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

        public static CreateThreadRequestExtLoginUser build(java.util.Map<String, ?> map) throws Exception {
            CreateThreadRequestExtLoginUser self = new CreateThreadRequestExtLoginUser();
            return TeaModel.build(map, self);
        }

        public CreateThreadRequestExtLoginUser setExtLoginUserDomain(String extLoginUserDomain) {
            this.extLoginUserDomain = extLoginUserDomain;
            return this;
        }
        public String getExtLoginUserDomain() {
            return this.extLoginUserDomain;
        }

        public CreateThreadRequestExtLoginUser setExtLoginUserId(String extLoginUserId) {
            this.extLoginUserId = extLoginUserId;
            return this;
        }
        public String getExtLoginUserId() {
            return this.extLoginUserId;
        }

        public CreateThreadRequestExtLoginUser setExtLoginUserName(String extLoginUserName) {
            this.extLoginUserName = extLoginUserName;
            return this;
        }
        public String getExtLoginUserName() {
            return this.extLoginUserName;
        }

    }

}
