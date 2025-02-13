// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeAssistantResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("content")
    public java.util.List<InvokeAssistantResponseBodyContent> content;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>sessionId1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("streamEnd")
    public Boolean streamEnd;

    public static InvokeAssistantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeAssistantResponseBody self = new InvokeAssistantResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeAssistantResponseBody setContent(java.util.List<InvokeAssistantResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<InvokeAssistantResponseBodyContent> getContent() {
        return this.content;
    }

    public InvokeAssistantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeAssistantResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public InvokeAssistantResponseBody setStreamEnd(Boolean streamEnd) {
        this.streamEnd = streamEnd;
        return this;
    }
    public Boolean getStreamEnd() {
        return this.streamEnd;
    }

    public static class InvokeAssistantResponseBodyContentCardCallback extends TeaModel {
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

        public static InvokeAssistantResponseBodyContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyContentCardCallback self = new InvokeAssistantResponseBodyContentCardCallback();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantResponseBodyContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public InvokeAssistantResponseBodyContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class InvokeAssistantResponseBodyContentDingCard extends TeaModel {
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

        public static InvokeAssistantResponseBodyContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyContentDingCard self = new InvokeAssistantResponseBodyContentDingCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public InvokeAssistantResponseBodyContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantResponseBodyContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public InvokeAssistantResponseBodyContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public InvokeAssistantResponseBodyContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class InvokeAssistantResponseBodyContentImageUrl extends TeaModel {
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

        public static InvokeAssistantResponseBodyContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyContentImageUrl self = new InvokeAssistantResponseBodyContentImageUrl();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public InvokeAssistantResponseBodyContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public InvokeAssistantResponseBodyContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantResponseBodyContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantResponseBodyContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyContentMarkdown self = new InvokeAssistantResponseBodyContentMarkdown();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantResponseBodyContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantResponseBodyContentText build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyContentText self = new InvokeAssistantResponseBodyContentText();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantResponseBodyContent extends TeaModel {
        @NameInMap("cardCallback")
        public InvokeAssistantResponseBodyContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public InvokeAssistantResponseBodyContentDingCard dingCard;

        @NameInMap("imageUrl")
        public InvokeAssistantResponseBodyContentImageUrl imageUrl;

        @NameInMap("markdown")
        public InvokeAssistantResponseBodyContentMarkdown markdown;

        @NameInMap("text")
        public InvokeAssistantResponseBodyContentText text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyContent self = new InvokeAssistantResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyContent setCardCallback(InvokeAssistantResponseBodyContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public InvokeAssistantResponseBodyContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public InvokeAssistantResponseBodyContent setDingCard(InvokeAssistantResponseBodyContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public InvokeAssistantResponseBodyContentDingCard getDingCard() {
            return this.dingCard;
        }

        public InvokeAssistantResponseBodyContent setImageUrl(InvokeAssistantResponseBodyContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public InvokeAssistantResponseBodyContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public InvokeAssistantResponseBodyContent setMarkdown(InvokeAssistantResponseBodyContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public InvokeAssistantResponseBodyContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public InvokeAssistantResponseBodyContent setText(InvokeAssistantResponseBodyContentText text) {
            this.text = text;
            return this;
        }
        public InvokeAssistantResponseBodyContentText getText() {
            return this.text;
        }

        public InvokeAssistantResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
