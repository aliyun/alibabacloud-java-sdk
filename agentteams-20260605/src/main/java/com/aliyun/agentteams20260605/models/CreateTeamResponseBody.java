// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateTeamResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTeamResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTeamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamResponseBody self = new CreateTeamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTeamResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTeamResponseBody setData(CreateTeamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTeamResponseBodyData getData() {
        return this.data;
    }

    public CreateTeamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTeamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTeamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTeamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTeamResponseBodyDataTeamMembers extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static CreateTeamResponseBodyDataTeamMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamResponseBodyDataTeamMembers self = new CreateTeamResponseBodyDataTeamMembers();
            return TeaModel.build(map, self);
        }

        public CreateTeamResponseBodyDataTeamMembers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateTeamResponseBodyData extends TeaModel {
        @NameInMap("AdminName")
        public String adminName;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TeamMembers")
        public java.util.List<CreateTeamResponseBodyDataTeamMembers> teamMembers;

        public static CreateTeamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTeamResponseBodyData self = new CreateTeamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTeamResponseBodyData setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public CreateTeamResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTeamResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateTeamResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTeamResponseBodyData setTeamMembers(java.util.List<CreateTeamResponseBodyDataTeamMembers> teamMembers) {
            this.teamMembers = teamMembers;
            return this;
        }
        public java.util.List<CreateTeamResponseBodyDataTeamMembers> getTeamMembers() {
            return this.teamMembers;
        }

    }

}
