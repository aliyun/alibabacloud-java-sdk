// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalSize")
    public Integer totalSize;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Result")
    public java.util.List<QuerySlsLogStoreListResponseBodyResult> result;

    public static QuerySlsLogStoreListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogStoreListResponseBody self = new QuerySlsLogStoreListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogStoreListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySlsLogStoreListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySlsLogStoreListResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public QuerySlsLogStoreListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QuerySlsLogStoreListResponseBody setResult(java.util.List<QuerySlsLogStoreListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QuerySlsLogStoreListResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QuerySlsLogStoreListResponseBodyResult extends TeaModel {
        @NameInMap("Link")
        public String link;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("ConsumerSide")
        public String consumerSide;

        @NameInMap("Project")
        public String project;

        @NameInMap("Source")
        public String source;

        public static QuerySlsLogStoreListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySlsLogStoreListResponseBodyResult self = new QuerySlsLogStoreListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QuerySlsLogStoreListResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QuerySlsLogStoreListResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySlsLogStoreListResponseBodyResult setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public QuerySlsLogStoreListResponseBodyResult setConsumerSide(String consumerSide) {
            this.consumerSide = consumerSide;
            return this;
        }
        public String getConsumerSide() {
            return this.consumerSide;
        }

        public QuerySlsLogStoreListResponseBodyResult setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public QuerySlsLogStoreListResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
