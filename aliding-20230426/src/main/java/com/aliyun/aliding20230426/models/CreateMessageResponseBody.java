// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("content")
    public java.util.List<CreateMessageResponseBodyContent> content;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("createAt")
    public Long createAt;

    /**
     * <strong>example:</strong>
     * <p>messageId123</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>thread.message</p>
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
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static CreateMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageResponseBody self = new CreateMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMessageResponseBody setContent(java.util.List<CreateMessageResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<CreateMessageResponseBodyContent> getContent() {
        return this.content;
    }

    public CreateMessageResponseBody setCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }
    public Long getCreateAt() {
        return this.createAt;
    }

    public CreateMessageResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateMessageResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateMessageResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CreateMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMessageResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateMessageResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class CreateMessageResponseBodyContentCardCallback extends TeaModel {
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

        public static CreateMessageResponseBodyContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyContentCardCallback self = new CreateMessageResponseBodyContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageResponseBodyContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateMessageResponseBodyContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateMessageResponseBodyContentDingCard extends TeaModel {
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

        public static CreateMessageResponseBodyContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyContentDingCard self = new CreateMessageResponseBodyContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public CreateMessageResponseBodyContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageResponseBodyContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateMessageResponseBodyContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateMessageResponseBodyContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateMessageResponseBodyContentImageUrl extends TeaModel {
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

        public static CreateMessageResponseBodyContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyContentImageUrl self = new CreateMessageResponseBodyContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateMessageResponseBodyContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public CreateMessageResponseBodyContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMessageResponseBodyContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageResponseBodyContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyContentMarkdown self = new CreateMessageResponseBodyContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageResponseBodyContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageResponseBodyContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyContentText self = new CreateMessageResponseBodyContentText();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageResponseBodyContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateMessageResponseBodyContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateMessageResponseBodyContentDingCard dingCard;

        @NameInMap("imageUrl")
        public CreateMessageResponseBodyContentImageUrl imageUrl;

        @NameInMap("markdown")
        public CreateMessageResponseBodyContentMarkdown markdown;

        @NameInMap("text")
        public CreateMessageResponseBodyContentText text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMessageResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyContent self = new CreateMessageResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyContent setCardCallback(CreateMessageResponseBodyContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateMessageResponseBodyContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateMessageResponseBodyContent setDingCard(CreateMessageResponseBodyContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateMessageResponseBodyContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateMessageResponseBodyContent setImageUrl(CreateMessageResponseBodyContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CreateMessageResponseBodyContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CreateMessageResponseBodyContent setMarkdown(CreateMessageResponseBodyContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateMessageResponseBodyContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateMessageResponseBodyContent setText(CreateMessageResponseBodyContentText text) {
            this.text = text;
            return this;
        }
        public CreateMessageResponseBodyContentText getText() {
            return this.text;
        }

        public CreateMessageResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
