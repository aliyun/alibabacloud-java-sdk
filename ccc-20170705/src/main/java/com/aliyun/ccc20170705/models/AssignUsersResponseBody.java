// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AssignUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AssignUsersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AssignUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignUsersResponseBody self = new AssignUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssignUsersResponseBody setData(AssignUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AssignUsersResponseBodyData getData() {
        return this.data;
    }

    public AssignUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AssignUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssignUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssignUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AssignUsersResponseBodyDataUser extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("UserId")
        public String userId;

        public static AssignUsersResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            AssignUsersResponseBodyDataUser self = new AssignUsersResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public AssignUsersResponseBodyDataUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AssignUsersResponseBodyDataUser setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public AssignUsersResponseBodyDataUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public AssignUsersResponseBodyDataUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AssignUsersResponseBodyData extends TeaModel {
        @NameInMap("User")
        public java.util.List<AssignUsersResponseBodyDataUser> user;

        public static AssignUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AssignUsersResponseBodyData self = new AssignUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AssignUsersResponseBodyData setUser(java.util.List<AssignUsersResponseBodyDataUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<AssignUsersResponseBodyDataUser> getUser() {
            return this.user;
        }

    }

}
