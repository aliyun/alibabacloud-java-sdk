// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllDeviceGroupResponse extends TeaModel {
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
    public QueryFaceAllDeviceGroupResponseData data;

    public static QueryFaceAllDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllDeviceGroupResponse self = new QueryFaceAllDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllDeviceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllDeviceGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceAllDeviceGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllDeviceGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllDeviceGroupResponse setData(QueryFaceAllDeviceGroupResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllDeviceGroupResponseData getData() {
        return this.data;
    }

    public static class QueryFaceAllDeviceGroupResponseDataDeviceGroupList extends TeaModel {
        @NameInMap("DeviceGroupId")
        @Validation(required = true)
        public String deviceGroupId;

        @NameInMap("DeviceGroupName")
        @Validation(required = true)
        public String deviceGroupName;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static QueryFaceAllDeviceGroupResponseDataDeviceGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllDeviceGroupResponseDataDeviceGroupList self = new QueryFaceAllDeviceGroupResponseDataDeviceGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllDeviceGroupResponseDataDeviceGroupList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceAllDeviceGroupResponseDataDeviceGroupList setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public QueryFaceAllDeviceGroupResponseDataDeviceGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceAllDeviceGroupResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("DeviceGroupList")
        @Validation(required = true)
        public java.util.List<QueryFaceAllDeviceGroupResponseDataDeviceGroupList> deviceGroupList;

        public static QueryFaceAllDeviceGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllDeviceGroupResponseData self = new QueryFaceAllDeviceGroupResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllDeviceGroupResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceAllDeviceGroupResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceAllDeviceGroupResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllDeviceGroupResponseData setDeviceGroupList(java.util.List<QueryFaceAllDeviceGroupResponseDataDeviceGroupList> deviceGroupList) {
            this.deviceGroupList = deviceGroupList;
            return this;
        }
        public java.util.List<QueryFaceAllDeviceGroupResponseDataDeviceGroupList> getDeviceGroupList() {
            return this.deviceGroupList;
        }

    }

}
