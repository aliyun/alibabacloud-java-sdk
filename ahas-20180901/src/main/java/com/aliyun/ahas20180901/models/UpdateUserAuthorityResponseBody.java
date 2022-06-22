// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateUserAuthorityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateUserAuthorityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateUserAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthorityResponseBody self = new UpdateUserAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthorityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserAuthorityResponseBody setData(UpdateUserAuthorityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateUserAuthorityResponseBodyData getData() {
        return this.data;
    }

    public UpdateUserAuthorityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserAuthorityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateUserAuthorityResponseBodyData extends TeaModel {
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

        public static UpdateUserAuthorityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserAuthorityResponseBodyData self = new UpdateUserAuthorityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateUserAuthorityResponseBodyData setDelete(String delete) {
            this.delete = delete;
            return this;
        }
        public String getDelete() {
            return this.delete;
        }

        public UpdateUserAuthorityResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateUserAuthorityResponseBodyData setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public UpdateUserAuthorityResponseBodyData setRoleType(Integer roleType) {
            this.roleType = roleType;
            return this;
        }
        public Integer getRoleType() {
            return this.roleType;
        }

        public UpdateUserAuthorityResponseBodyData setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public UpdateUserAuthorityResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
