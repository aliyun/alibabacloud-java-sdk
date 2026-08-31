// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgAuthorizedWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The request result.</p>
     */
    @NameInMap("Data")
    public GetKgAuthorizedWorkspacesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKgAuthorizedWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKgAuthorizedWorkspacesResponseBody self = new GetKgAuthorizedWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKgAuthorizedWorkspacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKgAuthorizedWorkspacesResponseBody setData(GetKgAuthorizedWorkspacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKgAuthorizedWorkspacesResponseBodyData getData() {
        return this.data;
    }

    public GetKgAuthorizedWorkspacesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKgAuthorizedWorkspacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKgAuthorizedWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKgAuthorizedWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList extends TeaModel {
        /**
         * <p>The code of the workspace role.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKSPACE_ADMIN</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the workspace role.</p>
         * 
         * <strong>example:</strong>
         * <p>Storage management</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList build(java.util.Map<String, ?> map) throws Exception {
            GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList self = new GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList();
            return TeaModel.build(map, self);
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList extends TeaModel {
        /**
         * <p>The description of the knowledge graph workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time of the knowledge graph workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25 12:34:56</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The latest publish time of the knowledge graph workspace. This value is empty if the workspace has never been published successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25 12:34:56</p>
         */
        @NameInMap("LastPublishTime")
        public String lastPublishTime;

        /**
         * <p>The latest publish version number of the knowledge graph workspace. This value is empty if the workspace has never been published successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LastPublishVersion")
        public Integer lastPublishVersion;

        /**
         * <p>The name of the knowledge graph workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of roles assigned to the specified user in the workspace. This is an empty list if the user is not a member of the workspace.</p>
         */
        @NameInMap("RoleList")
        public java.util.List<GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList> roleList;

        /**
         * <p>The ID of the knowledge graph workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>abc1011</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList build(java.util.Map<String, ?> map) throws Exception {
            GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList self = new GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList();
            return TeaModel.build(map, self);
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setLastPublishTime(String lastPublishTime) {
            this.lastPublishTime = lastPublishTime;
            return this;
        }
        public String getLastPublishTime() {
            return this.lastPublishTime;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setLastPublishVersion(Integer lastPublishVersion) {
            this.lastPublishVersion = lastPublishVersion;
            return this;
        }
        public Integer getLastPublishVersion() {
            return this.lastPublishVersion;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setRoleList(java.util.List<GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceListRoleList> getRoleList() {
            return this.roleList;
        }

        public GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetKgAuthorizedWorkspacesResponseBodyData extends TeaModel {
        /**
         * <p>The total number of knowledge graph workspaces that the user has permissions on.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The list of knowledge graph workspaces that the user has permissions on.</p>
         */
        @NameInMap("WorkspaceList")
        public java.util.List<GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList> workspaceList;

        public static GetKgAuthorizedWorkspacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKgAuthorizedWorkspacesResponseBodyData self = new GetKgAuthorizedWorkspacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKgAuthorizedWorkspacesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetKgAuthorizedWorkspacesResponseBodyData setWorkspaceList(java.util.List<GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList> workspaceList) {
            this.workspaceList = workspaceList;
            return this;
        }
        public java.util.List<GetKgAuthorizedWorkspacesResponseBodyDataWorkspaceList> getWorkspaceList() {
            return this.workspaceList;
        }

    }

}
