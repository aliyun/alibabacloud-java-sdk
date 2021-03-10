// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoResponse extends TeaModel {
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
    public QueryDeviceGroupInfoResponseData data;

    public static QueryDeviceGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoResponse self = new QueryDeviceGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupInfoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupInfoResponse setData(QueryDeviceGroupInfoResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupInfoResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupInfoResponseData extends TeaModel {
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

        @NameInMap("DeviceCount")
        @Validation(required = true)
        public Integer deviceCount;

        @NameInMap("DeviceActive")
        @Validation(required = true)
        public Integer deviceActive;

        @NameInMap("DeviceOnline")
        @Validation(required = true)
        public Integer deviceOnline;

        public static QueryDeviceGroupInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupInfoResponseData self = new QueryDeviceGroupInfoResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupInfoResponseData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupInfoResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceGroupInfoResponseData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupInfoResponseData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QueryDeviceGroupInfoResponseData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryDeviceGroupInfoResponseData setDeviceActive(Integer deviceActive) {
            this.deviceActive = deviceActive;
            return this;
        }
        public Integer getDeviceActive() {
            return this.deviceActive;
        }

        public QueryDeviceGroupInfoResponseData setDeviceOnline(Integer deviceOnline) {
            this.deviceOnline = deviceOnline;
            return this;
        }
        public Integer getDeviceOnline() {
            return this.deviceOnline;
        }

    }

}
