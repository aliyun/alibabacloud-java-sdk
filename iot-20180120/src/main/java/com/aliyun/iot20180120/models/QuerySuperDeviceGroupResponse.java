// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySuperDeviceGroupResponse extends TeaModel {
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
    public QuerySuperDeviceGroupResponseData data;

    public static QuerySuperDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySuperDeviceGroupResponse self = new QuerySuperDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QuerySuperDeviceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySuperDeviceGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySuperDeviceGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySuperDeviceGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySuperDeviceGroupResponse setData(QuerySuperDeviceGroupResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySuperDeviceGroupResponseData getData() {
        return this.data;
    }

    public static class QuerySuperDeviceGroupResponseDataGroupInfo extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupDesc")
        @Validation(required = true)
        public String groupDesc;

        public static QuerySuperDeviceGroupResponseDataGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySuperDeviceGroupResponseDataGroupInfo self = new QuerySuperDeviceGroupResponseDataGroupInfo();
            return TeaModel.build(map, self);
        }

        public QuerySuperDeviceGroupResponseDataGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySuperDeviceGroupResponseDataGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QuerySuperDeviceGroupResponseDataGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

    public static class QuerySuperDeviceGroupResponseData extends TeaModel {
        @NameInMap("GroupInfo")
        @Validation(required = true)
        public java.util.List<QuerySuperDeviceGroupResponseDataGroupInfo> groupInfo;

        public static QuerySuperDeviceGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySuperDeviceGroupResponseData self = new QuerySuperDeviceGroupResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySuperDeviceGroupResponseData setGroupInfo(java.util.List<QuerySuperDeviceGroupResponseDataGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QuerySuperDeviceGroupResponseDataGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
