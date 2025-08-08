// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListWorkspacesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UserNotExist</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>token-xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>EE214ECD-4330-503A-82F0-FFB03975****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setData(ListWorkspacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkspacesResponseBodyData getData() {
        return this.data;
    }

    public ListWorkspacesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkspacesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkspacesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkspacesResponseBodyDataBaseWorkspaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AlreadyJoined")
        public Boolean alreadyJoined;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <strong>example:</strong>
         * <p>work*****</p>
         */
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        /**
         * <strong>example:</strong>
         * <p>1344****</p>
         */
        @NameInMap("CreatorUid")
        public String creatorUid;

        /**
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>workspace-xxxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>hel****</p>
         */
        @NameInMap("OwnerNickName")
        public String ownerNickName;

        /**
         * <strong>example:</strong>
         * <p>15608564799****</p>
         */
        @NameInMap("OwnerUid")
        public String ownerUid;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ServiceAccountId")
        public Long serviceAccountId;

        /**
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("ServiceAccountNickName")
        public String serviceAccountNickName;

        /**
         * <strong>example:</strong>
         * <p>1422****</p>
         */
        @NameInMap("ServiceAccountUid")
        public String serviceAccountUid;

        /**
         * <strong>example:</strong>
         * <p>23456</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <strong>example:</strong>
         * <p>vpc-25fl3qjqb****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>8652340494****</p>
         */
        @NameInMap("WorkspaceId")
        public Long workspaceId;

        /**
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListWorkspacesResponseBodyDataBaseWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyDataBaseWorkspaces self = new ListWorkspacesResponseBodyDataBaseWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setAlreadyJoined(Boolean alreadyJoined) {
            this.alreadyJoined = alreadyJoined;
            return this;
        }
        public Boolean getAlreadyJoined() {
            return this.alreadyJoined;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setCreatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
            return this;
        }
        public String getCreatorUid() {
            return this.creatorUid;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setServiceAccountId(Long serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public Long getServiceAccountId() {
            return this.serviceAccountId;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setServiceAccountNickName(String serviceAccountNickName) {
            this.serviceAccountNickName = serviceAccountNickName;
            return this;
        }
        public String getServiceAccountNickName() {
            return this.serviceAccountNickName;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setServiceAccountUid(String serviceAccountUid) {
            this.serviceAccountUid = serviceAccountUid;
            return this;
        }
        public String getServiceAccountUid() {
            return this.serviceAccountUid;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspacesResponseBodyDataBaseWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListWorkspacesResponseBodyData extends TeaModel {
        @NameInMap("BaseWorkspaces")
        public java.util.List<ListWorkspacesResponseBodyDataBaseWorkspaces> baseWorkspaces;

        public static ListWorkspacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyData self = new ListWorkspacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyData setBaseWorkspaces(java.util.List<ListWorkspacesResponseBodyDataBaseWorkspaces> baseWorkspaces) {
            this.baseWorkspaces = baseWorkspaces;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyDataBaseWorkspaces> getBaseWorkspaces() {
            return this.baseWorkspaces;
        }

    }

}
