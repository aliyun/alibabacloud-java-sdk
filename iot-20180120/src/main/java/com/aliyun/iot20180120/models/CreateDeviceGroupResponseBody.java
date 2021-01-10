// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDeviceGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupResponseBody self = new CreateDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceGroupResponseBody setData(CreateDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("GroupDesc")
        public String groupDesc;

        public static CreateDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceGroupResponseBodyData self = new CreateDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateDeviceGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateDeviceGroupResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateDeviceGroupResponseBodyData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

}
