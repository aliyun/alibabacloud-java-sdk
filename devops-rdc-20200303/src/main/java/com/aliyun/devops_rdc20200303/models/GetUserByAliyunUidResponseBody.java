// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetUserByAliyunUidResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public GetUserByAliyunUidResponseBodyObject object;

    public static GetUserByAliyunUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAliyunUidResponseBody self = new GetUserByAliyunUidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByAliyunUidResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetUserByAliyunUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByAliyunUidResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public GetUserByAliyunUidResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserByAliyunUidResponseBody setObject(GetUserByAliyunUidResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetUserByAliyunUidResponseBodyObject getObject() {
        return this.object;
    }

    public static class GetUserByAliyunUidResponseBodyObject extends TeaModel {
        @NameInMap("AliyunPk")
        public String aliyunPk;

        @NameInMap("Email")
        public String email;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Phone")
        public String phone;

        public static GetUserByAliyunUidResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetUserByAliyunUidResponseBodyObject self = new GetUserByAliyunUidResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetUserByAliyunUidResponseBodyObject setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public GetUserByAliyunUidResponseBodyObject setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserByAliyunUidResponseBodyObject setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetUserByAliyunUidResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserByAliyunUidResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserByAliyunUidResponseBodyObject setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}
