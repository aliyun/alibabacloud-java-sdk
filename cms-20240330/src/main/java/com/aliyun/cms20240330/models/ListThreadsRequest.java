// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListThreadsRequest extends TeaModel {
    @NameInMap("filter")
    public java.util.List<ListThreadsRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>thread_id01</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static ListThreadsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListThreadsRequest self = new ListThreadsRequest();
        return TeaModel.build(map, self);
    }

    public ListThreadsRequest setFilter(java.util.List<ListThreadsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListThreadsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListThreadsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListThreadsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListThreadsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListThreadsRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class ListThreadsRequestFilter extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dukang-oxs-pre-obeqi</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Type\&quot;: \&quot;primaryDoc\&quot;, \&quot;Id\&quot;: \&quot;01ZM8y7\&quot;, \&quot;Name\&quot;: \&quot;key\&quot;}, {\&quot;Type\&quot;: \&quot;text\&quot;, \&quot;Id\&quot;: \&quot;mHe1U1b\&quot;, \&quot;Name\&quot;: \&quot;value\&quot;}, {\&quot;Type\&quot;: \&quot;text\&quot;, \&quot;Id\&quot;: \&quot;rRIhpBs\&quot;, \&quot;Name\&quot;: u\&quot;\u4f5c\u7528\&quot;}]</p>
         */
        @NameInMap("value")
        public String value;

        public static ListThreadsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListThreadsRequestFilter self = new ListThreadsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListThreadsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListThreadsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
