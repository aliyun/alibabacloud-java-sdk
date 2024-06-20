// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDefaultWorkspaceResponseBody extends TeaModel {
    @NameInMap("Conditions")
    public java.util.List<GetDefaultWorkspaceResponseBodyConditions> conditions;

    /**
     * <strong>example:</strong>
     * <p>17915******4216</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>workspace description example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>workspace-example</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Owner")
    public GetDefaultWorkspaceResponseBodyOwner owner;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>workspace-example</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetDefaultWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultWorkspaceResponseBody self = new GetDefaultWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultWorkspaceResponseBody setConditions(java.util.List<GetDefaultWorkspaceResponseBodyConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<GetDefaultWorkspaceResponseBodyConditions> getConditions() {
        return this.conditions;
    }

    public GetDefaultWorkspaceResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetDefaultWorkspaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDefaultWorkspaceResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetDefaultWorkspaceResponseBody setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public GetDefaultWorkspaceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetDefaultWorkspaceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetDefaultWorkspaceResponseBody setOwner(GetDefaultWorkspaceResponseBodyOwner owner) {
        this.owner = owner;
        return this;
    }
    public GetDefaultWorkspaceResponseBodyOwner getOwner() {
        return this.owner;
    }

    public GetDefaultWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDefaultWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetDefaultWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class GetDefaultWorkspaceResponseBodyConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Long code;

        /**
         * <strong>example:</strong>
         * <p>Create Failed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDefaultWorkspaceResponseBodyConditions build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultWorkspaceResponseBodyConditions self = new GetDefaultWorkspaceResponseBodyConditions();
            return TeaModel.build(map, self);
        }

        public GetDefaultWorkspaceResponseBodyConditions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public GetDefaultWorkspaceResponseBodyConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDefaultWorkspaceResponseBodyConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDefaultWorkspaceResponseBodyOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17915******4216</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>17915******4216</p>
         */
        @NameInMap("UserKp")
        public String userKp;

        /**
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetDefaultWorkspaceResponseBodyOwner build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultWorkspaceResponseBodyOwner self = new GetDefaultWorkspaceResponseBodyOwner();
            return TeaModel.build(map, self);
        }

        public GetDefaultWorkspaceResponseBodyOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDefaultWorkspaceResponseBodyOwner setUserKp(String userKp) {
            this.userKp = userKp;
            return this;
        }
        public String getUserKp() {
            return this.userKp;
        }

        public GetDefaultWorkspaceResponseBodyOwner setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
