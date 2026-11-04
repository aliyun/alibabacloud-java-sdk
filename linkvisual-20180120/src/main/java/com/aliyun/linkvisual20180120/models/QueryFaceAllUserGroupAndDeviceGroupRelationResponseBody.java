// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody extends TeaModel {
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
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData data;

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
     * <p>Indicates whether the API call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setData(QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList extends TeaModel {
        /**
         * <p>The control ID of the synchronization relationship between the user group and the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>ni1iyxqry0j0****</p>
         */
        @NameInMap("ControlId")
        public String controlId;

        /**
         * <p>The face synchronization relationship type, which synchronizes user photos and user information.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC_INFO_PICTURE</p>
         */
        @NameInMap("ControlType")
        public String controlType;

        /**
         * <p>The device group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDeviceGro****</p>
         */
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12 17:12:37</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserGro****</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setControlId(String controlId) {
            this.controlId = controlId;
            return this;
        }
        public String getControlId() {
            return this.controlId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setControlType(String controlType) {
            this.controlType = controlType;
            return this;
        }
        public String getControlType() {
            return this.controlType;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

    public static class QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData extends TeaModel {
        /**
         * <p>The list of face synchronization relationships between user groups and device groups.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData self = new QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setList(java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserGroupAndDeviceGroupRelationResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
