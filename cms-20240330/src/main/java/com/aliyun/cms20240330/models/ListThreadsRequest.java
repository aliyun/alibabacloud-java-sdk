// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListThreadsRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. If you do not specify this parameter, all threads in the instance are queried.</p>
     */
    @NameInMap("filter")
    public java.util.List<ListThreadsRequestFilter> filter;

    /**
     * <p>The maximum number of results to return. The maximum value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The paging token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The session status.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>thread-123123</p>
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
         * <p>The filter key. Supported values are title, workspace, and project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The set value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
