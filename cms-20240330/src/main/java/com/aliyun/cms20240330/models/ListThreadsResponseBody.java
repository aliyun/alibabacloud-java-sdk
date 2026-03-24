// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListThreadsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results returned. The maximum value is 200.</p>
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
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>thread-123123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <p>The sessions.</p>
     */
    @NameInMap("threads")
    public java.util.List<ListThreadsResponseBodyThreads> threads;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The Simple Log Service (SLS) project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
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
        @NameInMap("attributes")
        public java.util.Map<String, String> attributes;

        /**
         * <p>The time when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-19T15:19:55.040403272+08:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The name of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

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

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The time when the session was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-19T15:19:55.040403272+08:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The session properties.</p>
         */
        @NameInMap("variables")
        public ListThreadsResponseBodyThreadsVariables variables;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("version")
        public Long version;

        public static ListThreadsResponseBodyThreads build(java.util.Map<String, ?> map) throws Exception {
            ListThreadsResponseBodyThreads self = new ListThreadsResponseBodyThreads();
            return TeaModel.build(map, self);
        }

        public ListThreadsResponseBodyThreads setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
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
