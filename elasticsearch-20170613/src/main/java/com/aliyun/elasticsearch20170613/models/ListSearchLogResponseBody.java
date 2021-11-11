// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSearchLogResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListSearchLogResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListSearchLogResponseBodyResult> result;

    public static ListSearchLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchLogResponseBody self = new ListSearchLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchLogResponseBody setHeaders(ListSearchLogResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListSearchLogResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListSearchLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchLogResponseBody setResult(java.util.List<ListSearchLogResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSearchLogResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListSearchLogResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListSearchLogResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListSearchLogResponseBodyHeaders self = new ListSearchLogResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListSearchLogResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListSearchLogResponseBodyResult extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("contentCollection")
        public java.util.Map<String, ?> contentCollection;

        @NameInMap("host")
        public String host;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("level")
        public String level;

        @NameInMap("timestamp")
        public Long timestamp;

        public static ListSearchLogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSearchLogResponseBodyResult self = new ListSearchLogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSearchLogResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSearchLogResponseBodyResult setContentCollection(java.util.Map<String, ?> contentCollection) {
            this.contentCollection = contentCollection;
            return this;
        }
        public java.util.Map<String, ?> getContentCollection() {
            return this.contentCollection;
        }

        public ListSearchLogResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListSearchLogResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSearchLogResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListSearchLogResponseBodyResult setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
