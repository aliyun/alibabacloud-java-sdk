// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeAssistantRequest extends TeaModel {
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
     * <p>[
     *     {
     *         &quot;type&quot;: &quot;text&quot;,
     *         &quot;text&quot;: &quot;你好&quot;
     *     }
     * ]</p>
     */
    @NameInMap("content")
    public java.util.List<InvokeAssistantRequestContent> content;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("history")
    public java.util.List<InvokeAssistantRequestHistory> history;

    /**
     * <strong>example:</strong>
     * <p>sessionId1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static InvokeAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAssistantRequest self = new InvokeAssistantRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAssistantRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public InvokeAssistantRequest setContent(java.util.List<InvokeAssistantRequestContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<InvokeAssistantRequestContent> getContent() {
        return this.content;
    }

    public InvokeAssistantRequest setHistory(java.util.List<InvokeAssistantRequestHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<InvokeAssistantRequestHistory> getHistory() {
        return this.history;
    }

    public InvokeAssistantRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public InvokeAssistantRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class InvokeAssistantRequestContentCardCallback extends TeaModel {
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

        public static InvokeAssistantRequestContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestContentCardCallback self = new InvokeAssistantRequestContentCardCallback();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantRequestContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public InvokeAssistantRequestContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class InvokeAssistantRequestContentDingCard extends TeaModel {
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

        public static InvokeAssistantRequestContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestContentDingCard self = new InvokeAssistantRequestContentDingCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public InvokeAssistantRequestContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantRequestContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public InvokeAssistantRequestContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public InvokeAssistantRequestContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class InvokeAssistantRequestContentImageUrl extends TeaModel {
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

        public static InvokeAssistantRequestContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestContentImageUrl self = new InvokeAssistantRequestContentImageUrl();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public InvokeAssistantRequestContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public InvokeAssistantRequestContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantRequestContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantRequestContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestContentMarkdown self = new InvokeAssistantRequestContentMarkdown();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantRequestContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantRequestContentText build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestContentText self = new InvokeAssistantRequestContentText();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantRequestContent extends TeaModel {
        @NameInMap("cardCallback")
        public InvokeAssistantRequestContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public InvokeAssistantRequestContentDingCard dingCard;

        @NameInMap("imageUrl")
        public InvokeAssistantRequestContentImageUrl imageUrl;

        @NameInMap("markdown")
        public InvokeAssistantRequestContentMarkdown markdown;

        @NameInMap("text")
        public InvokeAssistantRequestContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantRequestContent build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestContent self = new InvokeAssistantRequestContent();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestContent setCardCallback(InvokeAssistantRequestContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public InvokeAssistantRequestContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public InvokeAssistantRequestContent setDingCard(InvokeAssistantRequestContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public InvokeAssistantRequestContentDingCard getDingCard() {
            return this.dingCard;
        }

        public InvokeAssistantRequestContent setImageUrl(InvokeAssistantRequestContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public InvokeAssistantRequestContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public InvokeAssistantRequestContent setMarkdown(InvokeAssistantRequestContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public InvokeAssistantRequestContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public InvokeAssistantRequestContent setText(InvokeAssistantRequestContentText text) {
            this.text = text;
            return this;
        }
        public InvokeAssistantRequestContentText getText() {
            return this.text;
        }

        public InvokeAssistantRequestContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAssistantRequestHistoryContentCardCallback extends TeaModel {
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

        public static InvokeAssistantRequestHistoryContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistoryContentCardCallback self = new InvokeAssistantRequestHistoryContentCardCallback();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistoryContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantRequestHistoryContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public InvokeAssistantRequestHistoryContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class InvokeAssistantRequestHistoryContentDingCard extends TeaModel {
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

        public static InvokeAssistantRequestHistoryContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistoryContentDingCard self = new InvokeAssistantRequestHistoryContentDingCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistoryContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public InvokeAssistantRequestHistoryContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantRequestHistoryContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public InvokeAssistantRequestHistoryContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public InvokeAssistantRequestHistoryContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class InvokeAssistantRequestHistoryContentImageUrl extends TeaModel {
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

        public static InvokeAssistantRequestHistoryContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistoryContentImageUrl self = new InvokeAssistantRequestHistoryContentImageUrl();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistoryContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public InvokeAssistantRequestHistoryContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public InvokeAssistantRequestHistoryContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantRequestHistoryContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantRequestHistoryContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistoryContentMarkdown self = new InvokeAssistantRequestHistoryContentMarkdown();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistoryContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantRequestHistoryContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantRequestHistoryContentText build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistoryContentText self = new InvokeAssistantRequestHistoryContentText();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistoryContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantRequestHistoryContent extends TeaModel {
        @NameInMap("cardCallback")
        public InvokeAssistantRequestHistoryContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public InvokeAssistantRequestHistoryContentDingCard dingCard;

        @NameInMap("imageUrl")
        public InvokeAssistantRequestHistoryContentImageUrl imageUrl;

        @NameInMap("markdown")
        public InvokeAssistantRequestHistoryContentMarkdown markdown;

        @NameInMap("text")
        public InvokeAssistantRequestHistoryContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantRequestHistoryContent build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistoryContent self = new InvokeAssistantRequestHistoryContent();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistoryContent setCardCallback(InvokeAssistantRequestHistoryContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public InvokeAssistantRequestHistoryContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public InvokeAssistantRequestHistoryContent setDingCard(InvokeAssistantRequestHistoryContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public InvokeAssistantRequestHistoryContentDingCard getDingCard() {
            return this.dingCard;
        }

        public InvokeAssistantRequestHistoryContent setImageUrl(InvokeAssistantRequestHistoryContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public InvokeAssistantRequestHistoryContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public InvokeAssistantRequestHistoryContent setMarkdown(InvokeAssistantRequestHistoryContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public InvokeAssistantRequestHistoryContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public InvokeAssistantRequestHistoryContent setText(InvokeAssistantRequestHistoryContentText text) {
            this.text = text;
            return this;
        }
        public InvokeAssistantRequestHistoryContentText getText() {
            return this.text;
        }

        public InvokeAssistantRequestHistoryContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAssistantRequestHistory extends TeaModel {
        @NameInMap("content")
        public java.util.List<InvokeAssistantRequestHistoryContent> content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static InvokeAssistantRequestHistory build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestHistory self = new InvokeAssistantRequestHistory();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestHistory setContent(java.util.List<InvokeAssistantRequestHistoryContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<InvokeAssistantRequestHistoryContent> getContent() {
            return this.content;
        }

        public InvokeAssistantRequestHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
