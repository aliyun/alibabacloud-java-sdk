// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceDeviceGroupsByDeviceResponse extends TeaModel {
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
    public QueryFaceDeviceGroupsByDeviceResponseData data;

    public static QueryFaceDeviceGroupsByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceDeviceGroupsByDeviceResponse self = new QueryFaceDeviceGroupsByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceDeviceGroupsByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceDeviceGroupsByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceDeviceGroupsByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceDeviceGroupsByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceDeviceGroupsByDeviceResponse setData(QueryFaceDeviceGroupsByDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceDeviceGroupsByDeviceResponseData getData() {
        return this.data;
    }

    public static class QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList extends TeaModel {
        @NameInMap("DeviceGroupId")
        @Validation(required = true)
        public String deviceGroupId;

        @NameInMap("DeviceGroupName")
        @Validation(required = true)
        public String deviceGroupName;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList self = new QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceDeviceGroupsByDeviceResponseData extends TeaModel {
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
        public java.util.List<QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList> deviceGroupList;

        public static QueryFaceDeviceGroupsByDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceDeviceGroupsByDeviceResponseData self = new QueryFaceDeviceGroupsByDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceDeviceGroupsByDeviceResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceDeviceGroupsByDeviceResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceDeviceGroupsByDeviceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceDeviceGroupsByDeviceResponseData setDeviceGroupList(java.util.List<QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList> deviceGroupList) {
            this.deviceGroupList = deviceGroupList;
            return this;
        }
        public java.util.List<QueryFaceDeviceGroupsByDeviceResponseDataDeviceGroupList> getDeviceGroupList() {
            return this.deviceGroupList;
        }

    }

}
