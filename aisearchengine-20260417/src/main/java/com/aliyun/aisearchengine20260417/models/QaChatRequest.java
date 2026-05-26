// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class QaChatRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2047140750220754946</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("message")
    public QaChatRequestMessage message;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;debug&quot;: true
     * }</p>
     */
    @NameInMap("options")
    public java.util.Map<String, ?> options;

    /**
     * <strong>example:</strong>
     * <p>b2a979e79799489fbde56119bf8c4dc7</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static QaChatRequest build(java.util.Map<String, ?> map) throws Exception {
        QaChatRequest self = new QaChatRequest();
        return TeaModel.build(map, self);
    }

    public QaChatRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QaChatRequest setMessage(QaChatRequestMessage message) {
        this.message = message;
        return this;
    }
    public QaChatRequestMessage getMessage() {
        return this.message;
    }

    public QaChatRequest setOptions(java.util.Map<String, ?> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    public QaChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class QaChatRequestMessageParts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;templateId&quot;: &quot;456789&quot;
         * }</p>
         */
        @NameInMap("data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("mediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>帮我搜索下今天的天气</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://meeting.dingtalk.com/j/4sSPAxWaPbM">https://meeting.dingtalk.com/j/4sSPAxWaPbM</a></p>
         */
        @NameInMap("url")
        public String url;

        public static QaChatRequestMessageParts build(java.util.Map<String, ?> map) throws Exception {
            QaChatRequestMessageParts self = new QaChatRequestMessageParts();
            return TeaModel.build(map, self);
        }

        public QaChatRequestMessageParts setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public QaChatRequestMessageParts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public QaChatRequestMessageParts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QaChatRequestMessageParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QaChatRequestMessageParts setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QaChatRequestMessage extends TeaModel {
        @NameInMap("parts")
        public java.util.List<QaChatRequestMessageParts> parts;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static QaChatRequestMessage build(java.util.Map<String, ?> map) throws Exception {
            QaChatRequestMessage self = new QaChatRequestMessage();
            return TeaModel.build(map, self);
        }

        public QaChatRequestMessage setParts(java.util.List<QaChatRequestMessageParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<QaChatRequestMessageParts> getParts() {
            return this.parts;
        }

        public QaChatRequestMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
