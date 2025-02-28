// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>你好！</p>
     */
    @NameInMap("content")
    public java.util.List<CreateMessageRequestContent> content;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>assistantId</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static CreateMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageRequest self = new CreateMessageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public CreateMessageRequest setContent(java.util.List<CreateMessageRequestContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<CreateMessageRequestContent> getContent() {
        return this.content;
    }

    public CreateMessageRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateMessageRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public CreateMessageRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateMessageRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class CreateMessageRequestContentCardCallback extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>templateId123</p>
         */
        @NameInMap("templateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("userId")
        public String userId;

        public static CreateMessageRequestContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestContentCardCallback self = new CreateMessageRequestContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageRequestContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateMessageRequestContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateMessageRequestContentDingCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>卡片描述</p>
         */
        @NameInMap("cardDesc")
        public String cardDesc;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>basic_card_schema</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("finished")
        public Boolean finished;

        /**
         * <strong>example:</strong>
         * <p>templateId123</p>
         */
        @NameInMap("templateId")
        public String templateId;

        public static CreateMessageRequestContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestContentDingCard self = new CreateMessageRequestContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public CreateMessageRequestContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageRequestContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateMessageRequestContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateMessageRequestContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateMessageRequestContentImageUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("detail")
        public String detail;

        @NameInMap("imageDesc")
        public String imageDesc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/1234.png">https://img.alicdn.com/1234.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CreateMessageRequestContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestContentImageUrl self = new CreateMessageRequestContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateMessageRequestContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public CreateMessageRequestContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMessageRequestContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageRequestContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestContentMarkdown self = new CreateMessageRequestContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageRequestContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageRequestContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestContentText self = new CreateMessageRequestContentText();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageRequestContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateMessageRequestContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateMessageRequestContentDingCard dingCard;

        @NameInMap("imageUrl")
        public CreateMessageRequestContentImageUrl imageUrl;

        @NameInMap("markdown")
        public CreateMessageRequestContentMarkdown markdown;

        @NameInMap("text")
        public CreateMessageRequestContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMessageRequestContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestContent self = new CreateMessageRequestContent();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestContent setCardCallback(CreateMessageRequestContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateMessageRequestContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateMessageRequestContent setDingCard(CreateMessageRequestContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateMessageRequestContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateMessageRequestContent setImageUrl(CreateMessageRequestContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CreateMessageRequestContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CreateMessageRequestContent setMarkdown(CreateMessageRequestContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateMessageRequestContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateMessageRequestContent setText(CreateMessageRequestContentText text) {
            this.text = text;
            return this;
        }
        public CreateMessageRequestContentText getText() {
            return this.text;
        }

        public CreateMessageRequestContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
