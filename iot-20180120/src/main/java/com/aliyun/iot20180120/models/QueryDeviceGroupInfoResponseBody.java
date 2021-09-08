// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceGroupInfoResponseBodyData data;

    public static QueryDeviceGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoResponseBody self = new QueryDeviceGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupInfoResponseBody setData(QueryDeviceGroupInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupInfoResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupInfoResponseBodyData extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupDesc")
        public String groupDesc;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("DeviceActive")
        public Integer deviceActive;

        @NameInMap("DeviceOnline")
        public Integer deviceOnline;

        public static QueryDeviceGroupInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupInfoResponseBodyData self = new QueryDeviceGroupInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupInfoResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupInfoResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceGroupInfoResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupInfoResponseBodyData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QueryDeviceGroupInfoResponseBodyData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryDeviceGroupInfoResponseBodyData setDeviceActive(Integer deviceActive) {
            this.deviceActive = deviceActive;
            return this;
        }
        public Integer getDeviceActive() {
            return this.deviceActive;
        }

        public QueryDeviceGroupInfoResponseBodyData setDeviceOnline(Integer deviceOnline) {
            this.deviceOnline = deviceOnline;
            return this;
        }
        public Integer getDeviceOnline() {
            return this.deviceOnline;
        }

    }

}
