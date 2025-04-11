// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAssistantCapabilityRequest extends TeaModel {
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
     * <p>[]</p>
     */
    @NameInMap("content")
    public java.util.List<GetAssistantCapabilityRequestContent> content;

    /**
     * <strong>example:</strong>
     * <p>id1</p>
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
     * <p>originalAssistantId1</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>cfp</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>threadId</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static GetAssistantCapabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssistantCapabilityRequest self = new GetAssistantCapabilityRequest();
        return TeaModel.build(map, self);
    }

    public GetAssistantCapabilityRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public GetAssistantCapabilityRequest setContent(java.util.List<GetAssistantCapabilityRequestContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<GetAssistantCapabilityRequestContent> getContent() {
        return this.content;
    }

    public GetAssistantCapabilityRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAssistantCapabilityRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public GetAssistantCapabilityRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public GetAssistantCapabilityRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetAssistantCapabilityRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public GetAssistantCapabilityRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class GetAssistantCapabilityRequestContentCardCallback extends TeaModel {
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

        public static GetAssistantCapabilityRequestContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestContentCardCallback self = new GetAssistantCapabilityRequestContentCardCallback();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAssistantCapabilityRequestContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetAssistantCapabilityRequestContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAssistantCapabilityRequestContentDingCard extends TeaModel {
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

        public static GetAssistantCapabilityRequestContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestContentDingCard self = new GetAssistantCapabilityRequestContentDingCard();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public GetAssistantCapabilityRequestContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAssistantCapabilityRequestContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetAssistantCapabilityRequestContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetAssistantCapabilityRequestContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetAssistantCapabilityRequestContentImageUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>这是一张小猫钓鱼图</p>
         */
        @NameInMap("imageDesc")
        public String imageDesc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/1234.png">https://img.alicdn.com/1234.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAssistantCapabilityRequestContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestContentImageUrl self = new GetAssistantCapabilityRequestContentImageUrl();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAssistantCapabilityRequestContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public GetAssistantCapabilityRequestContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAssistantCapabilityRequestContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static GetAssistantCapabilityRequestContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestContentMarkdown self = new GetAssistantCapabilityRequestContentMarkdown();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAssistantCapabilityRequestContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static GetAssistantCapabilityRequestContentText build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestContentText self = new GetAssistantCapabilityRequestContentText();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAssistantCapabilityRequestContent extends TeaModel {
        @NameInMap("cardCallback")
        public GetAssistantCapabilityRequestContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public GetAssistantCapabilityRequestContentDingCard dingCard;

        @NameInMap("imageUrl")
        public GetAssistantCapabilityRequestContentImageUrl imageUrl;

        @NameInMap("markdown")
        public GetAssistantCapabilityRequestContentMarkdown markdown;

        @NameInMap("text")
        public GetAssistantCapabilityRequestContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static GetAssistantCapabilityRequestContent build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestContent self = new GetAssistantCapabilityRequestContent();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestContent setCardCallback(GetAssistantCapabilityRequestContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public GetAssistantCapabilityRequestContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public GetAssistantCapabilityRequestContent setDingCard(GetAssistantCapabilityRequestContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public GetAssistantCapabilityRequestContentDingCard getDingCard() {
            return this.dingCard;
        }

        public GetAssistantCapabilityRequestContent setImageUrl(GetAssistantCapabilityRequestContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public GetAssistantCapabilityRequestContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public GetAssistantCapabilityRequestContent setMarkdown(GetAssistantCapabilityRequestContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public GetAssistantCapabilityRequestContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public GetAssistantCapabilityRequestContent setText(GetAssistantCapabilityRequestContentText text) {
            this.text = text;
            return this;
        }
        public GetAssistantCapabilityRequestContentText getText() {
            return this.text;
        }

        public GetAssistantCapabilityRequestContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
