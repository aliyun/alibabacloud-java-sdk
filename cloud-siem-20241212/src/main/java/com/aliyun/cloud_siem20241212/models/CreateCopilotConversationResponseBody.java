// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateCopilotConversationResponseBody extends TeaModel {
    /**
     * <p>The API version number. The value is 1.0.0.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.2</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The conversation timestamp.</p>
     */
    @NameInMap("Conversation")
    public CreateCopilotConversationResponseBodyConversation conversation;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCopilotConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotConversationResponseBody self = new CreateCopilotConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCopilotConversationResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CreateCopilotConversationResponseBody setConversation(CreateCopilotConversationResponseBodyConversation conversation) {
        this.conversation = conversation;
        return this;
    }
    public CreateCopilotConversationResponseBodyConversation getConversation() {
        return this.conversation;
    }

    public CreateCopilotConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCopilotConversationResponseBodyConversation extends TeaModel {
        /**
         * <p>The security operations Agent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-31T10:10:20Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The returned conversation information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Feedback")
        public Long feedback;

        /**
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-max</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Specifies whether planning is enabled. Valid values: disable, enable, force. Default value: enable.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PlanMode")
        public String planMode;

        /**
         * <p>The security project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>project-incident-****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The ID of the scheduled task. The ID is system-generated and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>task-e34f770da4f04f6db21c2819****</p>
         */
        @NameInMap("ScheduledTaskId")
        public String scheduledTaskId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The thinking mode configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ThinkingMode")
        public String thinkingMode;

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Security incident investigation</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-27 16:02:28</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The session visibility.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static CreateCopilotConversationResponseBodyConversation build(java.util.Map<String, ?> map) throws Exception {
            CreateCopilotConversationResponseBodyConversation self = new CreateCopilotConversationResponseBodyConversation();
            return TeaModel.build(map, self);
        }

        public CreateCopilotConversationResponseBodyConversation setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public CreateCopilotConversationResponseBodyConversation setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCopilotConversationResponseBodyConversation setFeedback(Long feedback) {
            this.feedback = feedback;
            return this;
        }
        public Long getFeedback() {
            return this.feedback;
        }

        public CreateCopilotConversationResponseBodyConversation setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateCopilotConversationResponseBodyConversation setPlanMode(String planMode) {
            this.planMode = planMode;
            return this;
        }
        public String getPlanMode() {
            return this.planMode;
        }

        public CreateCopilotConversationResponseBodyConversation setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateCopilotConversationResponseBodyConversation setScheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }
        public String getScheduledTaskId() {
            return this.scheduledTaskId;
        }

        public CreateCopilotConversationResponseBodyConversation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCopilotConversationResponseBodyConversation setThinkingMode(String thinkingMode) {
            this.thinkingMode = thinkingMode;
            return this;
        }
        public String getThinkingMode() {
            return this.thinkingMode;
        }

        public CreateCopilotConversationResponseBodyConversation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateCopilotConversationResponseBodyConversation setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateCopilotConversationResponseBodyConversation setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

}
