// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDynamicGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDeviceDynamicGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDeviceDynamicGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDynamicGroupResponseBody self = new CreateDeviceDynamicGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDynamicGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceDynamicGroupResponseBody setData(CreateDeviceDynamicGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceDynamicGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateDeviceDynamicGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeviceDynamicGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceDynamicGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDeviceDynamicGroupResponseBodyData extends TeaModel {
        @NameInMap("DynamicGroupExpression")
        public String dynamicGroupExpression;

        @NameInMap("GroupDesc")
        public String groupDesc;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateDeviceDynamicGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceDynamicGroupResponseBodyData self = new CreateDeviceDynamicGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceDynamicGroupResponseBodyData setDynamicGroupExpression(String dynamicGroupExpression) {
            this.dynamicGroupExpression = dynamicGroupExpression;
            return this;
        }
        public String getDynamicGroupExpression() {
            return this.dynamicGroupExpression;
        }

        public CreateDeviceDynamicGroupResponseBodyData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public CreateDeviceDynamicGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateDeviceDynamicGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateDeviceDynamicGroupResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
