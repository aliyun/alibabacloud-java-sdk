// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F40EAA1-6F1D-4DD9-8DB8-C5F00C4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
         * <p>The detailed content of the log.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The IP address of the node that generated the log.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-v0h1kzca****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The log level. Valid values: trace, debug, info, warn, and error. GC logs do not have a level.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The timestamp when the log was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1531985112420</p>
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
