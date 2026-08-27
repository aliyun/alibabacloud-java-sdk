// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateTeamResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public UpdateTeamResponseBodyData data;

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
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-update-team-001</p>
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
    public Boolean success;

    public static UpdateTeamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamResponseBody self = new UpdateTeamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTeamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTeamResponseBody setData(UpdateTeamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTeamResponseBodyData getData() {
        return this.data;
    }

    public UpdateTeamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateTeamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTeamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTeamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateTeamResponseBodyDataTeamMembers extends TeaModel {
        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>member-user</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTeamResponseBodyDataTeamMembers build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamResponseBodyDataTeamMembers self = new UpdateTeamResponseBodyDataTeamMembers();
            return TeaModel.build(map, self);
        }

        public UpdateTeamResponseBodyDataTeamMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTeamResponseBodyData extends TeaModel {
        /**
         * <p>The team administrator name.</p>
         * 
         * <strong>example:</strong>
         * <p>admin-user</p>
         */
        @NameInMap("AdminName")
        public String adminName;

        /**
         * <p>The time when the team was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T12:00:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The team description.</p>
         * 
         * <strong>example:</strong>
         * <p>Updated team description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-test-001</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The team leader name.</p>
         * 
         * <strong>example:</strong>
         * <p>leader-user</p>
         */
        @NameInMap("LeaderName")
        public String leaderName;

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-team</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The team member list.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("TeamMembers")
        public java.util.List<UpdateTeamResponseBodyDataTeamMembers> teamMembers;

        /**
         * <p>The time when the team was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-10T12:00:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The list of Worker names associated with the team.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;worker-1&quot;]</p>
         */
        @NameInMap("WorkerNames")
        public java.util.List<String> workerNames;

        public static UpdateTeamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTeamResponseBodyData self = new UpdateTeamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTeamResponseBodyData setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public UpdateTeamResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateTeamResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateTeamResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateTeamResponseBodyData setLeaderName(String leaderName) {
            this.leaderName = leaderName;
            return this;
        }
        public String getLeaderName() {
            return this.leaderName;
        }

        public UpdateTeamResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTeamResponseBodyData setTeamMembers(java.util.List<UpdateTeamResponseBodyDataTeamMembers> teamMembers) {
            this.teamMembers = teamMembers;
            return this;
        }
        public java.util.List<UpdateTeamResponseBodyDataTeamMembers> getTeamMembers() {
            return this.teamMembers;
        }

        public UpdateTeamResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateTeamResponseBodyData setWorkerNames(java.util.List<String> workerNames) {
            this.workerNames = workerNames;
            return this;
        }
        public java.util.List<String> getWorkerNames() {
            return this.workerNames;
        }

    }

}
