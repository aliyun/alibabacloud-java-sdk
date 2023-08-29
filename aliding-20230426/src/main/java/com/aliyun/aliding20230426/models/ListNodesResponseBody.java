// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("nodes")
    public java.util.List<ListNodesResponseBodyNodes> nodes;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodesResponseBody setNodes(java.util.List<ListNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodesResponseBodyNodesStatisticalInfo extends TeaModel {
        @NameInMap("WordCount")
        public Long wordCount;

        public static ListNodesResponseBodyNodesStatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodesStatisticalInfo self = new ListNodesResponseBodyNodesStatisticalInfo();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodesStatisticalInfo setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

    public static class ListNodesResponseBodyNodes extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("HasChildren")
        public Boolean hasChildren;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PermissionRole")
        public String permissionRole;

        @NameInMap("Size")
        public Long size;

        @NameInMap("StatisticalInfo")
        public ListNodesResponseBodyNodesStatisticalInfo statisticalInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyNodes self = new ListNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyNodes setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListNodesResponseBodyNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNodesResponseBodyNodes setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListNodesResponseBodyNodes setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListNodesResponseBodyNodes setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public ListNodesResponseBodyNodes setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListNodesResponseBodyNodes setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListNodesResponseBodyNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNodesResponseBodyNodes setPermissionRole(String permissionRole) {
            this.permissionRole = permissionRole;
            return this;
        }
        public String getPermissionRole() {
            return this.permissionRole;
        }

        public ListNodesResponseBodyNodes setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListNodesResponseBodyNodes setStatisticalInfo(ListNodesResponseBodyNodesStatisticalInfo statisticalInfo) {
            this.statisticalInfo = statisticalInfo;
            return this;
        }
        public ListNodesResponseBodyNodesStatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        public ListNodesResponseBodyNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodesResponseBodyNodes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListNodesResponseBodyNodes setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
