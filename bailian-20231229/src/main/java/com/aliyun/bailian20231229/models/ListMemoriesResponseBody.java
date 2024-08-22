// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("memories")
    public java.util.List<ListMemoriesResponseBodyMemories> memories;

    /**
     * <strong>example:</strong>
     * <p>dc270401186b433f975d7e1faaa34e0e</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-114029103cad</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>105</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>llm-us9hjmt32nysdm5v</p>
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
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>3fc531f4519444beaafffa4538f60667</p>
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
