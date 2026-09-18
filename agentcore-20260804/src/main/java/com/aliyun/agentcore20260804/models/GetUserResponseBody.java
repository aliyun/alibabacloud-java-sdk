// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The user details.</p>
     */
    @NameInMap("data")
    public GetUserResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserResponseBody setData(GetUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserResponseBodyData getData() {
        return this.data;
    }

    public GetUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserResponseBodyData extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        @NameInMap("agentCoreUserId")
        public String agentCoreUserId;

        /**
         * <p>The authentication method of the user. password indicates local password authentication of the workspace. dingtalk and feishu indicate that the user is synchronized and authenticated by the corresponding external identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("authMethod")
        public String authMethod;

        /**
         * <p>The creation time in UTC, formatted in RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The display name of the user. The name is 1 to 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The email address of the user. The address can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user-01@example.com">user-01@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>The username. The username must be unique within the workspace and can contain only lowercase letters, digits, and hyphens (-). It must start and end with a lowercase letter or digit. The username is 1 to 32 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>user-01</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The remarks of the user. The remarks can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Member of the agent operations team</p>
         */
        @NameInMap("note")
        public String note;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The user status. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Active</li>
         * <li>Updating</li>
         * <li>Deleting</li>
         * <li>Failed</li>
         * <li>DeleteFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time of the last modification in UTC, formatted in RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyData self = new GetUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyData setAgentCoreUserId(String agentCoreUserId) {
            this.agentCoreUserId = agentCoreUserId;
            return this;
        }
        public String getAgentCoreUserId() {
            return this.agentCoreUserId;
        }

        public GetUserResponseBodyData setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
            return this;
        }
        public String getAuthMethod() {
            return this.authMethod;
        }

        public GetUserResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetUserResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetUserResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetUserResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetUserResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
