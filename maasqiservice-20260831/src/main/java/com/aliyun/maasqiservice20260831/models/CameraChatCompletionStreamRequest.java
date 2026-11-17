// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CameraChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>Required. Provide only one <code>role=user</code> message and one image. Multiple images, custom text, and videos are not supported, and you cannot invoke tools.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;image_url&quot;,&quot;image_url&quot;:{&quot;url&quot;:&quot;<a href="https://example.com/images/person.jpg%22%7D%7D%5D%7D%5D">https://example.com/images/person.jpg&quot;}}]}]</a></p>
     */
    @NameInMap("messages")
    public java.util.List<CameraChatCompletionStreamRequestMessages> messages;

    /**
     * <p>The HTTP JSON key is <code>scene_id</code>. Required for person recognition. The value must be non-empty, contain no leading or trailing whitespace, and be up to 50 characters in length. Reuse the same scene for person recognition. Omit this field for food recognition.</p>
     * 
     * <strong>example:</strong>
     * <p>meeting-room-001</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    /**
     * <p>Specifies whether to return an SSE response. If set to <code>true</code>, an SSE response is returned. If set to <code>false</code> or omitted, a complete JSON detection result is returned. SSE transmits the final result and does not output token by token.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static CameraChatCompletionStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CameraChatCompletionStreamRequest self = new CameraChatCompletionStreamRequest();
        return TeaModel.build(map, self);
    }

    public CameraChatCompletionStreamRequest setMessages(java.util.List<CameraChatCompletionStreamRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CameraChatCompletionStreamRequestMessages> getMessages() {
        return this.messages;
    }

    public CameraChatCompletionStreamRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CameraChatCompletionStreamRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class CameraChatCompletionStreamRequestMessagesContentImageUrl extends TeaModel {
        /**
         * <p>A publicly accessible HTTPS URL or a complete Base64 image data URL. Signed URLs must remain valid during execution. Both the image and the request body are subject to size limits. Use a URL for large images.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/images/person.jpg">https://example.com/images/person.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CameraChatCompletionStreamRequestMessagesContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CameraChatCompletionStreamRequestMessagesContentImageUrl self = new CameraChatCompletionStreamRequestMessagesContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CameraChatCompletionStreamRequestMessagesContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CameraChatCompletionStreamRequestMessagesContent extends TeaModel {
        /**
         * <p>The HTTP JSON key is <code>image_url</code>. Required. Contains the <code>url</code> field for the image address.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("imageUrl")
        public CameraChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <p>Required. Fixed to <code>image_url</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image_url</p>
         */
        @NameInMap("type")
        public String type;

        public static CameraChatCompletionStreamRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            CameraChatCompletionStreamRequestMessagesContent self = new CameraChatCompletionStreamRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public CameraChatCompletionStreamRequestMessagesContent setImageUrl(CameraChatCompletionStreamRequestMessagesContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CameraChatCompletionStreamRequestMessagesContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CameraChatCompletionStreamRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CameraChatCompletionStreamRequestMessages extends TeaModel {
        /**
         * <p>Required. Contains one <code>image_url</code> image. Do not place custom recognition prompts here.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public java.util.List<CameraChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>Required. Fixed to <code>user</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static CameraChatCompletionStreamRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            CameraChatCompletionStreamRequestMessages self = new CameraChatCompletionStreamRequestMessages();
            return TeaModel.build(map, self);
        }

        public CameraChatCompletionStreamRequestMessages setContent(java.util.List<CameraChatCompletionStreamRequestMessagesContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<CameraChatCompletionStreamRequestMessagesContent> getContent() {
            return this.content;
        }

        public CameraChatCompletionStreamRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
