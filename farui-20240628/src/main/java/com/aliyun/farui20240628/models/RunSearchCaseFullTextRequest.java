// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchCaseFullTextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("filterCondition")
    public RunSearchCaseFullTextRequestFilterCondition filterCondition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageParam")
    public RunSearchCaseFullTextRequestPageParam pageParam;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("queryKeywords")
    public java.util.List<String> queryKeywords;

    @NameInMap("sortKeyAndDirection")
    public java.util.Map<String, String> sortKeyAndDirection;

    @NameInMap("thread")
    public RunSearchCaseFullTextRequestThread thread;

    public static RunSearchCaseFullTextRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchCaseFullTextRequest self = new RunSearchCaseFullTextRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchCaseFullTextRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunSearchCaseFullTextRequest setFilterCondition(RunSearchCaseFullTextRequestFilterCondition filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public RunSearchCaseFullTextRequestFilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    public RunSearchCaseFullTextRequest setPageParam(RunSearchCaseFullTextRequestPageParam pageParam) {
        this.pageParam = pageParam;
        return this;
    }
    public RunSearchCaseFullTextRequestPageParam getPageParam() {
        return this.pageParam;
    }

    public RunSearchCaseFullTextRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunSearchCaseFullTextRequest setQueryKeywords(java.util.List<String> queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public java.util.List<String> getQueryKeywords() {
        return this.queryKeywords;
    }

    public RunSearchCaseFullTextRequest setSortKeyAndDirection(java.util.Map<String, String> sortKeyAndDirection) {
        this.sortKeyAndDirection = sortKeyAndDirection;
        return this;
    }
    public java.util.Map<String, String> getSortKeyAndDirection() {
        return this.sortKeyAndDirection;
    }

    public RunSearchCaseFullTextRequest setThread(RunSearchCaseFullTextRequestThread thread) {
        this.thread = thread;
        return this;
    }
    public RunSearchCaseFullTextRequestThread getThread() {
        return this.thread;
    }

    public static class RunSearchCaseFullTextRequestFilterCondition extends TeaModel {
        @NameInMap("caseNo")
        public String caseNo;

        @NameInMap("caseTitle")
        public String caseTitle;

        public static RunSearchCaseFullTextRequestFilterCondition build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextRequestFilterCondition self = new RunSearchCaseFullTextRequestFilterCondition();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextRequestFilterCondition setCaseNo(String caseNo) {
            this.caseNo = caseNo;
            return this;
        }
        public String getCaseNo() {
            return this.caseNo;
        }

        public RunSearchCaseFullTextRequestFilterCondition setCaseTitle(String caseTitle) {
            this.caseTitle = caseTitle;
            return this;
        }
        public String getCaseTitle() {
            return this.caseTitle;
        }

    }

    public static class RunSearchCaseFullTextRequestPageParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        public static RunSearchCaseFullTextRequestPageParam build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextRequestPageParam self = new RunSearchCaseFullTextRequestPageParam();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextRequestPageParam setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public RunSearchCaseFullTextRequestPageParam setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class RunSearchCaseFullTextRequestThreadMessages extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static RunSearchCaseFullTextRequestThreadMessages build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextRequestThreadMessages self = new RunSearchCaseFullTextRequestThreadMessages();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextRequestThreadMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchCaseFullTextRequestThreadMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class RunSearchCaseFullTextRequestThread extends TeaModel {
        @NameInMap("messages")
        public java.util.List<RunSearchCaseFullTextRequestThreadMessages> messages;

        public static RunSearchCaseFullTextRequestThread build(java.util.Map<String, ?> map) throws Exception {
            RunSearchCaseFullTextRequestThread self = new RunSearchCaseFullTextRequestThread();
            return TeaModel.build(map, self);
        }

        public RunSearchCaseFullTextRequestThread setMessages(java.util.List<RunSearchCaseFullTextRequestThreadMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<RunSearchCaseFullTextRequestThreadMessages> getMessages() {
            return this.messages;
        }

    }

}
