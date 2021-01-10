// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceAllDeviceGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllDeviceGroupResponseBody self = new QueryFaceAllDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllDeviceGroupResponseBody setData(QueryFaceAllDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceAllDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList extends TeaModel {
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("DeviceGroupName")
        public String deviceGroupName;

        public static QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList self = new QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

    }

    public static class QueryFaceAllDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("DeviceGroupList")
        public java.util.List<QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList> deviceGroupList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryFaceAllDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllDeviceGroupResponseBodyData self = new QueryFaceAllDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllDeviceGroupResponseBodyData setDeviceGroupList(java.util.List<QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList> deviceGroupList) {
            this.deviceGroupList = deviceGroupList;
            return this;
        }
        public java.util.List<QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList> getDeviceGroupList() {
            return this.deviceGroupList;
        }

        public QueryFaceAllDeviceGroupResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceAllDeviceGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllDeviceGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
