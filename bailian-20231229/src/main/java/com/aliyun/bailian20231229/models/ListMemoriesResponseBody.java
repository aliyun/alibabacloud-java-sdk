// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoriesResponseBody extends TeaModel {
    /**
     * <p>The number of long-term memory entities per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The long-term memory entity list.</p>
     */
    @NameInMap("memories")
    public java.util.List<ListMemoriesResponseBodyMemories> memories;

    /**
     * <p>The pagination token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>dc270401186b433f975d7e1faaa3xxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-11402910xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>105</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>The ID of the workspace to which the long-term memory entity list belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-3z7uw7fwz0vexxxx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoriesResponseBody self = new ListMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoriesResponseBody setMemories(java.util.List<ListMemoriesResponseBodyMemories> memories) {
        this.memories = memories;
        return this;
    }
    public java.util.List<ListMemoriesResponseBodyMemories> getMemories() {
        return this.memories;
    }

    public ListMemoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListMemoriesResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListMemoriesResponseBodyMemories extends TeaModel {
        /**
         * <p>The description of the long-term memory.</p>
         * 
         * <strong>example:</strong>
         * <p>我的大模型应用$APP_ID关于A用户的长期记忆体</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The long-term memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3fc531f4519444beaafffa4538f6xxxx</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        public static ListMemoriesResponseBodyMemories build(java.util.Map<String, ?> map) throws Exception {
            ListMemoriesResponseBodyMemories self = new ListMemoriesResponseBodyMemories();
            return TeaModel.build(map, self);
        }

        public ListMemoriesResponseBodyMemories setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMemoriesResponseBodyMemories setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

    }

}
