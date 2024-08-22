// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoryNodesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("memoryNodes")
    public java.util.List<ListMemoryNodesResponseBodyMemoryNodes> memoryNodes;

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
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMemoryNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryNodesResponseBody self = new ListMemoryNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoryNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryNodesResponseBody setMemoryNodes(java.util.List<ListMemoryNodesResponseBodyMemoryNodes> memoryNodes) {
        this.memoryNodes = memoryNodes;
        return this;
    }
    public java.util.List<ListMemoryNodesResponseBodyMemoryNodes> getMemoryNodes() {
        return this.memoryNodes;
    }

    public ListMemoryNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoryNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemoryNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMemoryNodesResponseBodyMemoryNodes extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>68de06c95368463a8be4a84efc872cc5</p>
         */
        @NameInMap("memoryNodeId")
        public String memoryNodeId;

        public static ListMemoryNodesResponseBodyMemoryNodes build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryNodesResponseBodyMemoryNodes self = new ListMemoryNodesResponseBodyMemoryNodes();
            return TeaModel.build(map, self);
        }

        public ListMemoryNodesResponseBodyMemoryNodes setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMemoryNodesResponseBodyMemoryNodes setMemoryNodeId(String memoryNodeId) {
            this.memoryNodeId = memoryNodeId;
            return this;
        }
        public String getMemoryNodeId() {
            return this.memoryNodeId;
        }

    }

}
