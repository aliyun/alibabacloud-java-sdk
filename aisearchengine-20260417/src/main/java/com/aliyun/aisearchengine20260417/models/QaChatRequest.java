// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class QaChatRequest extends TeaModel {
    /**
     * <p>Application ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2052929167853146113</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>User message object containing role and multimodal content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("message")
    public QaChatRequestMessage message;

    /**
     * <p>No input required</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;debug&quot;: true
     * }</p>
     */
    @NameInMap("options")
    public java.util.Map<String, ?> options;

    /**
     * <p>Q&amp;A session ID, used to track multiple Q&amp;A interactions from the same user.</p>
     * 
     * <strong>example:</strong>
     * <p>req_123456789</p>
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
         * <p>Required when type = &quot;data&quot;. The data object structure is as follows:</p>
         * <ul>
         * <li>type: String type, required, indicates the data subtype. Currently supported value is &quot;template&quot;, indicating a video template.</li>
         * <li>videoId: String type, conditionally required. Only required when type = &quot;template&quot;, indicating the video template ID; can be ignored or set to null for other types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;type&quot;: &quot;template&quot;,
         *   &quot;videoId&quot;: &quot;xxxx&quot;
         * }</p>
         */
        @NameInMap("data")
        public Object data;

        /**
         * <p>Required when <code>type=&quot;file&quot;</code>.</p>
         * <ul>
         * <li>Media type, currently only supports image formats JPG/PNG/WEBP/JPEG, maximum 5</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("mediaType")
        public String mediaType;

        /**
         * <p>Required when <code>type=&quot;text&quot;</code>.</p>
         * <ul>
         * <li>Text content, maximum 1024 characters</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>请问这个视频讲了什么？</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>Fixed content block type, only supports <code>&quot;text&quot;</code> / <code>&quot;file&quot;</code> / <code>&quot;data&quot;</code></p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Required when <code>type=&quot;file&quot;</code>. Supports the following two types, with format support for JPG/PNG/WEBP/JPEG:</p>
         * <p>• Media resource CDN URL, currently supports images, maximum 5;
         * • Image encoding, upload image files using base64 encoded strings (supports bitmap formats), maximum 5</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/img.jpg">https://example.com/img.jpg</a></p>
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
        /**
         * <p>Individual content block, differentiated by <code>type</code></p>
         */
        @NameInMap("parts")
        public java.util.List<QaChatRequestMessageParts> parts;

        /**
         * <p>Message role, currently only supports the <code>&quot;user&quot;</code> role</p>
         * 
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
