// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetTokenPlanAccountDetailResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetTokenPlanAccountDetailResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0DC05D9-C506-519B-AFF3-2B00165176E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTokenPlanAccountDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPlanAccountDetailResponseBody self = new GetTokenPlanAccountDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenPlanAccountDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTokenPlanAccountDetailResponseBody setData(GetTokenPlanAccountDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenPlanAccountDetailResponseBodyData getData() {
        return this.data;
    }

    public GetTokenPlanAccountDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTokenPlanAccountDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenPlanAccountDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenPlanAccountDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces extends TeaModel {
        /**
         * <p>The member status. Valid values:</p>
         * <ul>
         * <li>ACTIVE </li>
         * <li>FROZEN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("MemberStatus")
        public String memberStatus;

        /**
         * <p>The workspace role code. Valid values:</p>
         * <ul>
         * <li>WS_ADMIN</li>
         * <li>WS_MEMBER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WS_ADMIN</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        /**
         * <p>The workspace role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ROLE_WS_ADMIN</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_123456789</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces self = new GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces();
            return TeaModel.build(map, self);
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public String getMemberStatus() {
            return this.memberStatus;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetTokenPlanAccountDetailResponseBodyDataOrgMemberships extends TeaModel {
        /**
         * <p>The organization member status. Valid values:</p>
         * <ul>
         * <li>ACTIVE </li>
         * <li>INITIAL </li>
         * <li>FROZEN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("MemberStatus")
        public String memberStatus;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_123456789</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The organization role code. Valid values:</p>
         * <ul>
         * <li>ORG_OWNER</li>
         * <li>ORG_ADMIN</li>
         * <li>ORG_MEMBER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORG_MEMBER</p>
         */
        @NameInMap("RoleCode")
        public String roleCode;

        /**
         * <p>The organization role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ROLE_ORG_OWNER</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The list of workspaces that the account has joined under the organization.</p>
         */
        @NameInMap("Workspaces")
        public java.util.List<GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces> workspaces;

        public static GetTokenPlanAccountDetailResponseBodyDataOrgMemberships build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPlanAccountDetailResponseBodyDataOrgMemberships self = new GetTokenPlanAccountDetailResponseBodyDataOrgMemberships();
            return TeaModel.build(map, self);
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMemberships setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public String getMemberStatus() {
            return this.memberStatus;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMemberships setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMemberships setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMemberships setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetTokenPlanAccountDetailResponseBodyDataOrgMemberships setWorkspaces(java.util.List<GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<GetTokenPlanAccountDetailResponseBodyDataOrgMembershipsWorkspaces> getWorkspaces() {
            return this.workspaces;
        }

    }

    public static class GetTokenPlanAccountDetailResponseBodyData extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li>ALIYUN </li>
         * <li>SSO </li>
         * <li>SA</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The Alibaba Cloud UID. This parameter applies only to accounts of the ALIYUN type.</p>
         * 
         * <strong>example:</strong>
         * <p>1122334455</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The time when the account was created.</p>
         * 
         * <strong>example:</strong>
         * <p>Thu May 28 14:33:52 CST 2026</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The email address. This parameter applies only to accounts of the SSO type.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@email.com">test@email.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The global status of the account. A value of 0 indicates Normal. A value of 1 indicates Frozen.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of organization memberships in a tree structure (organization → workspace).</p>
         */
        @NameInMap("OrgMemberships")
        public java.util.List<GetTokenPlanAccountDetailResponseBodyDataOrgMemberships> orgMemberships;

        public static GetTokenPlanAccountDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPlanAccountDetailResponseBodyData self = new GetTokenPlanAccountDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenPlanAccountDetailResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetTokenPlanAccountDetailResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetTokenPlanAccountDetailResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public GetTokenPlanAccountDetailResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTokenPlanAccountDetailResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetTokenPlanAccountDetailResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetTokenPlanAccountDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTokenPlanAccountDetailResponseBodyData setOrgMemberships(java.util.List<GetTokenPlanAccountDetailResponseBodyDataOrgMemberships> orgMemberships) {
            this.orgMemberships = orgMemberships;
            return this;
        }
        public java.util.List<GetTokenPlanAccountDetailResponseBodyDataOrgMemberships> getOrgMemberships() {
            return this.orgMemberships;
        }

    }

}
