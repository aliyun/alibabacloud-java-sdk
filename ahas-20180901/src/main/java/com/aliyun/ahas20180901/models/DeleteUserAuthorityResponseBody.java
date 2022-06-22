// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteUserAuthorityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteUserAuthorityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteUserAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAuthorityResponseBody self = new DeleteUserAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserAuthorityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteUserAuthorityResponseBody setData(DeleteUserAuthorityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteUserAuthorityResponseBodyData getData() {
        return this.data;
    }

    public DeleteUserAuthorityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUserAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserAuthorityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteUserAuthorityResponseBodyData extends TeaModel {
        @NameInMap("delete")
        public String delete;

        @NameInMap("id")
        public Long id;

        @NameInMap("parentUid")
        public String parentUid;

        @NameInMap("roleType")
        public Integer roleType;

        @NameInMap("subUserId")
        public String subUserId;

        @NameInMap("userName")
        public String userName;

        public static DeleteUserAuthorityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteUserAuthorityResponseBodyData self = new DeleteUserAuthorityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteUserAuthorityResponseBodyData setDelete(String delete) {
            this.delete = delete;
            return this;
        }
        public String getDelete() {
            return this.delete;
        }

        public DeleteUserAuthorityResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteUserAuthorityResponseBodyData setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public DeleteUserAuthorityResponseBodyData setRoleType(Integer roleType) {
            this.roleType = roleType;
            return this;
        }
        public Integer getRoleType() {
            return this.roleType;
        }

        public DeleteUserAuthorityResponseBodyData setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public DeleteUserAuthorityResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
