// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceDeviceGroupsByDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceDeviceGroupsByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceDeviceGroupsByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceDeviceGroupsByDeviceResponseBody self = new QueryFaceDeviceGroupsByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setData(QueryFaceDeviceGroupsByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceDeviceGroupsByDeviceResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList extends TeaModel {
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("DeviceGroupName")
        public String deviceGroupName;

        public static QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList self = new QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

    }

    public static class QueryFaceDeviceGroupsByDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceGroupList")
        public java.util.List<QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList> deviceGroupList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryFaceDeviceGroupsByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceDeviceGroupsByDeviceResponseBodyData self = new QueryFaceDeviceGroupsByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyData setDeviceGroupList(java.util.List<QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList> deviceGroupList) {
            this.deviceGroupList = deviceGroupList;
            return this;
        }
        public java.util.List<QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList> getDeviceGroupList() {
            return this.deviceGroupList;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
