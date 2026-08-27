// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTeamResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetTeamResponseBodyData data;

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
     * <p>req-get-team-001</p>
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

    public static GetTeamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTeamResponseBody self = new GetTeamResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTeamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTeamResponseBody setData(GetTeamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTeamResponseBodyData getData() {
        return this.data;
    }

    public GetTeamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTeamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTeamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTeamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTeamResponseBodyDataRooms extends TeaModel {
        /**
         * <p>The room ID.</p>
         * 
         * <strong>example:</strong>
         * <p>room-xxx</p>
         */
        @NameInMap("RoomId")
        public String roomId;

        /**
         * <p>The room type.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTeamResponseBodyDataRooms build(java.util.Map<String, ?> map) throws Exception {
            GetTeamResponseBodyDataRooms self = new GetTeamResponseBodyDataRooms();
            return TeaModel.build(map, self);
        }

        public GetTeamResponseBodyDataRooms setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetTeamResponseBodyDataRooms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTeamResponseBodyDataTeamMembers extends TeaModel {
        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>member-user</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetTeamResponseBodyDataTeamMembers build(java.util.Map<String, ?> map) throws Exception {
            GetTeamResponseBodyDataTeamMembers self = new GetTeamResponseBodyDataTeamMembers();
            return TeaModel.build(map, self);
        }

        public GetTeamResponseBodyDataTeamMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetTeamResponseBodyData extends TeaModel {
        /**
         * <p>The name of the team administrator.</p>
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
         * <p>This is a team.</p>
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
         * <p>The name of the team leader.</p>
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
         * <p>The list of rooms associated with the team.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Rooms")
        public java.util.List<GetTeamResponseBodyDataRooms> rooms;

        /**
         * <p>The running status of the team. This field is empty when the team is running normally.</p>
         * 
         * <strong>example:</strong>
         * <p>Deleting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of team members.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("TeamMembers")
        public java.util.List<GetTeamResponseBodyDataTeamMembers> teamMembers;

        /**
         * <p>The time when the team was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-10T12:00:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The list of worker names associated with the team.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;worker-1&quot;]</p>
         */
        @NameInMap("WorkerNames")
        public java.util.List<String> workerNames;

        public static GetTeamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTeamResponseBodyData self = new GetTeamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTeamResponseBodyData setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public GetTeamResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTeamResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTeamResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTeamResponseBodyData setLeaderName(String leaderName) {
            this.leaderName = leaderName;
            return this;
        }
        public String getLeaderName() {
            return this.leaderName;
        }

        public GetTeamResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTeamResponseBodyData setRooms(java.util.List<GetTeamResponseBodyDataRooms> rooms) {
            this.rooms = rooms;
            return this;
        }
        public java.util.List<GetTeamResponseBodyDataRooms> getRooms() {
            return this.rooms;
        }

        public GetTeamResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTeamResponseBodyData setTeamMembers(java.util.List<GetTeamResponseBodyDataTeamMembers> teamMembers) {
            this.teamMembers = teamMembers;
            return this;
        }
        public java.util.List<GetTeamResponseBodyDataTeamMembers> getTeamMembers() {
            return this.teamMembers;
        }

        public GetTeamResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetTeamResponseBodyData setWorkerNames(java.util.List<String> workerNames) {
            this.workerNames = workerNames;
            return this;
        }
        public java.util.List<String> getWorkerNames() {
            return this.workerNames;
        }

    }

}
