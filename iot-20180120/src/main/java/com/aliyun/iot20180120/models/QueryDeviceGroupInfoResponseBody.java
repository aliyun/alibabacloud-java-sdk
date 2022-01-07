// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceGroupInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoResponseBody self = new QueryDeviceGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupInfoResponseBody setData(QueryDeviceGroupInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceGroupInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryDeviceGroupInfoResponseBodyData extends TeaModel {
        @NameInMap("DeviceActive")
        public Integer deviceActive;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("DeviceOnline")
        public Integer deviceOnline;

        @NameInMap("GroupDesc")
        public String groupDesc;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static QueryDeviceGroupInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupInfoResponseBodyData self = new QueryDeviceGroupInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupInfoResponseBodyData setDeviceActive(Integer deviceActive) {
            this.deviceActive = deviceActive;
            return this;
        }
        public Integer getDeviceActive() {
            return this.deviceActive;
        }

        public QueryDeviceGroupInfoResponseBodyData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryDeviceGroupInfoResponseBodyData setDeviceOnline(Integer deviceOnline) {
            this.deviceOnline = deviceOnline;
            return this;
        }
        public Integer getDeviceOnline() {
            return this.deviceOnline;
        }

        public QueryDeviceGroupInfoResponseBodyData setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QueryDeviceGroupInfoResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupInfoResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryDeviceGroupInfoResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
