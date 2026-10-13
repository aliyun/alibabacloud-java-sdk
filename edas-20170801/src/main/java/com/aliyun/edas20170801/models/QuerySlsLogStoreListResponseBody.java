// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d6834ee9-5045-*************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Simple Log Service configuration results.</p>
     */
    @NameInMap("Result")
    public java.util.List<QuerySlsLogStoreListResponseBodyResult> result;

    /**
     * <p>The total number of Simple Log Service configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static QuerySlsLogStoreListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogStoreListResponseBody self = new QuerySlsLogStoreListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogStoreListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

    public QuerySlsLogStoreListResponseBody setResult(java.util.List<QuerySlsLogStoreListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QuerySlsLogStoreListResponseBodyResult> getResult() {
        return this.result;
    }

    public QuerySlsLogStoreListResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class QuerySlsLogStoreListResponseBodyResult extends TeaModel {
        /**
         * <p>The Simple Log Service type.</p>
         * 
         * <strong>example:</strong>
         * <p>Simple Log Service</p>
         */
        @NameInMap("ConsumerSide")
        public String consumerSide;

        /**
         * <p>The creation time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-18 22:08:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Simple Log Service link.</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>thisisatestlogstore</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c846f28edbd1d4c6aa9d78c0e********</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The log source. Valid values:</p>
         * <ul>
         * <li>Standard output: stdout.log.</li>
         * <li>File log: the collection path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/var/log/*</p>
         */
        @NameInMap("Source")
        public String source;

        public static QuerySlsLogStoreListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySlsLogStoreListResponseBodyResult self = new QuerySlsLogStoreListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QuerySlsLogStoreListResponseBodyResult setConsumerSide(String consumerSide) {
            this.consumerSide = consumerSide;
            return this;
        }
        public String getConsumerSide() {
            return this.consumerSide;
        }

        public QuerySlsLogStoreListResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySlsLogStoreListResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QuerySlsLogStoreListResponseBodyResult setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
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
