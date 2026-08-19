// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class BrowseFilesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message. The value <code>successful</code> is returned if the request was successful. An error message is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token for the next page of results. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ***Q==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Nodes")
    public BrowseFilesResponseBodyNodes nodes;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>843F7A45-8B***35-ECECBE5E5F78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static BrowseFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BrowseFilesResponseBody self = new BrowseFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public BrowseFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BrowseFilesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BrowseFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BrowseFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BrowseFilesResponseBody setNodes(BrowseFilesResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public BrowseFilesResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public BrowseFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public BrowseFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public BrowseFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BrowseFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BrowseFilesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class BrowseFilesResponseBodyNodesNode extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Subtree")
        public String subtree;

        @NameInMap("Type")
        public String type;

        public static BrowseFilesResponseBodyNodesNode build(java.util.Map<String, ?> map) throws Exception {
            BrowseFilesResponseBodyNodesNode self = new BrowseFilesResponseBodyNodesNode();
            return TeaModel.build(map, self);
        }

        public BrowseFilesResponseBodyNodesNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BrowseFilesResponseBodyNodesNode setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public BrowseFilesResponseBodyNodesNode setSubtree(String subtree) {
            this.subtree = subtree;
            return this;
        }
        public String getSubtree() {
            return this.subtree;
        }

        public BrowseFilesResponseBodyNodesNode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class BrowseFilesResponseBodyNodes extends TeaModel {
        @NameInMap("Node")
        public java.util.List<BrowseFilesResponseBodyNodesNode> node;

        public static BrowseFilesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            BrowseFilesResponseBodyNodes self = new BrowseFilesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public BrowseFilesResponseBodyNodes setNode(java.util.List<BrowseFilesResponseBodyNodesNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<BrowseFilesResponseBodyNodesNode> getNode() {
            return this.node;
        }

    }

}
