// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySolutionDeviceGroupPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.tcloud.ProjectNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySolutionDeviceGroupPageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>project not found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySolutionDeviceGroupPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionDeviceGroupPageResponseBody self = new QuerySolutionDeviceGroupPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySolutionDeviceGroupPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySolutionDeviceGroupPageResponseBody setData(QuerySolutionDeviceGroupPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySolutionDeviceGroupPageResponseBodyData getData() {
        return this.data;
    }

    public QuerySolutionDeviceGroupPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySolutionDeviceGroupPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySolutionDeviceGroupPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySolutionDeviceGroupPageResponseBodyDataListItemName extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DeviceCount")
        public Long deviceCount;

        /**
         * <strong>example:</strong>
         * <p>1356565656</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1357865658</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("GroupDesc")
        public String groupDesc;

        /**
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>test***</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static QuerySolutionDeviceGroupPageResponseBodyDataListItemName build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseBodyDataListItemName self = new QuerySolutionDeviceGroupPageResponseBodyDataListItemName();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGroupDesc(String groupDesc) {
            this.groupDesc = groupDesc;
            return this;
        }
        public String getGroupDesc() {
            return this.groupDesc;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataListItemName setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QuerySolutionDeviceGroupPageResponseBodyDataList extends TeaModel {
        @NameInMap("itemName")
        public java.util.List<QuerySolutionDeviceGroupPageResponseBodyDataListItemName> itemName;

        public static QuerySolutionDeviceGroupPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseBodyDataList self = new QuerySolutionDeviceGroupPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseBodyDataList setItemName(java.util.List<QuerySolutionDeviceGroupPageResponseBodyDataListItemName> itemName) {
            this.itemName = itemName;
            return this;
        }
        public java.util.List<QuerySolutionDeviceGroupPageResponseBodyDataListItemName> getItemName() {
            return this.itemName;
        }

    }

    public static class QuerySolutionDeviceGroupPageResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySolutionDeviceGroupPageResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySolutionDeviceGroupPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySolutionDeviceGroupPageResponseBodyData self = new QuerySolutionDeviceGroupPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setList(QuerySolutionDeviceGroupPageResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySolutionDeviceGroupPageResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySolutionDeviceGroupPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
