// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRelatedWorkspacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    @NameInMap("workspaces")
    public java.util.List<GetRelatedWorkspacesResponseBodyWorkspaces> workspaces;

    public static GetRelatedWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedWorkspacesResponseBody self = new GetRelatedWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRelatedWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRelatedWorkspacesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetRelatedWorkspacesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public GetRelatedWorkspacesResponseBody setWorkspaces(java.util.List<GetRelatedWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<GetRelatedWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class GetRelatedWorkspacesResponseBodyWorkspacesRecentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1638256965936</p>
         */
        @NameInMap("LastEditTime")
        public Long lastEditTime;

        /**
         * <strong>example:</strong>
         * <p>知识库</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>nb9XxxxxxxmyAp</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alidocs.xxxx/nb9XJKdxxxxmyAp">https://alidocs.xxxx/nb9XJKdxxxxmyAp</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetRelatedWorkspacesResponseBodyWorkspacesRecentList build(java.util.Map<String, ?> map) throws Exception {
            GetRelatedWorkspacesResponseBodyWorkspacesRecentList self = new GetRelatedWorkspacesResponseBodyWorkspacesRecentList();
            return TeaModel.build(map, self);
        }

        public GetRelatedWorkspacesResponseBodyWorkspacesRecentList setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public GetRelatedWorkspacesResponseBodyWorkspacesRecentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRelatedWorkspacesResponseBodyWorkspacesRecentList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetRelatedWorkspacesResponseBodyWorkspacesRecentList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetRelatedWorkspacesResponseBodyWorkspaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1638256965936</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>知识库</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Q2xwPOKiSLxxxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("RecentList")
        public java.util.List<GetRelatedWorkspacesResponseBodyWorkspacesRecentList> recentList;

        /**
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alidocs.xxxx/nb9XJKdxxxxmyAp/docs/nb9XxxxxxxmyAp">https://alidocs.xxxx/nb9XJKdxxxxmyAp/docs/nb9XxxxxxxmyAp</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>nb9XJKdxxxxmyAp</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetRelatedWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            GetRelatedWorkspacesResponseBodyWorkspaces self = new GetRelatedWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setRecentList(java.util.List<GetRelatedWorkspacesResponseBodyWorkspacesRecentList> recentList) {
            this.recentList = recentList;
            return this;
        }
        public java.util.List<GetRelatedWorkspacesResponseBodyWorkspacesRecentList> getRecentList() {
            return this.recentList;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetRelatedWorkspacesResponseBodyWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
