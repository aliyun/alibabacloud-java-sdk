// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashLogResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListLogstashLogResponseBodyResult> result;

    public static ListLogstashLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashLogResponseBody self = new ListLogstashLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogstashLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogstashLogResponseBody setResult(java.util.List<ListLogstashLogResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLogstashLogResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLogstashLogResponseBodyResult extends TeaModel {
        /**
         * <p>The details of the log.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The IP address of the node that generates the log.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The severity level of the log entry. Including trace, debug, info, warn, error, etc. (GC logs have no level).</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The timestamp of log generation. Unit: ms.</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        public static ListLogstashLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashLogResponseBodyResult self = new ListLogstashLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLogstashLogResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListLogstashLogResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListLogstashLogResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLogstashLogResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListLogstashLogResponseBodyResult setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
