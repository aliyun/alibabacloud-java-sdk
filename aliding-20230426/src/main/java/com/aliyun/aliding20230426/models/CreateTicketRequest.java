// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CustomFields")
    public String customFields;

    @NameInMap("Notify")
    public CreateTicketRequestNotify notify;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>G3IOe205RLciE</p>
     */
    @NameInMap("OpenTeamId")
    public String openTeamId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("OpenTemplateBizId")
    public String openTemplateBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcessorUserIds")
    public java.util.List<String> processorUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SG</p>
     */
    @NameInMap("Scene")
    public String scene;

    @NameInMap("SceneContext")
    public CreateTicketRequestSceneContext sceneContext;

    @NameInMap("TenantContext")
    public CreateTicketRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Killer Ball Wo Mouichido</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setCustomFields(String customFields) {
        this.customFields = customFields;
        return this;
    }
    public String getCustomFields() {
        return this.customFields;
    }

    public CreateTicketRequest setNotify(CreateTicketRequestNotify notify) {
        this.notify = notify;
        return this;
    }
    public CreateTicketRequestNotify getNotify() {
        return this.notify;
    }

    public CreateTicketRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public CreateTicketRequest setOpenTemplateBizId(String openTemplateBizId) {
        this.openTemplateBizId = openTemplateBizId;
        return this;
    }
    public String getOpenTemplateBizId() {
        return this.openTemplateBizId;
    }

    public CreateTicketRequest setProcessorUserIds(java.util.List<String> processorUserIds) {
        this.processorUserIds = processorUserIds;
        return this;
    }
    public java.util.List<String> getProcessorUserIds() {
        return this.processorUserIds;
    }

    public CreateTicketRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateTicketRequest setSceneContext(CreateTicketRequestSceneContext sceneContext) {
        this.sceneContext = sceneContext;
        return this;
    }
    public CreateTicketRequestSceneContext getSceneContext() {
        return this.sceneContext;
    }

    public CreateTicketRequest setTenantContext(CreateTicketRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateTicketRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateTicketRequestNotify extends TeaModel {
        @NameInMap("GroupNoticeReceiverUserIds")
        public java.util.List<String> groupNoticeReceiverUserIds;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NoticeAllGroupMember")
        public Boolean noticeAllGroupMember;

        @NameInMap("WorkNoticeReceiverUserIds")
        public java.util.List<String> workNoticeReceiverUserIds;

        public static CreateTicketRequestNotify build(java.util.Map<String, ?> map) throws Exception {
            CreateTicketRequestNotify self = new CreateTicketRequestNotify();
            return TeaModel.build(map, self);
        }

        public CreateTicketRequestNotify setGroupNoticeReceiverUserIds(java.util.List<String> groupNoticeReceiverUserIds) {
            this.groupNoticeReceiverUserIds = groupNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getGroupNoticeReceiverUserIds() {
            return this.groupNoticeReceiverUserIds;
        }

        public CreateTicketRequestNotify setNoticeAllGroupMember(Boolean noticeAllGroupMember) {
            this.noticeAllGroupMember = noticeAllGroupMember;
            return this;
        }
        public Boolean getNoticeAllGroupMember() {
            return this.noticeAllGroupMember;
        }

        public CreateTicketRequestNotify setWorkNoticeReceiverUserIds(java.util.List<String> workNoticeReceiverUserIds) {
            this.workNoticeReceiverUserIds = workNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getWorkNoticeReceiverUserIds() {
            return this.workNoticeReceiverUserIds;
        }

    }

    public static class CreateTicketRequestSceneContextGroupMsgs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Anchor")
        public Boolean anchor;

        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("OpenMsgId")
        public String openMsgId;

        public static CreateTicketRequestSceneContextGroupMsgs build(java.util.Map<String, ?> map) throws Exception {
            CreateTicketRequestSceneContextGroupMsgs self = new CreateTicketRequestSceneContextGroupMsgs();
            return TeaModel.build(map, self);
        }

        public CreateTicketRequestSceneContextGroupMsgs setAnchor(Boolean anchor) {
            this.anchor = anchor;
            return this;
        }
        public Boolean getAnchor() {
            return this.anchor;
        }

        public CreateTicketRequestSceneContextGroupMsgs setOpenMsgId(String openMsgId) {
            this.openMsgId = openMsgId;
            return this;
        }
        public String getOpenMsgId() {
            return this.openMsgId;
        }

    }

    public static class CreateTicketRequestSceneContext extends TeaModel {
        @NameInMap("GroupMsgs")
        public java.util.List<CreateTicketRequestSceneContextGroupMsgs> groupMsgs;

        /**
         * <strong>example:</strong>
         * <p>cidDKVAOW8yVWPEN+WZfwSSAQ==</p>
         */
        @NameInMap("OpenConversationId")
        public String openConversationId;

        @NameInMap("RelevantorUserIds")
        public java.util.List<String> relevantorUserIds;

        /**
         * <strong>example:</strong>
         * <p>42674892</p>
         */
        @NameInMap("TopicId")
        public String topicId;

        public static CreateTicketRequestSceneContext build(java.util.Map<String, ?> map) throws Exception {
            CreateTicketRequestSceneContext self = new CreateTicketRequestSceneContext();
            return TeaModel.build(map, self);
        }

        public CreateTicketRequestSceneContext setGroupMsgs(java.util.List<CreateTicketRequestSceneContextGroupMsgs> groupMsgs) {
            this.groupMsgs = groupMsgs;
            return this;
        }
        public java.util.List<CreateTicketRequestSceneContextGroupMsgs> getGroupMsgs() {
            return this.groupMsgs;
        }

        public CreateTicketRequestSceneContext setOpenConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }
        public String getOpenConversationId() {
            return this.openConversationId;
        }

        public CreateTicketRequestSceneContext setRelevantorUserIds(java.util.List<String> relevantorUserIds) {
            this.relevantorUserIds = relevantorUserIds;
            return this;
        }
        public java.util.List<String> getRelevantorUserIds() {
            return this.relevantorUserIds;
        }

        public CreateTicketRequestSceneContext setTopicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
        public String getTopicId() {
            return this.topicId;
        }

    }

    public static class CreateTicketRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateTicketRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateTicketRequestTenantContext self = new CreateTicketRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateTicketRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
