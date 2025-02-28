// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ListMessageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>list</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageResponseBody self = new ListMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageResponseBody setData(java.util.List<ListMessageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMessageResponseBodyData> getData() {
        return this.data;
    }

    public ListMessageResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public ListMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMessageResponseBodyDataContentCardCallback extends TeaModel {
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

        public static ListMessageResponseBodyDataContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyDataContentCardCallback self = new ListMessageResponseBodyDataContentCardCallback();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyDataContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMessageResponseBodyDataContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListMessageResponseBodyDataContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMessageResponseBodyDataContentDingCard extends TeaModel {
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

        public static ListMessageResponseBodyDataContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyDataContentDingCard self = new ListMessageResponseBodyDataContentDingCard();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyDataContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public ListMessageResponseBodyDataContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMessageResponseBodyDataContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListMessageResponseBodyDataContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public ListMessageResponseBodyDataContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListMessageResponseBodyDataContentImageUrl extends TeaModel {
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

        public static ListMessageResponseBodyDataContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyDataContentImageUrl self = new ListMessageResponseBodyDataContentImageUrl();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyDataContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListMessageResponseBodyDataContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public ListMessageResponseBodyDataContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListMessageResponseBodyDataContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static ListMessageResponseBodyDataContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyDataContentMarkdown self = new ListMessageResponseBodyDataContentMarkdown();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyDataContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMessageResponseBodyDataContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static ListMessageResponseBodyDataContentText build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyDataContentText self = new ListMessageResponseBodyDataContentText();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyDataContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMessageResponseBodyDataContent extends TeaModel {
        @NameInMap("cardCallback")
        public ListMessageResponseBodyDataContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public ListMessageResponseBodyDataContentDingCard dingCard;

        @NameInMap("imageUrl")
        public ListMessageResponseBodyDataContentImageUrl imageUrl;

        @NameInMap("markdown")
        public ListMessageResponseBodyDataContentMarkdown markdown;

        @NameInMap("text")
        public ListMessageResponseBodyDataContentText text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMessageResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyDataContent self = new ListMessageResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyDataContent setCardCallback(ListMessageResponseBodyDataContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public ListMessageResponseBodyDataContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public ListMessageResponseBodyDataContent setDingCard(ListMessageResponseBodyDataContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public ListMessageResponseBodyDataContentDingCard getDingCard() {
            return this.dingCard;
        }

        public ListMessageResponseBodyDataContent setImageUrl(ListMessageResponseBodyDataContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public ListMessageResponseBodyDataContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public ListMessageResponseBodyDataContent setMarkdown(ListMessageResponseBodyDataContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public ListMessageResponseBodyDataContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public ListMessageResponseBodyDataContent setText(ListMessageResponseBodyDataContentText text) {
            this.text = text;
            return this;
        }
        public ListMessageResponseBodyDataContentText getText() {
            return this.text;
        }

        public ListMessageResponseBodyDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMessageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("content")
        public java.util.List<ListMessageResponseBodyDataContent> content;

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
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>runId123</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>threadId123</p>
         */
        @NameInMap("threadId")
        public String threadId;

        public static ListMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyData self = new ListMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyData setContent(java.util.List<ListMessageResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMessageResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListMessageResponseBodyData setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public ListMessageResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMessageResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListMessageResponseBodyData setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public ListMessageResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListMessageResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListMessageResponseBodyData setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

}
