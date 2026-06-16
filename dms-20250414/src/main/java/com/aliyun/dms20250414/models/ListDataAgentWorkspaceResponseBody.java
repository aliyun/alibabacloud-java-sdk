// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public ListDataAgentWorkspaceResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DMS-DA-40114</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>nu use</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token information.</p>
     * 
     * <strong>example:</strong>
     * <p>no use</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D2-*****-A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListDataAgentWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentWorkspaceResponseBody self = new ListDataAgentWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentWorkspaceResponseBody setData(ListDataAgentWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataAgentWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public ListDataAgentWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentWorkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentWorkspaceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentWorkspaceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentWorkspaceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListDataAgentWorkspaceResponseBodyDataContent extends TeaModel {
        /**
         * <p>The creation time of the workspace. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765960516</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The UID of the workspace creator.</p>
         * 
         * <strong>example:</strong>
         * <p>20282*****7591</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>space for test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("IsSessionShareEnabled")
        public Boolean isSessionShareEnabled;

        /**
         * <p>The most recent modification time of the workspace. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1765961516</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The role name of the user in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The number of members in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalMember")
        public Long totalMember;

        @NameInMap("Type")
        public String type;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspaceTest</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        /**
         * <p>The status of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("WorkspaceStatus")
        public String workspaceStatus;

        public static ListDataAgentWorkspaceResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentWorkspaceResponseBodyDataContent self = new ListDataAgentWorkspaceResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setIsSessionShareEnabled(Boolean isSessionShareEnabled) {
            this.isSessionShareEnabled = isSessionShareEnabled;
            return this;
        }
        public Boolean getIsSessionShareEnabled() {
            return this.isSessionShareEnabled;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setTotalMember(Long totalMember) {
            this.totalMember = totalMember;
            return this;
        }
        public Long getTotalMember() {
            return this.totalMember;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ListDataAgentWorkspaceResponseBodyDataContent setWorkspaceStatus(String workspaceStatus) {
            this.workspaceStatus = workspaceStatus;
            return this;
        }
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

    }

    public static class ListDataAgentWorkspaceResponseBodyData extends TeaModel {
        /**
         * <p>The configuration content.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListDataAgentWorkspaceResponseBodyDataContent> content;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of workspaces per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListDataAgentWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentWorkspaceResponseBodyData self = new ListDataAgentWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentWorkspaceResponseBodyData setContent(java.util.List<ListDataAgentWorkspaceResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDataAgentWorkspaceResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDataAgentWorkspaceResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAgentWorkspaceResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataAgentWorkspaceResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDataAgentWorkspaceResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
