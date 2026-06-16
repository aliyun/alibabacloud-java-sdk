// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class QaChatResponseBody extends TeaModel {
    /**
     * <p>Protocol data</p>
     */
    @NameInMap("data")
    public QaChatResponseBodyData data;

    /**
     * <p>Event type description:</p>
     * <ol>
     * <li><p>Lifecycle</p>
     * <ul>
     * <li>start / finish</li>
     * <li>Marks the beginning and end of a message</li>
     * </ul>
     * </li>
     * <li><p>Text content</p>
     * <ul>
     * <li>text-start / text-delta / text-end</li>
     * <li>Markdown text streaming output</li>
     * </ul>
     * </li>
     * <li><p>Inline media</p>
     * <ul>
     * <li>data-image-info / data-video-info</li>
     * <li>Media cards in text-image/text-video mixed content</li>
     * </ul>
     * </li>
     * <li><p>Source references</p>
     * <ul>
     * <li>data-reference</li>
     * <li>Unified source list (web / document / image / video)</li>
     * </ul>
     * </li>
     * <li><p>Inline references</p>
     * <ul>
     * <li>data-document-ref</li>
     * <li>Perplexity-style inline document references</li>
     * </ul>
     * </li>
     * <li><p>Template video</p>
     * <ul>
     * <li>data-template-video</li>
     * <li>Video cards output by AV template agent</li>
     * </ul>
     * </li>
     * <li><p>Template analysis</p>
     * <ul>
     * <li>data-video-info / data-template-info / data-template-video-content</li>
     * <li>Analysis result data from AV template agent</li>
     * <li>Table-type templates such as &quot;Speech Transcription&quot;, &quot;Video Outline&quot;, and &quot;Video-to-Script&quot; are delivered at once via data-template-video-content</li>
     * </ul>
     * </li>
     * <li><p>Streaming JSON</p>
     * <ul>
     * <li>json-start / json-delta / json-end</li>
     * <li>Incremental delta-only JSON streaming protocol</li>
     * <li>Used for structured JSON template analysis output such as &quot;Action Expression&quot;</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("event")
    public String event;

    /**
     * <p>Request ID, same as requestId</p>
     * 
     * <strong>example:</strong>
     * <p>2a127bc9-9474-405d-916d-8bc4475fa459</p>
     */
    @NameInMap("id")
    public String id;

    public static QaChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QaChatResponseBody self = new QaChatResponseBody();
        return TeaModel.build(map, self);
    }

    public QaChatResponseBody setData(QaChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QaChatResponseBodyData getData() {
        return this.data;
    }

    public QaChatResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public QaChatResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public static class QaChatResponseBodyData extends TeaModel {
        /**
         * <p>Structured response data</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;items&quot;: [
         *  {
         *  &quot;title&quot;: &quot;电脑产品评测&quot;,
         *  &quot;videoUrl&quot;: &quot;<a href="https://video.example.com/review.mp4">https://video.example.com/review.mp4</a>&quot;,
         *  &quot;coverUrl&quot;: &quot;<a href="https://images.example">https://images.example</a>&quot;,
         *  &quot;tags&quot;: [
         *  &quot;数码产品&quot;,
         *  &quot;评测&quot;,
         *  &quot;电脑&quot;,
         *  &quot;生产力&quot;
         *  ]
         *  }
         *  ]
         * }</p>
         */
        @NameInMap("data")
        public String data;

        /**
         * <p>Incremental text output</p>
         * 
         * <strong>example:</strong>
         * <p>如果你想更快看到上身效果，这 3 条短视频会更直观。\n\n<strong>第一条：完整通勤 look</strong>\n\n3 套通勤到周末无缝切换的浅色运动鞋穿搭。</p>
         */
        @NameInMap("delta")
        public String delta;

        /**
         * <p>See error code list</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>See error code list</p>
         * 
         * <strong>example:</strong>
         * <p>参数错误</p>
         */
        @NameInMap("errorText")
        public String errorText;

        /**
         * <p>Completion reason. When the value is stop, it indicates output is complete; on error, the output is the error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <p>Unique identifier. For multi-segment text, different segments use different ids, while the id remains consistent within a text segment</p>
         * 
         * <strong>example:</strong>
         * <p>2a127bc9-9474-405d-916d-8bc4475fa459</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>2a127bc9-9474-405d-916d-8bc4475fa459</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>Whether the error is retryable, defaults to true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        /**
         * <p>Same as event</p>
         * 
         * <strong>example:</strong>
         * <p>v</p>
         */
        @NameInMap("type")
        public String type;

        public static QaChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QaChatResponseBodyData self = new QaChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QaChatResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QaChatResponseBodyData setDelta(String delta) {
            this.delta = delta;
            return this;
        }
        public String getDelta() {
            return this.delta;
        }

        public QaChatResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QaChatResponseBodyData setErrorText(String errorText) {
            this.errorText = errorText;
            return this;
        }
        public String getErrorText() {
            return this.errorText;
        }

        public QaChatResponseBodyData setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public QaChatResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QaChatResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QaChatResponseBodyData setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public QaChatResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
