// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTeamResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTeamResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("RoomId")
        public String roomId;

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
        @NameInMap("AdminName")
        public String adminName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LeaderName")
        public String leaderName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rooms")
        public java.util.List<GetTeamResponseBodyDataRooms> rooms;

        @NameInMap("Status")
        public String status;

        @NameInMap("TeamMembers")
        public java.util.List<GetTeamResponseBodyDataTeamMembers> teamMembers;

        @NameInMap("UpdatedAt")
        public String updatedAt;

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
