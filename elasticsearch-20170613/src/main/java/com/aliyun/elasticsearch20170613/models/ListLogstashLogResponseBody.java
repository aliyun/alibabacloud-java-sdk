// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("level")
        public String level;

        @NameInMap("content")
        public String content;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("host")
        public String host;

        public static ListLogstashLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashLogResponseBodyResult self = new ListLogstashLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLogstashLogResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListLogstashLogResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListLogstashLogResponseBodyResult setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListLogstashLogResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLogstashLogResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

}
