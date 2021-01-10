// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddFaceUserGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static AddFaceUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupResponseBody self = new AddFaceUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceUserGroupResponseBody setData(AddFaceUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceUserGroupResponseBodyData getData() {
        return this.data;
    }

    public AddFaceUserGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddFaceUserGroupResponseBodyData extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

        public static AddFaceUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceUserGroupResponseBodyData self = new AddFaceUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceUserGroupResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public AddFaceUserGroupResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public AddFaceUserGroupResponseBodyData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
