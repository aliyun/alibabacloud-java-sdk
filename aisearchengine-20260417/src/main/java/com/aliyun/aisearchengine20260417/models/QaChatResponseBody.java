// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class QaChatResponseBody extends TeaModel {
    @NameInMap("data")
    public QaChatResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("event")
    public String event;

    /**
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
         * <strong>example:</strong>
         * <p>{
         *   &quot;items&quot;: [
         *     {
         *       &quot;title&quot;: &quot;MacBook Neo 深度测评：全面超越，最轻盈的生产力&quot;,
         *       &quot;videoUrl&quot;: &quot;<a href="https://video.example.com/macbook-neo-review.mp4">https://video.example.com/macbook-neo-review.mp4</a>&quot;,
         *       &quot;coverUrl&quot;: &quot;<a href="https://images.unsplash.com/photo-1529139574466-a303027c1d8b?auto=format&fit=crop&w=800&q=80">https://images.unsplash.com/photo-1529139574466-a303027c1d8b?auto=format&amp;fit=crop&amp;w=800&amp;q=80</a>&quot;,
         *       &quot;tags&quot;: [
         *         &quot;数码产品&quot;,
         *         &quot;评测&quot;,
         *         &quot;MacBook&quot;,
         *         &quot;生产力&quot;
         *       ]
         *     }
         *   ]
         * }</p>
         */
        @NameInMap("data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>如果你想更快看到上身效果，这 3 条短视频会更直观。\n\n<strong>第一条：完整通勤 look</strong>\n\n3 套通勤到周末无缝切换的浅色运动鞋穿搭。</p>
         */
        @NameInMap("delta")
        public String delta;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>参数错误</p>
         */
        @NameInMap("errorText")
        public String errorText;

        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>2a127bc9-9474-405d-916d-8bc4475fa459</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2a127bc9-9474-405d-916d-8bc4475fa459</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        /**
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
