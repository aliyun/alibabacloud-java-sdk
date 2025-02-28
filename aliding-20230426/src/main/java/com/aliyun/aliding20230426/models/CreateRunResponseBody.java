// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("cancelledAt")
    public Long cancelledAt;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("content")
    public CreateRunResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("createAt")
    public Long createAt;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("delta")
    public CreateRunResponseBodyDelta delta;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("expiresAt")
    public Long expiresAt;

    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("failedAt")
    public Long failedAt;

    /**
     * <strong>example:</strong>
     * <p>runId123</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>errorMsg</p>
     */
    @NameInMap("lastErrorMsg")
    public String lastErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>thread.run</p>
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
     * <p>1642448000000</p>
     */
    @NameInMap("startedAt")
    public Long startedAt;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static CreateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponseBody self = new CreateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRunResponseBody setCancelledAt(Long cancelledAt) {
        this.cancelledAt = cancelledAt;
        return this;
    }
    public Long getCancelledAt() {
        return this.cancelledAt;
    }

    public CreateRunResponseBody setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public CreateRunResponseBody setContent(CreateRunResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateRunResponseBodyContent getContent() {
        return this.content;
    }

    public CreateRunResponseBody setCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }
    public Long getCreateAt() {
        return this.createAt;
    }

    public CreateRunResponseBody setDelta(CreateRunResponseBodyDelta delta) {
        this.delta = delta;
        return this;
    }
    public CreateRunResponseBodyDelta getDelta() {
        return this.delta;
    }

    public CreateRunResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public CreateRunResponseBody setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
        return this;
    }
    public Long getFailedAt() {
        return this.failedAt;
    }

    public CreateRunResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateRunResponseBody setLastErrorMsg(String lastErrorMsg) {
        this.lastErrorMsg = lastErrorMsg;
        return this;
    }
    public String getLastErrorMsg() {
        return this.lastErrorMsg;
    }

    public CreateRunResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateRunResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CreateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRunResponseBody setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public Long getStartedAt() {
        return this.startedAt;
    }

    public CreateRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateRunResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class CreateRunResponseBodyContentCardCallback extends TeaModel {
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

        public static CreateRunResponseBodyContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyContentCardCallback self = new CreateRunResponseBodyContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRunResponseBodyContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateRunResponseBodyContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateRunResponseBodyContentDingCard extends TeaModel {
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

        public static CreateRunResponseBodyContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyContentDingCard self = new CreateRunResponseBodyContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public CreateRunResponseBodyContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRunResponseBodyContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateRunResponseBodyContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateRunResponseBodyContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateRunResponseBodyContentImageUrl extends TeaModel {
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

        public static CreateRunResponseBodyContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyContentImageUrl self = new CreateRunResponseBodyContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateRunResponseBodyContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public CreateRunResponseBodyContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateRunResponseBodyContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateRunResponseBodyContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyContentMarkdown self = new CreateRunResponseBodyContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRunResponseBodyContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateRunResponseBodyContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyContentText self = new CreateRunResponseBodyContentText();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRunResponseBodyContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateRunResponseBodyContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateRunResponseBodyContentDingCard dingCard;

        @NameInMap("imageUrl")
        public CreateRunResponseBodyContentImageUrl imageUrl;

        @NameInMap("markdown")
        public CreateRunResponseBodyContentMarkdown markdown;

        @NameInMap("text")
        public CreateRunResponseBodyContentText text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateRunResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyContent self = new CreateRunResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyContent setCardCallback(CreateRunResponseBodyContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateRunResponseBodyContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateRunResponseBodyContent setDingCard(CreateRunResponseBodyContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateRunResponseBodyContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateRunResponseBodyContent setImageUrl(CreateRunResponseBodyContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CreateRunResponseBodyContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CreateRunResponseBodyContent setMarkdown(CreateRunResponseBodyContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateRunResponseBodyContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateRunResponseBodyContent setText(CreateRunResponseBodyContentText text) {
            this.text = text;
            return this;
        }
        public CreateRunResponseBodyContentText getText() {
            return this.text;
        }

        public CreateRunResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRunResponseBodyDeltaContentCardCallback extends TeaModel {
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

        public static CreateRunResponseBodyDeltaContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDeltaContentCardCallback self = new CreateRunResponseBodyDeltaContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDeltaContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRunResponseBodyDeltaContentCardCallback setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateRunResponseBodyDeltaContentCardCallback setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateRunResponseBodyDeltaContentDingCard extends TeaModel {
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

        public static CreateRunResponseBodyDeltaContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDeltaContentDingCard self = new CreateRunResponseBodyDeltaContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDeltaContentDingCard setCardDesc(String cardDesc) {
            this.cardDesc = cardDesc;
            return this;
        }
        public String getCardDesc() {
            return this.cardDesc;
        }

        public CreateRunResponseBodyDeltaContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRunResponseBodyDeltaContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateRunResponseBodyDeltaContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateRunResponseBodyDeltaContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateRunResponseBodyDeltaContentImageUrl extends TeaModel {
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

        public static CreateRunResponseBodyDeltaContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDeltaContentImageUrl self = new CreateRunResponseBodyDeltaContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDeltaContentImageUrl setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public CreateRunResponseBodyDeltaContentImageUrl setImageDesc(String imageDesc) {
            this.imageDesc = imageDesc;
            return this;
        }
        public String getImageDesc() {
            return this.imageDesc;
        }

        public CreateRunResponseBodyDeltaContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateRunResponseBodyDeltaContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateRunResponseBodyDeltaContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDeltaContentMarkdown self = new CreateRunResponseBodyDeltaContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDeltaContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRunResponseBodyDeltaContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateRunResponseBodyDeltaContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDeltaContentText self = new CreateRunResponseBodyDeltaContentText();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDeltaContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRunResponseBodyDeltaContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateRunResponseBodyDeltaContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateRunResponseBodyDeltaContentDingCard dingCard;

        @NameInMap("imageUrl")
        public CreateRunResponseBodyDeltaContentImageUrl imageUrl;

        @NameInMap("markdown")
        public CreateRunResponseBodyDeltaContentMarkdown markdown;

        @NameInMap("text")
        public CreateRunResponseBodyDeltaContentText text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateRunResponseBodyDeltaContent build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDeltaContent self = new CreateRunResponseBodyDeltaContent();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDeltaContent setCardCallback(CreateRunResponseBodyDeltaContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateRunResponseBodyDeltaContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateRunResponseBodyDeltaContent setDingCard(CreateRunResponseBodyDeltaContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateRunResponseBodyDeltaContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateRunResponseBodyDeltaContent setImageUrl(CreateRunResponseBodyDeltaContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CreateRunResponseBodyDeltaContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CreateRunResponseBodyDeltaContent setMarkdown(CreateRunResponseBodyDeltaContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateRunResponseBodyDeltaContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateRunResponseBodyDeltaContent setText(CreateRunResponseBodyDeltaContentText text) {
            this.text = text;
            return this;
        }
        public CreateRunResponseBodyDeltaContentText getText() {
            return this.text;
        }

        public CreateRunResponseBodyDeltaContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRunResponseBodyDelta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public CreateRunResponseBodyDeltaContent content;

        public static CreateRunResponseBodyDelta build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyDelta self = new CreateRunResponseBodyDelta();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyDelta setContent(CreateRunResponseBodyDeltaContent content) {
            this.content = content;
            return this;
        }
        public CreateRunResponseBodyDeltaContent getContent() {
            return this.content;
        }

    }

}
