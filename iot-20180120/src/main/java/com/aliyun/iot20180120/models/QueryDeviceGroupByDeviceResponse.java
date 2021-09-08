// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByDeviceResponse extends TeaModel {
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

    @NameInMap("GroupInfos")
    @Validation(required = true)
    public QueryDeviceGroupByDeviceResponseGroupInfos groupInfos;

    public static QueryDeviceGroupByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByDeviceResponse self = new QueryDeviceGroupByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupByDeviceResponse setGroupInfos(QueryDeviceGroupByDeviceResponseGroupInfos groupInfos) {
        this.groupInfos = groupInfos;
        return this;
    }
    public QueryDeviceGroupByDeviceResponseGroupInfos getGroupInfos() {
        return this.groupInfos;
    }

    public static class QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("GroupDesc")
        @Validation(required = true)
        public String groupDesc;

        public static QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo self = new QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

    }

    public static class QueryDeviceGroupByDeviceResponseGroupInfos extends TeaModel {
        @NameInMap("GroupInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo> groupInfo;

        public static QueryDeviceGroupByDeviceResponseGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByDeviceResponseGroupInfos self = new QueryDeviceGroupByDeviceResponseGroupInfos();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByDeviceResponseGroupInfos setGroupInfo(java.util.List<QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo> groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public java.util.List<QueryDeviceGroupByDeviceResponseGroupInfosGroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

    }

}
