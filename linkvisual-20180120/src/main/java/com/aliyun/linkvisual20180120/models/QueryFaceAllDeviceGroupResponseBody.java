// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllDeviceGroupResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned by the API operation.</p>
     */
    @NameInMap("Data")
    public QueryFaceAllDeviceGroupResponseBodyData data;

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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllDeviceGroupResponseBody self = new QueryFaceAllDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryFaceAllDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList extends TeaModel {
        /**
         * <p>The ID of the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>wy250q0m</p>
         */
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        /**
         * <p>The name of the device group.</p>
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
         * <p>2020-05-12 17:19:29</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

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

        public QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceAllDeviceGroupResponseBodyData extends TeaModel {
        /**
         * <p>The list of device groups.</p>
         */
        @NameInMap("DeviceGroupList")
        public java.util.List<QueryFaceAllDeviceGroupResponseBodyDataDeviceGroupList> deviceGroupList;

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
         * <p>100</p>
         */
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
