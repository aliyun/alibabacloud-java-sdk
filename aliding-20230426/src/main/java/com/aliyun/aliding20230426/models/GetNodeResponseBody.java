// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeResponseBody extends TeaModel {
    @NameInMap("node")
    public GetNodeResponseBodyNode node;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponseBody self = new GetNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeResponseBody setNode(GetNodeResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public GetNodeResponseBodyNode getNode() {
        return this.node;
    }

    public GetNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNodeResponseBodyNodeStatisticalInfo extends TeaModel {
        @NameInMap("WordCount")
        public Long wordCount;

        public static GetNodeResponseBodyNodeStatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyNodeStatisticalInfo self = new GetNodeResponseBodyNodeStatisticalInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyNodeStatisticalInfo setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

    public static class GetNodeResponseBodyNode extends TeaModel {
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
        public GetNodeResponseBodyNodeStatisticalInfo statisticalInfo;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetNodeResponseBodyNode build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyNode self = new GetNodeResponseBodyNode();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyNode setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetNodeResponseBodyNode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetNodeResponseBodyNode setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetNodeResponseBodyNode setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetNodeResponseBodyNode setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public GetNodeResponseBodyNode setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetNodeResponseBodyNode setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetNodeResponseBodyNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeResponseBodyNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeResponseBodyNode setPermissionRole(String permissionRole) {
            this.permissionRole = permissionRole;
            return this;
        }
        public String getPermissionRole() {
            return this.permissionRole;
        }

        public GetNodeResponseBodyNode setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetNodeResponseBodyNode setStatisticalInfo(GetNodeResponseBodyNodeStatisticalInfo statisticalInfo) {
            this.statisticalInfo = statisticalInfo;
            return this;
        }
        public GetNodeResponseBodyNodeStatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        public GetNodeResponseBodyNode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetNodeResponseBodyNode setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetNodeResponseBodyNode setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
