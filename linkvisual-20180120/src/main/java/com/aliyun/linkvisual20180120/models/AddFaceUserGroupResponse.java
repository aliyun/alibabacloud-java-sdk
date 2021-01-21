// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public AddFaceUserGroupResponseData data;

    public static AddFaceUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupResponse self = new AddFaceUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceUserGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddFaceUserGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFaceUserGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddFaceUserGroupResponse setData(AddFaceUserGroupResponseData data) {
        this.data = data;
        return this;
    }
    public AddFaceUserGroupResponseData getData() {
        return this.data;
    }

    public static class AddFaceUserGroupResponseData extends TeaModel {
        @NameInMap("UserGroupId")
        @Validation(required = true)
        public String userGroupId;

        @NameInMap("UserGroupName")
        @Validation(required = true)
        public String userGroupName;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static AddFaceUserGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceUserGroupResponseData self = new AddFaceUserGroupResponseData();
            return TeaModel.build(map, self);
        }

        public AddFaceUserGroupResponseData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public AddFaceUserGroupResponseData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public AddFaceUserGroupResponseData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

}
