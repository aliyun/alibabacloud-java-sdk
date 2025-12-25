// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListThreadsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>thread_id01</p>
     */
    @NameInMap("threadId")
    public String threadId;

    @NameInMap("threads")
    public java.util.List<ListThreadsResponseBodyThreads> threads;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListThreadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListThreadsResponseBody self = new ListThreadsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListThreadsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListThreadsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListThreadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThreadsResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public ListThreadsResponseBody setThreads(java.util.List<ListThreadsResponseBodyThreads> threads) {
        this.threads = threads;
        return this;
    }
    public java.util.List<ListThreadsResponseBodyThreads> getThreads() {
        return this.threads;
    }

    public ListThreadsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListThreadsResponseBodyThreadsVariables extends TeaModel {
        /**
         * <p>SLS project。</p>
         * 
         * <strong>example:</strong>
         * <p>ciec_rl_ads</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>hd1-np</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListThreadsResponseBodyThreadsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListThreadsResponseBodyThreadsVariables self = new ListThreadsResponseBodyThreadsVariables();
            return TeaModel.build(map, self);
        }

        public ListThreadsResponseBodyThreadsVariables setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListThreadsResponseBodyThreadsVariables setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListThreadsResponseBodyThreads extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-04-22T12:46:34Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>thread-t71rrw-1s7r7z9gu0v2s</p>
         */
        @NameInMap("threadId")
        public String threadId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2025-06-24 10:05:21</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("variables")
        public ListThreadsResponseBodyThreadsVariables variables;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("version")
        public Long version;

        public static ListThreadsResponseBodyThreads build(java.util.Map<String, ?> map) throws Exception {
            ListThreadsResponseBodyThreads self = new ListThreadsResponseBodyThreads();
            return TeaModel.build(map, self);
        }

        public ListThreadsResponseBodyThreads setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListThreadsResponseBodyThreads setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public ListThreadsResponseBodyThreads setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListThreadsResponseBodyThreads setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public ListThreadsResponseBodyThreads setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListThreadsResponseBodyThreads setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListThreadsResponseBodyThreads setVariables(ListThreadsResponseBodyThreadsVariables variables) {
            this.variables = variables;
            return this;
        }
        public ListThreadsResponseBodyThreadsVariables getVariables() {
            return this.variables;
        }

        public ListThreadsResponseBodyThreads setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
