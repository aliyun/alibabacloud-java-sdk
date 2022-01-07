// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("GroupInfos")
    public QueryDeviceGroupByDeviceResponseBodyGroupInfos groupInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceGroupByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByDeviceResponseBody self = new QueryDeviceGroupByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupByDeviceResponseBody setGroupInfos(QueryDeviceGroupByDeviceResponseBodyGroupInfos groupInfos) {
        this.groupInfos = groupInfos;
        return this;
    }
    public QueryDeviceGroupByDeviceResponseBodyGroupInfos getGroupInfos() {
        return this.groupInfos;
    }

    public QueryDeviceGroupByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo extends TeaModel {
        @NameInMap("GroupDesc")
        public String groupDesc;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo self = new QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

    public static class QueryDeviceGroupByDeviceResponseBodyGroupInfos extends TeaModel {
        @NameInMap("GroupInfo")
        public java.util.List<QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo> groupInfo;

        public static QueryDeviceGroupByDeviceResponseBodyGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByDeviceResponseBodyGroupInfos self = new QueryDeviceGroupByDeviceResponseBodyGroupInfos();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByDeviceResponseBodyGroupInfos setGroupInfo(java.util.List<QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupByDeviceResponseBodyGroupInfosGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
