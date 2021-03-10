// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySuperDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QuerySuperDeviceGroupResponseBodyData data;

    public static QuerySuperDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySuperDeviceGroupResponseBody self = new QuerySuperDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySuperDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySuperDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySuperDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySuperDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySuperDeviceGroupResponseBody setData(QuerySuperDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySuperDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySuperDeviceGroupResponseBodyDataGroupInfo extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupDesc")
        public String groupDesc;

        public static QuerySuperDeviceGroupResponseBodyDataGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySuperDeviceGroupResponseBodyDataGroupInfo self = new QuerySuperDeviceGroupResponseBodyDataGroupInfo();
            return TeaModel.build(map, self);
        }

        public QuerySuperDeviceGroupResponseBodyDataGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySuperDeviceGroupResponseBodyDataGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QuerySuperDeviceGroupResponseBodyDataGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

    public static class QuerySuperDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("GroupInfo")
        public java.util.List<QuerySuperDeviceGroupResponseBodyDataGroupInfo> groupInfo;

        public static QuerySuperDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySuperDeviceGroupResponseBodyData self = new QuerySuperDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySuperDeviceGroupResponseBodyData setGroupInfo(java.util.List<QuerySuperDeviceGroupResponseBodyDataGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QuerySuperDeviceGroupResponseBodyDataGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
