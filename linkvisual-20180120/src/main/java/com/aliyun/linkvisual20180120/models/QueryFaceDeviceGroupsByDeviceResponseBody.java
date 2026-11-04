// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceDeviceGroupsByDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryFaceDeviceGroupsByDeviceResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceDeviceGroupsByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceDeviceGroupsByDeviceResponseBody self = new QueryFaceDeviceGroupsByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryFaceDeviceGroupsByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceDeviceGroupsByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList extends TeaModel {
        /**
         * <p>The device group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDeviceGroupId</p>
         */
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        /**
         * <p>The device group name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDeviceGroupName</p>
         */
        @NameInMap("DeviceGroupName")
        public String deviceGroupName;

        /**
         * <p>The time when the device group was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12 17:12:37</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

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

        public QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceDeviceGroupsByDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The list of device groups.</p>
         */
        @NameInMap("DeviceGroupList")
        public java.util.List<QueryFaceDeviceGroupsByDeviceResponseBodyDataDeviceGroupList> deviceGroupList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of device groups.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
