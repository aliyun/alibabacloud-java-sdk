// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeByUrlResponseBody extends TeaModel {
    @NameInMap("node")
    public GetNodeByUrlResponseBodyNode node;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetNodeByUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByUrlResponseBody self = new GetNodeByUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeByUrlResponseBody setNode(GetNodeByUrlResponseBodyNode node) {
        this.node = node;
        return this;
    }
    public GetNodeByUrlResponseBodyNode getNode() {
        return this.node;
    }

    public GetNodeByUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNodeByUrlResponseBodyNodeStatisticalInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("WordCount")
        public Long wordCount;

        public static GetNodeByUrlResponseBodyNodeStatisticalInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeByUrlResponseBodyNodeStatisticalInfo self = new GetNodeByUrlResponseBodyNodeStatisticalInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeByUrlResponseBodyNodeStatisticalInfo setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

    public static class GetNodeByUrlResponseBodyNode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ALIDOC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>2023-05-15T11:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>01472825524039877041</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>adoc</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasChildren")
        public Boolean hasChildren;

        /**
         * <strong>example:</strong>
         * <p>2023-05-15T11:29Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>01472825524039877041</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>node_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>EpGBa2Lm8aRmzkkNhplMx1prWgN7R35y</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>READER</p>
         */
        @NameInMap("PermissionRole")
        public String permissionRole;

        /**
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("Size")
        public Long size;

        @NameInMap("StatisticalInfo")
        public GetNodeByUrlResponseBodyNodeStatisticalInfo statisticalInfo;

        /**
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>node_url</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>By8jQS1ZYjGn5b0M</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetNodeByUrlResponseBodyNode build(java.util.Map<String, ?> map) throws Exception {
            GetNodeByUrlResponseBodyNode self = new GetNodeByUrlResponseBodyNode();
            return TeaModel.build(map, self);
        }

        public GetNodeByUrlResponseBodyNode setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetNodeByUrlResponseBodyNode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetNodeByUrlResponseBodyNode setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetNodeByUrlResponseBodyNode setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetNodeByUrlResponseBodyNode setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public GetNodeByUrlResponseBodyNode setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetNodeByUrlResponseBodyNode setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetNodeByUrlResponseBodyNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeByUrlResponseBodyNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeByUrlResponseBodyNode setPermissionRole(String permissionRole) {
            this.permissionRole = permissionRole;
            return this;
        }
        public String getPermissionRole() {
            return this.permissionRole;
        }

        public GetNodeByUrlResponseBodyNode setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetNodeByUrlResponseBodyNode setStatisticalInfo(GetNodeByUrlResponseBodyNodeStatisticalInfo statisticalInfo) {
            this.statisticalInfo = statisticalInfo;
            return this;
        }
        public GetNodeByUrlResponseBodyNodeStatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        public GetNodeByUrlResponseBodyNode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetNodeByUrlResponseBodyNode setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetNodeByUrlResponseBodyNode setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
