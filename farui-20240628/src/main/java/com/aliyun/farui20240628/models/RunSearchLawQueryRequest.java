// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchLawQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("filterCondition")
    public RunSearchLawQueryRequestFilterCondition filterCondition;

    @NameInMap("pageParam")
    public RunSearchLawQueryRequestPageParam pageParam;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("queryKeywords")
    public java.util.List<String> queryKeywords;

    @NameInMap("thread")
    public RunSearchLawQueryRequestThread thread;

    public static RunSearchLawQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchLawQueryRequest self = new RunSearchLawQueryRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchLawQueryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunSearchLawQueryRequest setFilterCondition(RunSearchLawQueryRequestFilterCondition filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public RunSearchLawQueryRequestFilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    public RunSearchLawQueryRequest setPageParam(RunSearchLawQueryRequestPageParam pageParam) {
        this.pageParam = pageParam;
        return this;
    }
    public RunSearchLawQueryRequestPageParam getPageParam() {
        return this.pageParam;
    }

    public RunSearchLawQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunSearchLawQueryRequest setQueryKeywords(java.util.List<String> queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public java.util.List<String> getQueryKeywords() {
        return this.queryKeywords;
    }

    public RunSearchLawQueryRequest setThread(RunSearchLawQueryRequestThread thread) {
        this.thread = thread;
        return this;
    }
    public RunSearchLawQueryRequestThread getThread() {
        return this.thread;
    }

    public static class RunSearchLawQueryRequestFilterCondition extends TeaModel {
        @NameInMap("lawName")
        public String lawName;

        public static RunSearchLawQueryRequestFilterCondition build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryRequestFilterCondition self = new RunSearchLawQueryRequestFilterCondition();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryRequestFilterCondition setLawName(String lawName) {
            this.lawName = lawName;
            return this;
        }
        public String getLawName() {
            return this.lawName;
        }

    }

    public static class RunSearchLawQueryRequestPageParam extends TeaModel {
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

        public static RunSearchLawQueryRequestPageParam build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryRequestPageParam self = new RunSearchLawQueryRequestPageParam();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryRequestPageParam setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public RunSearchLawQueryRequestPageParam setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class RunSearchLawQueryRequestThreadMessages extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static RunSearchLawQueryRequestThreadMessages build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryRequestThreadMessages self = new RunSearchLawQueryRequestThreadMessages();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryRequestThreadMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchLawQueryRequestThreadMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class RunSearchLawQueryRequestThread extends TeaModel {
        @NameInMap("messages")
        public java.util.List<RunSearchLawQueryRequestThreadMessages> messages;

        public static RunSearchLawQueryRequestThread build(java.util.Map<String, ?> map) throws Exception {
            RunSearchLawQueryRequestThread self = new RunSearchLawQueryRequestThread();
            return TeaModel.build(map, self);
        }

        public RunSearchLawQueryRequestThread setMessages(java.util.List<RunSearchLawQueryRequestThreadMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<RunSearchLawQueryRequestThreadMessages> getMessages() {
            return this.messages;
        }

    }

}
