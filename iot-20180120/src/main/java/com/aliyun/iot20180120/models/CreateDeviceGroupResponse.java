// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupResponse extends TeaModel {
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
    public CreateDeviceGroupResponseData data;

    public static CreateDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupResponse self = new CreateDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDeviceGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeviceGroupResponse setData(CreateDeviceGroupResponseData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceGroupResponseData getData() {
        return this.data;
    }

    public static class CreateDeviceGroupResponseData extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupDesc")
        @Validation(required = true)
        public String groupDesc;

        public static CreateDeviceGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceGroupResponseData self = new CreateDeviceGroupResponseData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceGroupResponseData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateDeviceGroupResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateDeviceGroupResponseData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateDeviceGroupResponseData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

}
